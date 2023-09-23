/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanqlbanquanao.service;

import duanqlbanquanao.model.NhanVien;
import duanqlbanquanao.model.SanPham;
import duanqlbanquanao.repository.NhanVienRepository;
import duanqlbanquanao.repository.SanPhamRepository;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamService {

    private SanPhamRepository sanPhamRepository;

    public SanPhamService() {
        sanPhamRepository = new SanPhamRepository();
    }

    public List<SanPham> layDanhSach() {
        return sanPhamRepository.layDanhSach();
    }

    public List<SanPham> search(String txt) {
        return sanPhamRepository.search(txt);
    }

    public void xoaThongTin(int ma) {
        this.sanPhamRepository.xoaThongTin(ma);
    }

    public void themThongTin(SanPham sanPham) {
        this.sanPhamRepository.themThongTin(sanPham);
    }

    public void capNhatThongTin(SanPham sanPham) {
        this.sanPhamRepository.capNhatThongTin(sanPham);
    }
}
