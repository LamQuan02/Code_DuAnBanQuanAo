/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanqlbanquanao.repository;

import duanqlbanquanao.Util.JDBCHeper;
import duanqlbanquanao.model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienRepository {

    private List<NhanVien> list;
    private JDBCHeper helper;
    DBContext dbreporisitory;
    ResultSet rs = null;
    Statement st = null;
    PreparedStatement pst = null;

    public NhanVienRepository() {
        list = new ArrayList<>();
        helper = new JDBCHeper();
    }

    private NhanVien layThongTin(ResultSet rs) {
        if (rs != null) {
            try {
                int ma = rs.getInt("MaNV");
                String ten = rs.getString("TenNV");
                String diaChi = rs.getString("DiaChi");
                String sdt = rs.getString("SDT");
                float luong = rs.getFloat("Luong");
                NhanVien nhanVien = new NhanVien(ma, ten, diaChi, sdt, luong);
                return nhanVien;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<NhanVien> layDanhSach() {
        String sql = "SELECT * FROM NhanVien";
        List<NhanVien> list = new ArrayList<>();
        ResultSet rs = helper.executeQuery(sql);
        try {
            while (rs.next()) {
                NhanVien nhanVien = layThongTin(rs);
                if (nhanVien != null) {
                    list.add(nhanVien);
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void themThongTin(NhanVien nv) {
        String ten = nv.getTen();
        String diaChi = nv.getDiaChi();
        String sdt = nv.getSdt();
        float luong = nv.getLuong();
        String sql = "insert into NhanVien values(?, ?, ?, ?)";
        int kq = this.helper.executeUpdate(sql, ten, diaChi, sdt, luong);

    }

    public void xoaThongTin(int ma) {
        String sql = "DELETE FROM NhanVien WHERE MaNV=?";
        this.helper.executeUpdate(sql, ma);
    }

    public void capNhatThongTin(NhanVien nv) {
        String sql = "update NhanVien set TenNV = ?, DiaChi = ?, SDT=?, Luong = ? where MaNV = ?";
        String ten = nv.getTen();
        String diaChi = nv.getDiaChi();
        String sdt = nv.getSdt();
        float luong = nv.getLuong();
        int ma = nv.getMa();
        int kq = this.helper.executeUpdate(sql, ten, diaChi, sdt, luong, ma);
    }
    
    public List<NhanVien> search(String txt){
        String sql = "select * from NhanVien where TenNV like N'%"+txt+"%'";
        List<NhanVien> list = new ArrayList<>();
        ResultSet rs = helper.executeQuery(sql);
        try {
            while (rs.next()) {
                NhanVien nhanVien = layThongTin(rs);
                if (nhanVien != null) {
                    list.add(nhanVien);
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
