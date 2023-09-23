/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanqlbanquanao.repository;

import duanqlbanquanao.Util.JDBCHeper;
import duanqlbanquanao.model.KhachHang;
import duanqlbanquanao.model.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhachHangRepository {

    private List<KhachHang> list;
    private JDBCHeper helper;
    DBContext dbreporisitory;
    ResultSet rs = null;
    Statement st = null;
    PreparedStatement pst = null;

    public KhachHangRepository() {
        list = new ArrayList<>();
        helper = new JDBCHeper();
    }

    private KhachHang layThongTin(ResultSet rs) {
        if (rs != null) {
            try {
                int ma = rs.getInt("MaKH");
                String ten = rs.getString("TenKH");
                String diaChi = rs.getString("DiaChi");
                String sdt = rs.getString("SDT");
                KhachHang khachHang = new KhachHang(ma, ten, diaChi, sdt);
                return khachHang;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<KhachHang> layDanhSach() {
        String sql = "SELECT * FROM KhachHang";
        List<KhachHang> list = new ArrayList<>();
        ResultSet rs = helper.executeQuery(sql);
        try {
            while (rs.next()) {
                KhachHang khachHang = layThongTin(rs);
                if (khachHang != null) {
                    list.add(khachHang);
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void themThongTin(KhachHang kh) {
        String ten = kh.getTen();
        String diaChi = kh.getDiaChi();
        String sdt = kh.getSdt();
        String sql = "insert into KhachHang values(?, ?, ?)";
        int kq = this.helper.executeUpdate(sql, ten, diaChi, sdt);

    }

    public void xoaThongTin(int ma) {
        String sql = "DELETE FROM KhachHang WHERE MaKH=?";
        this.helper.executeUpdate(sql, ma);
    }

    public void capNhatThongTin(KhachHang kh) {
        String sql = "update KhachHang set TenKH = ?, DiaChi = ?, SDT=? where MaKH = ?";
        String ten = kh.getTen();
        String diaChi = kh.getDiaChi();
        String sdt = kh.getSdt();
        int ma = kh.getMa();
        int kq = this.helper.executeUpdate(sql, ten, diaChi, sdt, ma);
    }

    public List<KhachHang> search(String txt) {
        String sql = "select * from KhachHang where TenKH like N'%" + txt + "%'";
        List<KhachHang> list = new ArrayList<>();
        ResultSet rs = helper.executeQuery(sql);
        try {
            while (rs.next()) {
                KhachHang khachHang = layThongTin(rs);
                if (khachHang != null) {
                    list.add(khachHang);
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
