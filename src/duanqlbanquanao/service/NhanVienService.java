/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanqlbanquanao.service;

import duanqlbanquanao.model.NhanVien;
import duanqlbanquanao.repository.NhanVienRepository;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienService {

    private NhanVienRepository nhanVienRepository;

    public NhanVienService() {
        nhanVienRepository = new NhanVienRepository();
    }

    public List<NhanVien> layDanhSach() {
        return nhanVienRepository.layDanhSach();
    }
    
    public List<NhanVien> search(String txt) {
        return nhanVienRepository.search(txt);
    }

    public void xoaThongTin(int ma) {
        this.nhanVienRepository.xoaThongTin(ma);
    }

    public void themThongTin(NhanVien nv) {
        this.nhanVienRepository.themThongTin(nv);
    }
    
    public void capNhatThongTin(NhanVien nv) {
        this.nhanVienRepository.capNhatThongTin(nv);
    }
    
}
