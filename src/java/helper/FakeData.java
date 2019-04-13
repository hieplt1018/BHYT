/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author HOANG
 */
public class FakeData {
    public String getHo(){
        List<String> list = new ArrayList<>();
        list.add("Hoàng");
        list.add("Nguyễn");
        list.add("Lê");
        list.add("Đào");
        list.add("Phạm");
        list.add("Trần");
        list.add("Vũ");
        list.add("Đặng");
        list.add("Đỗ");
        return list.get(new Random().nextInt(9));
    }
    
    public String getDem(){
        List<String> list = new ArrayList<>();
        list.add("Thị");
        list.add("Văn");
        list.add("");
        list.add("Tuấn");
        list.add("Minh");
        list.add("Thế");
        list.add("Hồng");
        list.add("Anh");
        list.add("Ngọc");
        return list.get(new Random().nextInt(9));
    }
    
    public String getTen(){
        List<String> list = new ArrayList<>();
        list.add("Đức");
        list.add("Bảo");
        list.add("Hiệp");
        list.add("Duyên");
        list.add("Duy");
        list.add("Hải");
        list.add("Phương");
        list.add("Thanh");
        list.add("Mai");
        list.add("Hương");
        list.add("Phượng");
        list.add("Ly");
        list.add("Cúc");
        return list.get(new Random().nextInt(13));
    }
    
    public String getMien(){
        List<String> list = new ArrayList<>();
        list.add("Miền Bắc");
        list.add("Miền Trung");
        list.add("Miền Nam");
        return list.get(new Random().nextInt(3));
    }
    
    public String getVung(String mien){
        List<String> list = new ArrayList<>();
        list.add("Tây Bắc Bộ");
        list.add("Đông Bắc Bộ");
        list.add("Đồng bằng sông Hồng");
        list.add("Bắc Trung Bộ");
        list.add("Nam Trung Bộ");
        list.add("Tây Nguyên");
        list.add("Đông Nam Bộ");
        list.add("Đồng bằng sông Cửu Long");
        if (mien.compareTo("Miền Bắc")==0){
            return list.get(new Random().nextInt(3));
        } else if (mien.compareTo("Miền Trung")==0){
            return list.get(3+new Random().nextInt(3));
        } else {
            return list.get(6+new Random().nextInt(2));
        }
    }
    
    public String getThanhPho(String vung){
        List<String> tinh = new ArrayList<>();
        //0-4
        tinh.add("Lào Cai");
        tinh.add("Yên Bái");
        tinh.add("Điện Biên");
        tinh.add("Lai Châu");
        tinh.add("Sơn La");
        //5-14
        tinh.add("Hà Giang");
        tinh.add("Cao Bằng");
        tinh.add("Bắc Kạn");
        tinh.add("Lạng Sơn");
        tinh.add("Tuyên Quang");
        tinh.add("Hòa Bình");
        tinh.add("Thái Nguyên");
        tinh.add("Quảng Ninh");
        tinh.add("Bắc Giang");
        tinh.add("Phú Thọ");
        //15-24
        tinh.add("Hà Nội");
        tinh.add("Vĩnh Phúc");
        tinh.add("Bắc Ninh");
        tinh.add("Hải Dương");
        tinh.add("Hải Phòng");
        tinh.add("Hưng Yên");
        tinh.add("Thái Bình");
        tinh.add("Hà Nam");
        tinh.add("Nam Định");
        tinh.add("Ninh Bình");
        //25-30
        tinh.add("Thanh Hóa");
        tinh.add("Nghệ An");
        tinh.add("Hà Tĩnh");
        tinh.add("Quảng Bình");
        tinh.add("Quảng Trị");
        tinh.add("Thừa Thiên Huế");
        //31-38
        tinh.add("Đà Nẵng");
        tinh.add("Quảng Nam");
        tinh.add("Quảng Ngãi");
        tinh.add("Bình Định");
        tinh.add("Phú Yên");
        tinh.add("Khánh Hòa");
        tinh.add("Ninh Thuận");
        tinh.add("Bình Thuận");
        //39-43
        tinh.add("Kon Tum");
        tinh.add("Gia Lai");
        tinh.add("Đắk Lắk");
        tinh.add("Đắk Nông");
        tinh.add("Lâm Đồng");
        //44-49
        tinh.add("Bình Phước");
        tinh.add("Tây Ninh");
        tinh.add("Bình Dương");
        tinh.add("Đồng Nai");
        tinh.add("Bà Rịa, Vũng Tàu");
        tinh.add("Hồ Chí Minh");
        //50-62
        tinh.add("Long An");
        tinh.add("Tiền Giang");
        tinh.add("Bến Tre");
        tinh.add("Trà Vinh");
        tinh.add("Vĩnh Long");
        tinh.add("Đồng Tháp");
        tinh.add("An Giang");
        tinh.add("Kiên Giang");
        tinh.add("Cần Thơ");
        tinh.add("Hậu Giang");
        tinh.add("Sóc Trăng");
        tinh.add("Bạc Liêu");
        tinh.add("Cà Mau");
     
        if (vung.compareTo("Tây Bắc Bộ")==0){
            return tinh.get(new Random().nextInt(5));
        } 
        else if (vung.compareTo("Đông Bắc Bộ")==0){
            return tinh.get(5+new Random().nextInt(10));
        } 
        else if (vung.compareTo("Đồng bằng sông Hồng")==0){
            return tinh.get(15+new Random().nextInt(10));
        }
        else if (vung.compareTo("Bắc Trung Bộ")==0){
            return tinh.get(25+new Random().nextInt(6));
        }
        else if (vung.compareTo("Nam Trung Bộ")==0){
            return tinh.get(31+new Random().nextInt(8));
        }
        else if (vung.compareTo("Tây Nguyên")==0){
            return tinh.get(39+new Random().nextInt(5));
        }
        else if (vung.compareTo("Đông Nam Bộ")==0){
            return tinh.get(44+new Random().nextInt(6));
        }
        else {
            return tinh.get(50+new Random().nextInt(13));
        }
    }
    
