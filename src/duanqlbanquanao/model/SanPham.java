/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanqlbanquanao.model;

/**
 *
 * @author Admin
 */
public class SanPham {

    private int ma;

    private String ten;

    private int soLuong;

    private float gia;

    public SanPham() {
    }

    public SanPham(int ma, String ten, int soLuong, float gia) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getGia() {
        return gia;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

}
