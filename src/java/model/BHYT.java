/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.sun.istack.Nullable;
import java.sql.Date;

/**
 *
 * @author HOANG
 */
public class BHYT {
    private String maTheBHYT;
    private String hoTen;
    private String loaiBHYT;
    private int tienBHYT;
    private Date ngaySinh;
    private String vung;
    private String mien;
    private String thanhPho;
    private String quanHuyen;
    private String xaPhuong;
    private String thonXom;
    private int soNguoiTrongHo;
    private Date ngayDongBHYT;

    public BHYT(String maTheBHYT, String hoTen, String loaiBHYT, int tienBHYT, Date ngaySinh, String vung, String mien, String thanhPho, String quanHuyen, String xaPhuong, String thonXom, int soNguoiTrongHo, Date ngayDongBHYT) {
        this.maTheBHYT = maTheBHYT;
        this.hoTen = hoTen;
        this.loaiBHYT = loaiBHYT;
        this.tienBHYT = tienBHYT;
        this.ngaySinh = ngaySinh;
        this.vung = vung;
        this.mien = mien;
        this.thanhPho = thanhPho;
        this.quanHuyen = quanHuyen;
        this.xaPhuong = xaPhuong;
        this.thonXom = thonXom;
        this.soNguoiTrongHo = soNguoiTrongHo;
        this.ngayDongBHYT = ngayDongBHYT;
    }

    public BHYT() {
    }

    public String getMaTheBHYT() {
        return maTheBHYT;
    }

    public void setMaTheBHYT(String maTheBHYT) {
        this.maTheBHYT = maTheBHYT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLoaiBHYT() {
        return loaiBHYT;
    }

    public void setLoaiBHYT(String loaiBHYT) {
        this.loaiBHYT = loaiBHYT;
    }

    public int getTienBHYT() {
        return tienBHYT;
    }

    public void setTienBHYT(int tienBHYT) {
        this.tienBHYT = tienBHYT;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getVung() {
        return vung;
    }

    public void setVung(String vung) {
        this.vung = vung;
    }

    public String getMien() {
        return mien;
    }

    public void setMien(String mien) {
        this.mien = mien;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getXaPhuong() {
        return xaPhuong;
    }

    public void setXaPhuong(String xaPhuong) {
        this.xaPhuong = xaPhuong;
    }

    public String getThonXom() {
        return thonXom;
    }

    public void setThonXom(String thonXom) {
        this.thonXom = thonXom;
    }

    public int getSoNguoiTrongHo() {
        return soNguoiTrongHo;
    }

    public void setSoNguoiTrongHo(int soNguoiTrongHo) {
        this.soNguoiTrongHo = soNguoiTrongHo;
    }

    public Date getNgayDongBHYT() {
        return ngayDongBHYT;
    }

    public void setNgayDongBHYT(Date ngayDongBHYT) {
        this.ngayDongBHYT = ngayDongBHYT;
    }

    @Override
    public String toString() {
        return "BHYT{" + "maTheBHYT=" + maTheBHYT + ", hoTen=" + hoTen + ", loaiBHYT=" + loaiBHYT + ", tienBHYT=" + tienBHYT + ", ngaySinh=" + ngaySinh + ", vung=" + vung + ", mien=" + mien + ", thanhPho=" + thanhPho + ", quanHuyen=" + quanHuyen + ", xaPhuong=" + xaPhuong + ", thonXom=" + thonXom + ", soNguoiTrongHo=" + soNguoiTrongHo + ", ngayDongBHYT=" + ngayDongBHYT + "}\n";
    }
    
    
}