/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanqlbanquanao.service;

import duanqlbanquanao.model.HoaDon;
import duanqlbanquanao.model.NhanVien;
import duanqlbanquanao.repository.HoaDonRepository;
import duanqlbanquanao.repository.NhanVienRepository;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonService {

    private HoaDonRepository hoaDonRepository;

    public HoaDonService() {
        hoaDonRepository = new HoaDonRepository();
    }

    public List<HoaDon> layDanhSach() {
        return hoaDonRepository.layDanhSach();
    }

    public void xoaThongTin(int ma) {
        this.hoaDonRepository.xoaThongTin(ma);
    }

    public void themThongTin(HoaDon hd) {
        this.hoaDonRepository.themThongTin(hd);
    }

    public void capNhatThongTin(HoaDon hd) {
        this.hoaDonRepository.capNhatThongTin(hd);
    }

    public List<HoaDon> search(String txt) {
        return hoaDonRepository.search(txt);
    }
}
