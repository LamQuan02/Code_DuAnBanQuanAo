/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanqlbanquanao.repository;

import duanqlbanquanao.Util.JDBCHeper;
import duanqlbanquanao.model.NhanVien;
import duanqlbanquanao.model.SanPham;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamRepository {

    private List<SanPham> list;
    private JDBCHeper helper;
    DBContext dbreporisitory;
    ResultSet rs = null;
    Statement st = null;
    PreparedStatement pst = null;

    public SanPhamRepository() {
        list = new ArrayList<>();
        helper = new JDBCHeper();
    }

    private SanPham layThongTin(ResultSet rs) {
        if (rs != null) {
            try {
                int ma = rs.getInt("MaSP");
                String ten = rs.getString("TenSP");
                int soLuong = rs.getInt("SoLuong");
                float gia = rs.getFloat("Gia");
                SanPham sanPham = new SanPham(ma, ten, soLuong, gia);
                return sanPham;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<SanPham> layDanhSach() {
        String sql = "SELECT * FROM SanPham";
        List<SanPham> list = new ArrayList<>();
        ResultSet rs = helper.executeQuery(sql);
        try {
            while (rs.next()) {
                SanPham sanPham = layThongTin(rs);
                if (sanPham != null) {
                    list.add(sanPham);
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void themThongTin(SanPham sp) {
        String ten = sp.getTen();
        int soLuong = sp.getSoLuong();
        float gia = sp.getGia();
        String sql = "insert into SanPham values(?, ?, ?)";
        int kq = this.helper.executeUpdate(sql, ten, soLuong, gia);

    }

    public void xoaThongTin(int ma) {
        String sql = "DELETE FROM SanPham WHERE MaSP=?";
        this.helper.executeUpdate(sql, ma);
    }

    public void capNhatThongTin(SanPham sp) {
        String sql = "update SanPham set TenSP = ?, SoLuong = ?, Gia=? where MaSP = ?";
        String ten = sp.getTen();
        int soLuong = sp.getSoLuong();
        float gia = sp.getGia();
        int ma = sp.getMa();
        int kq = this.helper.executeUpdate(sql, ten, soLuong, gia, ma);
    }

    public List<SanPham> search(String txt) {
        String sql = "select * from SanPham where TenSP like N'%" + txt + "%'";
        List<SanPham> list = new ArrayList<>();
        ResultSet rs = helper.executeQuery(sql);
        try {
            while (rs.next()) {
                SanPham sanPham = layThongTin(rs);
                if (sanPham != null) {
                    list.add(sanPham);
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
