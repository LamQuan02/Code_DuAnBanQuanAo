/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package duanqlbanquanao.view;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    Color DefaultColor, ClickedColor;

    public Menu() {
        initComponents();
        DefaultColor = new Color(13, 36, 51);
        ClickedColor = new Color(240, 151, 57);

        QLNV.setBackground(DefaultColor);
        QLKH.setBackground(DefaultColor);
        QLSP.setBackground(DefaultColor);
        QLHĐ.setBackground(DefaultColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        QLNV = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        QLKH = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        QLSP = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        QLHĐ = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        DangXuat = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jDesktopPane11 = new javax.swing.JDesktopPane();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        txtExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtExit.setForeground(new java.awt.Color(255, 255, 255));
        txtExit.setText("X");
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
        });

        Menu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("MENU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtExit)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu))
                .addGap(12, 12, 12))
        );

        jPanel3.setBackground(new java.awt.Color(13, 36, 51));

        QLNV.setBackground(new java.awt.Color(13, 36, 51));
        QLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QLNVMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QLNVMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout QLNVLayout = new javax.swing.GroupLayout(QLNV);
        QLNV.setLayout(QLNVLayout);
        QLNVLayout.setHorizontalGroup(
            QLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QLNVLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        QLNVLayout.setVerticalGroup(
            QLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QLNVLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );

        QLKH.setBackground(new java.awt.Color(13, 36, 51));
        QLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QLKHMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QLKHMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("QUẢN LÝ KHÁCH HÀNG");

        javax.swing.GroupLayout QLKHLayout = new javax.swing.GroupLayout(QLKH);
        QLKH.setLayout(QLKHLayout);
        QLKHLayout.setHorizontalGroup(
            QLKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QLKHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
        );
        QLKHLayout.setVerticalGroup(
            QLKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLKHLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        QLSP.setBackground(new java.awt.Color(13, 36, 51));
        QLSP.setForeground(new java.awt.Color(255, 255, 255));
        QLSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QLSPMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QLSPMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUẢN LÝ SẢN PHẨM");

        javax.swing.GroupLayout QLSPLayout = new javax.swing.GroupLayout(QLSP);
        QLSP.setLayout(QLSPLayout);
        QLSPLayout.setHorizontalGroup(
            QLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLSPLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        QLSPLayout.setVerticalGroup(
            QLSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QLSPLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(20, 20, 20))
        );

        QLHĐ.setBackground(new java.awt.Color(13, 36, 51));
        QLHĐ.setForeground(new java.awt.Color(255, 255, 255));
        QLHĐ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QLHĐMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QLHĐMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUẢN LÝ HOÁ ĐƠN");

        javax.swing.GroupLayout QLHĐLayout = new javax.swing.GroupLayout(QLHĐ);
        QLHĐ.setLayout(QLHĐLayout);
        QLHĐLayout.setHorizontalGroup(
            QLHĐLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLHĐLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        QLHĐLayout.setVerticalGroup(
            QLHĐLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLHĐLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        DangXuat.setBackground(new java.awt.Color(13, 36, 51));
        DangXuat.setForeground(new java.awt.Color(255, 255, 255));
        DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangXuatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DangXuatMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ĐĂNG XUẤT");

        javax.swing.GroupLayout DangXuatLayout = new javax.swing.GroupLayout(DangXuat);
        DangXuat.setLayout(DangXuatLayout);
        DangXuatLayout.setHorizontalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangXuatLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DangXuatLayout.setVerticalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangXuatLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QLNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QLSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QLHĐ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QLKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(QLKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(QLSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(QLHĐ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPane11Layout = new javax.swing.GroupLayout(jDesktopPane11);
        jDesktopPane11.setLayout(jDesktopPane11Layout);
        jDesktopPane11Layout.setHorizontalGroup(
            jDesktopPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );
        jDesktopPane11Layout.setVerticalGroup(
            jDesktopPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane11))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane11)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExitMouseClicked

    private void QLNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLNVMousePressed
        QLNV.setBackground(ClickedColor);
        QLKH.setBackground(DefaultColor);
        QLSP.setBackground(DefaultColor);
        QLHĐ.setBackground(DefaultColor);

        Menu.setText("Quản Lý Nhân Viên");

        // TODO add your handling code here:
    }//GEN-LAST:event_QLNVMousePressed

    private void QLKHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLKHMousePressed
        QLNV.setBackground(DefaultColor);
        QLKH.setBackground(ClickedColor);
        QLSP.setBackground(DefaultColor);
        QLHĐ.setBackground(DefaultColor);
        Menu.setText("Quản Lý Khách Hàng");
        // TODO add your handling code here:
    }//GEN-LAST:event_QLKHMousePressed

    private void QLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLNVMouseClicked
        FrNhanVien qlnv = new FrNhanVien();
        jDesktopPane11.removeAll();
        jDesktopPane11.add(qlnv).setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_QLNVMouseClicked

    private void QLKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLKHMouseClicked
        FrKhachHang qlkh = new FrKhachHang();
        jDesktopPane11.removeAll();
        jDesktopPane11.add(qlkh).setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_QLKHMouseClicked

    private void QLSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLSPMouseClicked
        FrSanPham qlsp = new FrSanPham();
        jDesktopPane11.removeAll();
        jDesktopPane11.add(qlsp).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_QLSPMouseClicked

    private void QLSPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLSPMousePressed
        QLNV.setBackground(DefaultColor);
        QLKH.setBackground(DefaultColor);
        QLSP.setBackground(ClickedColor);
        QLHĐ.setBackground(DefaultColor);
        Menu.setText("Quản Lý Sản Phẩm");
// TODO add your handling code here:
    }//GEN-LAST:event_QLSPMousePressed

    private void QLHĐMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLHĐMouseClicked
        FrHoaDon qlhd = new FrHoaDon();
        jDesktopPane11.removeAll();
        jDesktopPane11.add(qlhd).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_QLHĐMouseClicked

    private void QLHĐMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLHĐMousePressed
        QLNV.setBackground(DefaultColor);
        QLKH.setBackground(DefaultColor);
        QLSP.setBackground(DefaultColor);
        QLHĐ.setBackground(ClickedColor);

        Menu.setText("Quản Lý Hoá Đơn");
        // TODO add your handling code here:
    }//GEN-LAST:event_QLHĐMousePressed

    private void DangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatMouseClicked
        FrDangNhap frDangNhap  = new FrDangNhap();
        frDangNhap.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_DangXuatMouseClicked

    private void DangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatMousePressed
        QLNV.setBackground(DefaultColor);
        QLKH.setBackground(DefaultColor);
        QLSP.setBackground(DefaultColor);
        QLHĐ.setBackground(DefaultColor);
        DangXuat.setBackground(ClickedColor);       
        // TODO add your handling code here:
    }//GEN-LAST:event_DangXuatMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DangXuat;
    private javax.swing.JLabel Menu;
    private javax.swing.JPanel QLHĐ;
    private javax.swing.JPanel QLKH;
    private javax.swing.JPanel QLNV;
    private javax.swing.JPanel QLSP;
    private javax.swing.JDesktopPane jDesktopPane11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel txtExit;
    // End of variables declaration//GEN-END:variables
}
