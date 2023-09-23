/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanqlbanquanao.service;

import duanqlbanquanao.model.KhachHang;
import duanqlbanquanao.model.NhanVien;
import duanqlbanquanao.repository.KhachHangRepository;
import duanqlbanquanao.repository.NhanVienRepository;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhachHangService {

    private KhachHangRepository khachHangRepository;

    public KhachHangService() {
        khachHangRepository = new KhachHangRepository();
    }

    public List<KhachHang> layDanhSach() {
        return khachHangRepository.layDanhSach();
    }

    public void xoaThongTin(int ma) {
        this.khachHangRepository.xoaThongTin(ma);
    }

    public void themThongTin(KhachHang kh) {
        this.khachHangRepository.themThongTin(kh);
    }

    public void capNhatThongTin(KhachHang kh) {
        this.khachHangRepository.capNhatThongTin(kh);
    }
      public List<KhachHang> search(String txt) {
        return khachHangRepository.search(txt);
    }
}
