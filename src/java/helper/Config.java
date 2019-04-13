/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOANG
 */
public class Config {
//    public static final double luongCoSoMoi = 1490000;  //tu 01/7/2109
//    public static final double luongCoSoCu = 1390000;   //truoc 01/7/2019
//    public static final double phanTramLuong = 4.5;
//    public static final double phanTramHoTroHSSV = 30;
//    public static final double phanTramHoTroNongLamNgu = 50;
//    public static final double phanTramHoTroCanNgheo = 70;

    private int luongCoSo;
    private double phanTramLuong;
    private double phanTramHoTroHSSV;
    private double phanTramHoTroNongLamNgu;
    private double phanTramHoTroCanNgheo;
    private double phanTramHoGDMotNguoiPhuThuoc;
    private double phanTramHoGDHaiNguoiPhuThuoc;
    private double phanTramHoGDBaNguoiPhuThuoc;
    private double phanTramHoGDBonNguoiPhuThuoc;
    private double phanTramHoGDNamVaLonHonNguoiPhuThuoc;

    public Config() {
    }

    public Config(int luongCoSo, double phanTramLuong, double phanTramHoTroHSSV, double phanTramHoTroNongLamNgu, double phanTramHoTroCanNgheo, double phanTramHoGDMotNguoiPhuThuoc, double phanTramHoGDHaiNguoiPhuThuoc, double phanTramHoGDBaNguoiPhuThuoc, double phanTramHoGDBonNguoiPhuThuoc, double phanTramHoGDNamVaLonHonNguoiPhuThuoc) {
        this.luongCoSo = luongCoSo;
        this.phanTramLuong = phanTramLuong;
        this.phanTramHoTroHSSV = phanTramHoTroHSSV;
        this.phanTramHoTroNongLamNgu = phanTramHoTroNongLamNgu;
        this.phanTramHoTroCanNgheo = phanTramHoTroCanNgheo;
        this.phanTramHoGDMotNguoiPhuThuoc = phanTramHoGDMotNguoiPhuThuoc;
        this.phanTramHoGDHaiNguoiPhuThuoc = phanTramHoGDHaiNguoiPhuThuoc;
        this.phanTramHoGDBaNguoiPhuThuoc = phanTramHoGDBaNguoiPhuThuoc;
        this.phanTramHoGDBonNguoiPhuThuoc = phanTramHoGDBonNguoiPhuThuoc;
        this.phanTramHoGDNamVaLonHonNguoiPhuThuoc = phanTramHoGDNamVaLonHonNguoiPhuThuoc;
    }

    public double getPhanTramHoGDMotNguoiPhuThuoc() {
        return phanTramHoGDMotNguoiPhuThuoc;
    }

    public void setPhanTramHoGDMotNguoiPhuThuoc(double phanTramHoGDMotNguoiPhuThuoc) {
        this.phanTramHoGDMotNguoiPhuThuoc = phanTramHoGDMotNguoiPhuThuoc;
    }

    public double getPhanTramHoGDHaiNguoiPhuThuoc() {
        return phanTramHoGDHaiNguoiPhuThuoc;
    }

    public void setPhanTramHoGDHaiNguoiPhuThuoc(double phanTramHoGDHaiNguoiPhuThuoc) {
        this.phanTramHoGDHaiNguoiPhuThuoc = phanTramHoGDHaiNguoiPhuThuoc;
    }

    public double getPhanTramHoGDBaNguoiPhuThuoc() {
        return phanTramHoGDBaNguoiPhuThuoc;
    }

    public void setPhanTramHoGDBaNguoiPhuThuoc(double phanTramHoGDBaNguoiPhuThuoc) {
        this.phanTramHoGDBaNguoiPhuThuoc = phanTramHoGDBaNguoiPhuThuoc;
    }

    public double getPhanTramHoGDBonNguoiPhuThuoc() {
        return phanTramHoGDBonNguoiPhuThuoc;
    }

    public void setPhanTramHoGDBonNguoiPhuThuoc(double phanTramHoGDBonNguoiPhuThuoc) {
        this.phanTramHoGDBonNguoiPhuThuoc = phanTramHoGDBonNguoiPhuThuoc;
    }

    public double getPhanTramHoGDNamVaLonHonNguoiPhuThuoc() {
        return phanTramHoGDNamVaLonHonNguoiPhuThuoc;
    }

    public void setPhanTramHoGDNamVaLonHonNguoiPhuThuoc(double phanTramHoGDNamVaLonHonNguoiPhuThuoc) {
        this.phanTramHoGDNamVaLonHonNguoiPhuThuoc = phanTramHoGDNamVaLonHonNguoiPhuThuoc;
    }

