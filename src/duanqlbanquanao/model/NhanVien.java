/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanqlbanquanao.model;

/**
 *
 * @author Admin
 */
public class NhanVien {

    private int ma;

    private String ten;

    private String diaChi;

    private String sdt;

    private float luong;

    public NhanVien() {
    }

    public NhanVien(int ma, String ten, String diaChi, String sdt, Float luong) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.luong = luong;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public Float getLuong() {
        return luong;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    } 
    

}
