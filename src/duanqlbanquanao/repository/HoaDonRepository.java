/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanqlbanquanao.repository;

import duanqlbanquanao.Util.JDBCHeper;
import duanqlbanquanao.model.HoaDon;
import duanqlbanquanao.model.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonRepository {

    private List<HoaDon> list;
    private JDBCHeper helper;
    DBContext dbreporisitory;
    ResultSet rs = null;
    Statement st = null;
    PreparedStatement pst = null;

    public HoaDonRepository() {
        list = new ArrayList<>();
        helper = new JDBCHeper();
    }

    private HoaDon layThongTin(ResultSet rs) {
        if (rs != null) {
            try {
                int ma = rs.getInt("MaHoaDon");
                String nguoiTao = rs.getString("NguoiTao");
                Date ngayTao = rs.getDate("NgayTao");
                int trangThai = rs.getInt("TrangThai");
                HoaDon hoaDon = new HoaDon(ma, nguoiTao, ngayTao, trangThai);
                return hoaDon;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<HoaDon> layDanhSach() {
        String sql = "SELECT * FROM HoaDon";
        List<HoaDon> list = new ArrayList<>();
        ResultSet rs = helper.executeQuery(sql);
        try {
            while (rs.next()) {
                HoaDon hoaDon = layThongTin(rs);
                if (hoaDon != null) {
                    list.add(hoaDon);
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void themThongTin(HoaDon hd) {
        String nguoiTao = hd.getNguoiTao();
        Date ngayTao = hd.getNgayTao();
        int trangThai = hd.getTrangThai();
        String sql = "insert into HoaDon values(?, ?, ?)";
        int kq = this.helper.executeUpdate(sql, nguoiTao, ngayTao, trangThai
        );

    }

    public void xoaThongTin(int ma) {
        String sql = "DELETE FROM HoaDon WHERE MaHoaDon=?";
        this.helper.executeUpdate(sql, ma);
    }

    public void capNhatThongTin(HoaDon hd) {
        String sql = "update HoaDon set NguoiTao = ?, NgayTao = ?, TrangThai=? where MaHoaDon = ?";
        String nguoiTao = hd.getNguoiTao();
        Date ngayTao = hd.getNgayTao();
        int trangThai = hd.getTrangThai();
        int ma = hd.getMa();
        int kq = this.helper.executeUpdate(sql, nguoiTao, ngayTao, trangThai, ma);
    }

    public List<HoaDon> search(String txt) {
        String sql = "select * from HoaDon where NguoiTao like N'%" + txt + "%'";
        List<HoaDon> list = new ArrayList<>();
        ResultSet rs = helper.executeQuery(sql);
        try {
            while (rs.next()) {
                HoaDon hoaDon = layThongTin(rs);
                if (hoaDon != null) {
                    list.add(hoaDon);
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
