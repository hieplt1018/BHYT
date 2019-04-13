/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Date;
import java.util.ArrayList;
import model.BHYT;

/**
 *
 * @author HOANG
 */
public interface BhytDAO {
    public boolean insert(BHYT bhyt);
    public boolean update(BHYT bhyt);
    public boolean delete(String maTheBHYT);
    public ArrayList<BHYT> get(int soLuong);
    public int tinhBHYT(String loaiDoiTuong, int luong, int soNguoi);
    public int getSoLuongNguoi();
    public int getSoLuongTheoMien(String mien);
    public int getSoLuongTheoVung(String vung);
    public int getSoLuongTheoLoai(String loai, String year);
    public int getSoLuongTheoNam(String year);
    public int getSoLuongTheoLoaiTatCa(String loai);
    public long getTongTienBHYT();
    public long getTienBHYTTheoNam(String year);
    public ArrayList<BHYT> getTheoNam(String year, int soLuong);
}