    public int getLuongCoSo() {
        return luongCoSo;
    }

    public void setLuongCoSo(int luongCoSo) {
        this.luongCoSo = luongCoSo;
    }

    public double getPhanTramLuong() {
        return phanTramLuong;
    }

    public void setPhanTramLuong(double phanTramLuong) {
        this.phanTramLuong = phanTramLuong;
    }

    public double getPhanTramHoTroHSSV() {
        return phanTramHoTroHSSV;
    }

    public void setPhanTramHoTroHSSV(double phanTramHoTroHSSV) {
        this.phanTramHoTroHSSV = phanTramHoTroHSSV;
    }

    public double getPhanTramHoTroNongLamNgu() {
        return phanTramHoTroNongLamNgu;
    }

    public void setPhanTramHoTroNongLamNgu(double phanTramHoTroNongLamNgu) {
        this.phanTramHoTroNongLamNgu = phanTramHoTroNongLamNgu;
    }

    public double getPhanTramHoTroCanNgheo() {
        return phanTramHoTroCanNgheo;
    }

    public void setPhanTramHoTroCanNgheo(double phanTramHoTroCanNgheo) {
        this.phanTramHoTroCanNgheo = phanTramHoTroCanNgheo;
    }

    public void docFile() {
        try {
            FileInputStream fis = new FileInputStream("config.txt");
            DataInputStream dis = new DataInputStream(fis);
            this.luongCoSo = dis.readInt();
            this.phanTramLuong = dis.readDouble();
            this.phanTramHoTroHSSV = dis.readDouble();
            this.phanTramHoTroNongLamNgu = dis.readDouble();
            this.phanTramHoTroCanNgheo = dis.readDouble();
            this.phanTramHoGDMotNguoiPhuThuoc = dis.readDouble();
            this.phanTramHoGDHaiNguoiPhuThuoc = dis.readDouble();
            this.phanTramHoGDBaNguoiPhuThuoc = dis.readDouble();
            this.phanTramHoGDBonNguoiPhuThuoc = dis.readDouble();
            this.phanTramHoGDNamVaLonHonNguoiPhuThuoc = dis.readDouble();
            System.out.println("Ket qua doc file cau hinh:");
            System.out.println(luongCoSo);
            System.out.println(phanTramLuong);
            System.out.println(phanTramHoTroHSSV);
            System.out.println(phanTramHoTroNongLamNgu);
            System.out.println(phanTramHoTroCanNgheo);
            System.out.println(phanTramHoGDMotNguoiPhuThuoc);
            System.out.println(phanTramHoGDHaiNguoiPhuThuoc);
            System.out.println(phanTramHoGDBaNguoiPhuThuoc);
            System.out.println(phanTramHoGDBonNguoiPhuThuoc);
            System.out.println(phanTramHoGDNamVaLonHonNguoiPhuThuoc);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ghiFile(int luongCoSo, double phanTramLuong, double phanTramHoTroHSSV, double phanTramHoTroNongLamNgu,
            double phanTramHoTroCanNgheo, double phanTramHoGDMotNguoiPhuThuoc, double phanTramHoGDHaiNguoiPhuThuoc,
            double phanTramHoGDBaNguoiPhuThuoc, double phanTramHoGDBonNguoiPhuThuoc, double phanTramHoGDNamVaLonHonNguoiPhuThuoc) {
        try {
            FileOutputStream fos = new FileOutputStream("config.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(luongCoSo);
            dos.writeDouble(phanTramLuong);
            dos.writeDouble(phanTramHoTroHSSV);
            dos.writeDouble(phanTramHoTroNongLamNgu);
            dos.writeDouble(phanTramHoTroCanNgheo);
            dos.writeDouble(phanTramHoGDMotNguoiPhuThuoc);
            dos.writeDouble(phanTramHoGDHaiNguoiPhuThuoc);
            dos.writeDouble(phanTramHoGDBaNguoiPhuThuoc);
            dos.writeDouble(phanTramHoGDBonNguoiPhuThuoc);
            dos.writeDouble(phanTramHoGDNamVaLonHonNguoiPhuThuoc);
            fos.close();
            dos.close();
            System.out.println("Ghi file cau hinh xong!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Config config = new Config();
//        config.ghiFile(1390000, 4.5, 30, 50, 70, 4.5, 70, 60, 50, 40);
//        config.ghiFile(10, 1, 2, 3, 2, 2, 10, 2, 3, 2);
        config.docFile();
    }
}
