/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.controllerMenuUtama;

/**
 *
 * @author USER
 */
public class FormMenuUtama extends javax.swing.JFrame {
    private controllerMenuUtama cMenu;
    /**
     * Creates new form FormMenuUtama
     */
    public FormMenuUtama() {
        initComponents();
        cMenu = new controllerMenuUtama(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        master = new javax.swing.JMenu();
        masterBarang = new javax.swing.JMenuItem();
        masterPegawai = new javax.swing.JMenuItem();
        masterLupaPass = new javax.swing.JMenuItem();
        pencarian = new javax.swing.JMenu();
        cariBarang = new javax.swing.JMenuItem();
        cariPegawai = new javax.swing.JMenuItem();
        keluar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        master.setText("Master");

        masterBarang.setText("Barang");
        masterBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterBarangActionPerformed(evt);
            }
        });
        master.add(masterBarang);

        masterPegawai.setText("Pegawai");
        masterPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterPegawaiActionPerformed(evt);
            }
        });
        master.add(masterPegawai);

        masterLupaPass.setText("Lupa Password");
        masterLupaPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterLupaPassActionPerformed(evt);
            }
        });
        master.add(masterLupaPass);

        jMenuBar1.add(master);

        pencarian.setText("Pencarian");

        cariBarang.setText("Cari Barang");
        pencarian.add(cariBarang);

        cariPegawai.setText("Cari Pegawai");
        cariPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariPegawaiActionPerformed(evt);
            }
        });
        pencarian.add(cariPegawai);

        jMenuBar1.add(pencarian);

        keluar.setText("Keluar");
        jMenuBar1.add(keluar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void masterBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterBarangActionPerformed
        cMenu.masukFormBarang();
    }//GEN-LAST:event_masterBarangActionPerformed

    private void masterPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterPegawaiActionPerformed
        cMenu.masukFormPegawai();
    }//GEN-LAST:event_masterPegawaiActionPerformed

    private void masterLupaPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterLupaPassActionPerformed
        cMenu.masukFormLupaPass();
    }//GEN-LAST:event_masterLupaPassActionPerformed

    private void cariPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariPegawaiActionPerformed
        cMenu.masukFormCariPegawai();
    }//GEN-LAST:event_cariPegawaiActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cariBarang;
    private javax.swing.JMenuItem cariPegawai;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu keluar;
    private javax.swing.JMenu master;
    private javax.swing.JMenuItem masterBarang;
    private javax.swing.JMenuItem masterLupaPass;
    private javax.swing.JMenuItem masterPegawai;
    private javax.swing.JMenu pencarian;
    // End of variables declaration//GEN-END:variables
}