    public String getQuan(){
        List<String> list = new ArrayList<>();
        list.add("Hà Đông");
        list.add("Hoàn Kiếm");
        list.add("Câù Giấy");
        list.add("Thanh Xuân");
        list.add("Đống Đa");
        list.add("Long Biên");
        list.add("Gia Lâm");
        list.add("Chương Mỹ");
        list.add("Mỹ Đức");
        list.add("Mê Linh");
        list.add("Sóc Sơn");
        list.add("Ứng Hòa");
        list.add("Thanh Oai");
        return list.get(new Random().nextInt(13));
    }
    
    public String getPhuong(){
        List<String> list = new ArrayList<>();
        list.add("Mỗ Lao");
        list.add("Ngô Thì Nhậm");
        list.add("Khâm Thiên");
        list.add("Đồng Xuân");
        list.add("Xuân Trường");
        list.add("Hạ Hồi");
        list.add("Hồng Đức");
        list.add("Dự Kế");
        list.add("Trúc Bạch");
        list.add("Hoàng Hóa");
        list.add("Phù Đổng");
        list.add("Yên Đồng");
        list.add("Bồ Đề");
        return list.get(new Random().nextInt(13));
    }
    
    public String getThon(){
        return "Thôn "+ new Random().nextInt(10);
    }
    
    public int getSoNguoiTrongHo(){
        return 1+ new Random().nextInt(5);
    }
    
    public String getLoaiBHYT(){
        List<String> list = new ArrayList<>();
        list.add("HSSV");   //ho tro 30
        list.add("Hộ cận nghèo");   //ho tro 70
        list.add("Hộ nông lâm ngư nghiệp thu nhập trung bình");    // ho tro 50%
        list.add("Người lao động"); //4,5% luong
        list.add("Hộ gia đình");    //
        list.add("BHXH đóng");  //4.5%
        list.add("Nhà nước đóng"); //4.5%
        return list.get(new Random().nextInt(7));
    }
    
    public String getLoaiBHYTVietTat(String loaiBHYT){
        if (loaiBHYT.equals("HSSV")){
            return "SV";
        } else if (loaiBHYT.equals("Hộ cận nghèo")){
            return "CN";
        } else if (loaiBHYT.equals("Hộ nông lâm ngư nghiệp thu nhập trung bình")){
            return "NL";
        } else if (loaiBHYT.equals("Người lao động")){
            return "LD";
        } else if (loaiBHYT.equals("Hộ gia đình")){
            return "GD";
        } else if (loaiBHYT.equals("BHXH đóng")){
            return "XH";
        } else {
            return "NN";
        } 
    }
    
    public Date getNgaySinh(){
        int ngay = 1+new Random().nextInt(28);
        int thang = new Random().nextInt(12);
        int nam = 80+ new Random().nextInt(30);
        Date date = new Date(nam,thang,ngay);
        return date;
    }
    
    public Date getNgayDong(){
        int ngay = 1+new Random().nextInt(28);
        int thang = new Random().nextInt(12);
        int nam = 115+ new Random().nextInt(4);
//        int nam = 117;
        Date date = new Date(nam,thang,ngay);
        return date;
    }
    public int getLuong(){
        return (5000+new Random().nextInt(30000))*1000;
    }
    public static void main(String[] args) {
        FakeData fakeData = new FakeData();
//        for (int i=0;i<10;i++){
//            System.out.println(fakeData.getLuong());
//        }
//        System.out.println(100*4.5);
        System.out.println(fakeData.getTen());
    }
}
