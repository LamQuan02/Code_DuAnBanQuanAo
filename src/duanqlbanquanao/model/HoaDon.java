/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanqlbanquanao.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDon {

    private int ma;

    private String nguoiTao;

    private Date ngayTao;

    private int trangThai;

    public HoaDon() {
    }

    public HoaDon(int ma, String nguoiTao, Date ngayTao, int trangThai) {
        this.ma = ma;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public int getMa() {
        return ma;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }




}
