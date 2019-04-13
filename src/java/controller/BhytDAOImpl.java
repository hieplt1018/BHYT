/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connectdb.ConnectDB;
import helper.Config;
import helper.FakeData;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import model.BHYT;

/**
 *
 * @author HOANG
 */
public class BhytDAOImpl implements BhytDAO{
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private ConnectDB connectdb;

    public BhytDAOImpl() {
        this.connectdb = new ConnectDB();
    }
    
    @Override
public boolean insert(BHYT bhyt) {
        String sql = "INSERT INTO bhyt VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            stmt = connectdb.openConnect().prepareStatement(sql);
            stmt.setString(1, bhyt.getMaTheBHYT());
            stmt.setString(2, bhyt.getHoTen());
            stmt.setString(3, bhyt.getLoaiBHYT());
            stmt.setDouble(4, bhyt.getTienBHYT());
            stmt.setDate(5, bhyt.getNgaySinh());
            stmt.setString(6, bhyt.getVung());
            stmt.setString(7, bhyt.getMien());
            stmt.setString(8, bhyt.getThanhPho());
            stmt.setString(9, bhyt.getQuanHuyen());
            stmt.setString(10, bhyt.getXaPhuong());
            stmt.setString(11, bhyt.getThonXom());
            stmt.setInt(12, bhyt.getSoNguoiTrongHo());
            stmt.setDate(13, bhyt.getNgayDongBHYT());
            stmt.executeUpdate();
            //System.out.println("Insert successful!");
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Loi insert bhyt!");
        } finally{
            //connectdb.closeConnect();
        }
        return false;
    }

    @Override
    public boolean update(BHYT bhyt) {
        String sql = "UPDATE bhyt SET HoTen=?, LoaiBHYT=?, TienBHYT=?, NgaySinh=?, Vung=?, Mien=?, "
                + "ThanhPho=?, Quan=?, Phuong=?,Thon=?, NguoiTrongHoGD=?, NgayDong=? WHERE MaTheBHYT=?";
        try {
            stmt = connectdb.openConnect().prepareStatement(sql);
            stmt.setString(13, bhyt.getMaTheBHYT());
            stmt.setString(1, bhyt.getHoTen());
            stmt.setString(2, bhyt.getLoaiBHYT());
            stmt.setDouble(3, bhyt.getTienBHYT());
            stmt.setDate(4, bhyt.getNgaySinh());
            stmt.setString(5, bhyt.getVung());
            stmt.setString(6, bhyt.getMien());
            stmt.setString(7, bhyt.getThanhPho());
            stmt.setString(8, bhyt.getQuanHuyen());
            stmt.setString(9, bhyt.getXaPhuong());
            stmt.setString(10, bhyt.getThonXom());
            stmt.setInt(11, bhyt.getSoNguoiTrongHo());
            stmt.setDate(12, bhyt.getNgayDongBHYT());
            stmt.executeUpdate();
            System.out.println("Update successful!");
            return true;
        } catch (SQLException ex) {
            System.out.println("Loi update bhyt!");
        } finally{
            //connectdb.closeConnect();
        }
        return false;
    }

    @Override
    public boolean delete(String maTheBHYT) {
        String sql = "DELETE FROM bhyt WHERE MaTheBHYT=?";
        try {
            stmt = connectdb.openConnect().prepareStatement(sql);
            stmt.setString(1, maTheBHYT);
            stmt.executeUpdate();
            System.out.println("Delete successful!");
            return true;
        } catch (SQLException ex) {
            System.out.println("Loi delete bhyt!");
        } finally{
            //connectdb.closeConnect();
        }
        return false;
    }
    
    public void genData(){
        FakeData fakeData = new FakeData();
        int sl = 10;
        for (int i=0;i<800;i++){
            String maThe = new String();
            String loaiBHYT = fakeData.getLoaiBHYT();
            maThe += fakeData.getLoaiBHYTVietTat(loaiBHYT)+ ((1+new Random().nextInt(5))+"")
                    +(((10+new Random().nextInt(89))+""))+String.format("%010d", i);
            String hoTen = fakeData.getHo()+" "+fakeData.getDem()+" "+fakeData.getTen();
            Date ngaySinh = fakeData.getNgaySinh();
            String mien = fakeData.getMien();
            String vung = fakeData.getVung(mien);
            String thanhPho = fakeData.getThanhPho(vung);
            String quanHuyen = fakeData.getQuan();
            String xaPhuong = fakeData.getPhuong();
            String thonXom = fakeData.getThon();
            int soNguoi = 0;
            if (loaiBHYT.equals("Hộ gia đình")){
                soNguoi = 1+new Random().nextInt(9);
            }
            Date ngayDong = fakeData.getNgayDong();
            int tienBHYT = new BhytDAOImpl().tinhBHYT(loaiBHYT, fakeData.getLuong(), soNguoi);
            BHYT bhyt = new BHYT(maThe,hoTen , loaiBHYT, tienBHYT, ngaySinh, vung, mien, thanhPho, quanHuyen, xaPhuong, thonXom, soNguoi, ngayDong);
            insert(bhyt);
        }
        System.out.println("Gen data success!");
    }

    @Override
    public int tinhBHYT(String loaiDoiTuong, int luong, int soNguoi) {
        int soTien = 0;
        Config config = new Config();
        config.docFile();
        int soTienNguoiChuHo = (int)(config.getLuongCoSo()*config.getPhanTramLuong()/100);
        if (loaiDoiTuong.equals("Người lao động")||loaiDoiTuong.equals("BHXH đóng")||loaiDoiTuong.equals("Nhà nước đóng")){ //4.5
            soTien = (int)(luong*config.getPhanTramLuong()/100);
        } else if (loaiDoiTuong.equals("HSSV")){ //30
            soTien = (int)(config.getLuongCoSo()*(100-config.getPhanTramHoTroHSSV())/100);
        } else if (loaiDoiTuong.equals("Hộ cận nghèo")){ //70
            soTien = (int)(config.getLuongCoSo()*(100-config.getPhanTramHoTroCanNgheo())/100);
        } else if (loaiDoiTuong.equals("Hộ nông lâm ngư nghiệp thu nhập trung bình")){ //50
            soTien = (int)(config.getLuongCoSo()*(100-config.getPhanTramHoTroNongLamNgu())/100);
        } else {    //ho gia dinh
            if (soNguoi==1){
                soTien = (int)(soTienNguoiChuHo + soTienNguoiChuHo*config.getPhanTramHoGDMotNguoiPhuThuoc()/100);
            } else if(soNguoi == 2) {
                soTien = (int)(soTienNguoiChuHo + soTienNguoiChuHo*config.getPhanTramHoGDMotNguoiPhuThuoc()/100
                        + soTienNguoiChuHo*config.getPhanTramHoGDHaiNguoiPhuThuoc()/100);
            } else if(soNguoi == 3) {
                soTien = (int)(soTienNguoiChuHo + soTienNguoiChuHo*config.getPhanTramHoGDMotNguoiPhuThuoc()/100 
                        + soTienNguoiChuHo*config.getPhanTramHoGDHaiNguoiPhuThuoc()/100 
                        + soTienNguoiChuHo*config.getPhanTramHoGDBaNguoiPhuThuoc()/100);
            } else if(soNguoi == 4) {
                soTien = (int)(soTienNguoiChuHo + soTienNguoiChuHo*config.getPhanTramHoGDMotNguoiPhuThuoc()/100 
                        + soTienNguoiChuHo*config.getPhanTramHoGDHaiNguoiPhuThuoc()/100 
                        + soTienNguoiChuHo*config.getPhanTramHoGDBaNguoiPhuThuoc()/100
                        + soTienNguoiChuHo*config.getPhanTramHoGDBonNguoiPhuThuoc()/100);
            } else {
                soTien = (int)(soTienNguoiChuHo + soTienNguoiChuHo*config.getPhanTramHoGDMotNguoiPhuThuoc()/100 
                        + soTienNguoiChuHo*config.getPhanTramHoGDHaiNguoiPhuThuoc()/100 
                        + soTienNguoiChuHo*config.getPhanTramHoGDBaNguoiPhuThuoc()/100
                        + soTienNguoiChuHo*config.getPhanTramHoGDBonNguoiPhuThuoc()/100
                        + soNguoi*soTienNguoiChuHo*config.getPhanTramHoGDNamVaLonHonNguoiPhuThuoc()/100);
            }
        }
        return soTien;
    }

    @Override
    public ArrayList<BHYT> get(int soluong) {
        ArrayList<BHYT> list = new ArrayList<>();
        String sql = "select * from bhyt ORDER BY RAND() limit " + soluong;
        try {
            rs = connectdb.getStatement().executeQuery(sql);
            while(rs.next() && soluong-- > 0){
                BHYT bhyt = new BHYT();
                bhyt.setHoTen(rs.getString("HoTen"));
                bhyt.setMaTheBHYT(rs.getString("MaTheBHYT"));
                bhyt.setMien(rs.getString("Mien"));
                bhyt.setLoaiBHYT(rs.getString("LoaiBHYT"));
                bhyt.setNgayDongBHYT(rs.getDate("NgayDong"));
                bhyt.setNgaySinh(rs.getDate("NgaySinh"));
                bhyt.setQuanHuyen(rs.getString("Quan"));
                bhyt.setSoNguoiTrongHo(rs.getInt("NguoiTrongHoGD"));
                bhyt.setThanhPho(rs.getString("ThanhPho"));
                bhyt.setThonXom(rs.getString("Thon"));
                bhyt.setTienBHYT(rs.getInt("TienBHYT"));
                bhyt.setVung(rs.getString("Vung"));
                bhyt.setXaPhuong(rs.getString("Phuong"));
                list.add(bhyt);
            } 
        } catch (SQLException ex) {
            System.out.println("Catch getListBHYT function");
        } finally{
            connectdb.closeConnect();
        }
        return list;
    }
    
    public static void main(String[] args) {
        BhytDAOImpl dao = new BhytDAOImpl();
//        System.out.println("");
//        dao.genData();
//        ArrayList<BHYT> list = dao.get(1);
//        System.out.println(list);
//        System.out.println(dao.getSoLuongTheoMien("Trung"));
//        System.out.println(dao.getSoLuongTheoMien("Nam"));
//        System.out.println(dao.getSoLuongTheoMien("Bắc"));
//        System.out.println(dao.getSoLuongTheoVung("Đông Bắc Bộ"));
//        System.out.println(dao.getSoLuongTheoVung("Tây Bắc Bộ"));
        System.out.println(dao.getTienBHYTTheoNam("2018"));
        
    }

    @Override
    public int getSoLuongNguoi() {
        String sql = "select count(*) from bhyt";
        try {
            rs = connectdb.getStatement().executeQuery(sql);
            while(rs.next()){
                int soluong = rs.getInt("count(*)");
                return soluong;
            }
        } catch (SQLException ex) {
            System.out.println("Catch getSoLuongNguoi function failed!");
        } finally{
//            connectdb.closeConnect();
        }
        return 0;
    }

    @Override
    public int getSoLuongTheoMien(String mien) {
        String sql = "select count(*) from bhyt where Mien like '%" + mien + "%'";
        try {
            rs = connectdb.getStatement().executeQuery(sql);
            while(rs.next()){
                int soluong = rs.getInt("count(*)");
                return soluong;
            }
        } catch (SQLException ex) {
            System.out.println("Catch getSoLuongNguoiTheoMien function failed!");
        } finally{
//            connectdb.closeConnect();
        }
        return 0;
    }

    @Override
    public int getSoLuongTheoVung(String vung) {
        String sql = "select count(*) from bhyt where Vung like '%" + vung+ "%'";
        try {
            rs = connectdb.getStatement().executeQuery(sql);
            while(rs.next()){
                int soluong = rs.getInt("count(*)");
                return soluong;
            }
        } catch (SQLException ex) {
            System.out.println("Catch getSoLuongNguoiTheoVung function failed!");
        } finally{
//            connectdb.closeConnect();
        }
        return 0;
    }

    @Override
    public int getSoLuongTheoLoai(String loai, String year) {
        String sql = "select count(*) from bhyt where LoaiBHYT like '%" + loai+ "%' and year(NgayDong) = " + year;
        try {
            rs = connectdb.getStatement().executeQuery(sql);
            while(rs.next()){
                int soluong = rs.getInt("count(*)");
                return soluong;
            }
        } catch (SQLException ex) {
            System.out.println("Catch getSoLuongNguoiTheoLoai function failed!");
        } finally{
//            connectdb.closeConnect();
        }
        return 0;
    }

    @Override
    public int getSoLuongTheoNam(String year) {
        String sql = "select count(*) from bhyt where year(NgayDong) = " + year;
        try {
            rs = connectdb.getStatement().executeQuery(sql);
            while(rs.next()){
                int soluong = rs.getInt("count(*)");
                return soluong;
            }
        } catch (SQLException ex) {
            System.out.println("Catch getSoLuongNguoiTheoNam() failed!");
        } finally{
//            connectdb.closeConnect();
        }
        return 0;
    }

    @Override
    public int getSoLuongTheoLoaiTatCa(String loai) {
        String sql = "select count(*) from bhyt where LoaiBHYT like '%" + loai+ "%'";
        try {
            rs = connectdb.getStatement().executeQuery(sql);
            while(rs.next()){
                int soluong = rs.getInt("count(*)");
                return soluong;
            }
        } catch (SQLException ex) {
            System.out.println("Catch getSoLuongNguoiTheoLoaiTatCa() failed!");
        } finally{
//            connectdb.closeConnect();
        }
        return 0;
    }

    @Override
    public long getTongTienBHYT() {
        String sql = "select sum(TienBHYT) from bhyt";
        try {
            rs = connectdb.getStatement().executeQuery(sql);
            while(rs.next()){
                long soluong = rs.getInt("sum(TienBHYT)");
                return soluong;
            }
        } catch (SQLException ex) {
            System.out.println("Catch getTongTienBHYT() failed!");
        } finally{
//            connectdb.closeConnect();
        }
        return 0;
    }

    @Override
    public long getTienBHYTTheoNam(String year) {
        String sql = "select sum(TienBHYT) from bhyt where year(NgayDong) = " + year;
        try {
            rs = connectdb.getStatement().executeQuery(sql);
            while(rs.next()){
                long soluong = rs.getInt("sum(TienBHYT)");
                return soluong;
            }
        } catch (SQLException ex) {
            System.out.println("Catch getTienBHYTTheoNam() failed!");
        } finally{
//            connectdb.closeConnect();
        }
        return 0;
    }

    @Override
    public ArrayList<BHYT> getTheoNam(String year, int soLuong) {
        ArrayList<BHYT> list = new ArrayList<>();
        String sql = "select * from bhyt where year(NgayDong) = " + year +" limit " + soLuong;
        try {
            rs = connectdb.getStatement().executeQuery(sql);
            while(rs.next() && soLuong-- > 0){
                BHYT bhyt = new BHYT();
                bhyt.setHoTen(rs.getString("HoTen"));
                bhyt.setMaTheBHYT(rs.getString("MaTheBHYT"));
                bhyt.setMien(rs.getString("Mien"));
                bhyt.setLoaiBHYT(rs.getString("LoaiBHYT"));
                bhyt.setNgayDongBHYT(rs.getDate("NgayDong"));
                bhyt.setNgaySinh(rs.getDate("NgaySinh"));
                bhyt.setQuanHuyen(rs.getString("Quan"));
                bhyt.setSoNguoiTrongHo(rs.getInt("NguoiTrongHoGD"));
                bhyt.setThanhPho(rs.getString("ThanhPho"));
                bhyt.setThonXom(rs.getString("Thon"));
                bhyt.setTienBHYT(rs.getInt("TienBHYT"));
                bhyt.setVung(rs.getString("Vung"));
                bhyt.setXaPhuong(rs.getString("Phuong"));
                list.add(bhyt);
            } 
        } catch (SQLException ex) {
            System.out.println("Catch getListBHYT function");
        } finally{
            connectdb.closeConnect();
        }
        return list;
    }
}


