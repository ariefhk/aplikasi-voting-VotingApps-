/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ArX
 */
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Pemilihan extends javax.swing.JFrame {
    
    final JLabel label = new JLabel();
    private Connect koneksi = new Connect();
    private ImageIcon format = null;

    /**
     * Creates new form Pemilihan
     */
    public Pemilihan() {
        initComponents();
        getFoto1();
        getFoto2();
          setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         }
         

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        displayImage2 = new javax.swing.JLabel();
        displayImage1 = new javax.swing.JLabel();
        btnPilih2 = new javax.swing.JButton();
        btnPilih1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 600));
        setPreferredSize(new java.awt.Dimension(950, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        displayImage2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        displayImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPilih2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPilih2.setForeground(new java.awt.Color(9, 154, 191));
        btnPilih2.setText("Pilih");
        btnPilih2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilih2ActionPerformed(evt);
            }
        });

        btnPilih1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPilih1.setForeground(new java.awt.Color(9, 154, 191));
        btnPilih1.setText("Pilih");
        btnPilih1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilih1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(9, 154, 191));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VOTE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addContainerGap(776, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(9, 154, 191));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jSeparator3.setBackground(new java.awt.Color(9, 154, 191));
        jSeparator3.setForeground(new java.awt.Color(9, 154, 191));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(9, 154, 191));
        jLabel5.setText("PASLON 1");

        jSeparator5.setBackground(new java.awt.Color(9, 154, 191));
        jSeparator5.setForeground(new java.awt.Color(9, 154, 191));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(9, 154, 191));
        jLabel3.setText("PASLON 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(displayImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPilih1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(displayImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPilih2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(displayImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPilih2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPilih1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(162, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(displayImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPilih1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilih1ActionPerformed
        // TODO add your handling code here:
        try {
            String latestLogin = getLatestLogin();
            String calonPresiden1 = "1";
            String sql = "INSERT INTO tb_vote(idCalon,id_mahasiswa) VALUES ((SELECT idCalon FROM tb_calon WHERE idCalon = '" + calonPresiden1+ "'),(SELECT id_mahasiswa FROM tb_mahasiswa WHERE id_mahasiswa = '" + latestLogin + "'))";

            Connection conn = koneksi.getConnect();
            PreparedStatement pat = conn.prepareStatement(sql);
            pat.execute();
            dispose();
            Component frame = null;
//            LoginUser user = new LoginUser();
//            user.show();
            int result = JOptionPane.showConfirmDialog(frame,"Terima Kasih Telah Memilih!\n Apakah ada yang ingin disampaikan? ", "Saran dan Masukan",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            switch (result) {
                case JOptionPane.YES_OPTION:
                    label.setText("Anda Akan diarahkan ke Saran ");
                    Terimakasih saran = new Terimakasih();
                    saran.show();
                    break;            
                case JOptionPane.NO_OPTION:
                    label.setText("Terima Kasih atas Suara Anda ");
                    LoginUser user = new LoginUser();
                    user.show();
                    break;
                default:
                    label.setText("Anda Tidak Memilih apapun ");
                    break;
            }
        } catch (SQLException ex) {
            System.out.println("Gagal " + ex);
        }


    }//GEN-LAST:event_btnPilih1ActionPerformed

    private void btnPilih2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilih2ActionPerformed
        // TODO add your handling code here:
        try {
             String latestLogin = getLatestLogin();
            String calonPresiden2 = "2";
            String sql = "INSERT INTO tb_vote(idCalon,id_mahasiswa) VALUES ((SELECT idCalon FROM tb_calon WHERE idCalon = '" + calonPresiden2 + "'),(SELECT id_mahasiswa FROM tb_mahasiswa WHERE id_mahasiswa = '" + latestLogin + "'))";

            Connection conn = koneksi.getConnect();
            PreparedStatement pat = conn.prepareStatement(sql);
            pat.execute();
            dispose();
            Component frame = null;
            
            int result = JOptionPane.showConfirmDialog(frame,"Terima Kasih Telah Memilih ! \n  Apakah ada yang ingin disampaikan? ", "Saran dan Masukan",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            switch (result) {
                case JOptionPane.YES_OPTION:
                    label.setText("Anda Akan diarahkan ke Saran ");
                    Terimakasih saran = new Terimakasih();
                    saran.show();
                    break;            
                case JOptionPane.NO_OPTION:
                    label.setText("Terima Kasih atas Suara Anda ");
                    LoginUser user = new LoginUser();
                    user.show();
                    break;
                default:
                    label.setText("Anda Tidak Memilih apapun ");
                    break;
            }

            
        } catch (SQLException ex) {
            System.out.println("Gagal " + ex);
        }

    }//GEN-LAST:event_btnPilih2ActionPerformed

    private void getFoto1() {
        try {
            String calonPresiden1 = "1";
            Connection conn = koneksi.getConnect();
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery("SELECT * FROM tb_calon WHERE idCalon='" + calonPresiden1 + "'");
            if (result.next()) {
                byte[] imageData = result.getBytes("fotoCalon");
                format = new ImageIcon(imageData);
                Image nm = format.getImage();
                Image imgCpn1 = nm.getScaledInstance(350, 200, Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(imgCpn1);
                displayImage1.setIcon(image);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DemoFotoCalon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getFoto2() {
        try {
            String calonPresiden2 = "2";
            Connection conn = koneksi.getConnect();
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery("SELECT * FROM tb_calon WHERE idCalon='" + calonPresiden2 + "'");
            if (result.next()) {
                byte[] imageData = result.getBytes("fotoCalon");
                format = new ImageIcon(imageData);
                Image nm = format.getImage();
                Image imgCpn1 = nm.getScaledInstance(350, 200, Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(imgCpn1);
                displayImage2.setIcon(image);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DemoFotoCalon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    private String  getLatestLogin(){
    String idLatest="";
        try {
            String sql =  ("SELECT * FROM tb_logs ORDER BY id_logs DESC LIMIT 1");;
            Connection conn = koneksi.getConnect();
            Statement s = conn.createStatement();
            ResultSet result = s.executeQuery(sql);
            if (result.next()) {
              idLatest = result.getString("id_mahasiswa");
//               String pass = result.getString("password");
               
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            return idLatest;
    }

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
            java.util.logging.Logger.getLogger(Pemilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemilihan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPilih1;
    private javax.swing.JButton btnPilih2;
    private javax.swing.JLabel displayImage1;
    private javax.swing.JLabel displayImage2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
