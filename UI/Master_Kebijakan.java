/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Class.Koneksi;
import Java.koneksi;
import com.mysql.jdbc.Connection;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dii
 */
public class Master_Kebijakan extends javax.swing.JFrame {

    private Java.koneksi koneksi;
    private Connection con;
    private ResultSet hasil;
    private Statement stat;
    /**
     * Creates new form Kebijakan
     */
    public Master_Kebijakan() {
        initComponents();
        this.setLocationRelativeTo(null);
        Komzet.requestFocus(true);
        loadkebijakan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Komzet = new javax.swing.JTextField();
        Bomzet = new javax.swing.JTextField();
        wt1 = new javax.swing.JTextField();
        wt2 = new javax.swing.JTextField();
        bd1 = new javax.swing.JTextField();
        wt3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        wt4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bd2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setText("Kebijakan Omzet");

        Komzet.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Komzet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KomzetKeyTyped(evt);
            }
        });

        Bomzet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BomzetKeyTyped(evt);
            }
        });

        wt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt1KeyTyped(evt);
            }
        });

        wt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt2KeyTyped(evt);
            }
        });

        bd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bd1KeyTyped(evt);
            }
        });

        wt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt3KeyTyped(evt);
            }
        });

        jLabel2.setText("Bonuz Omzet");

        jLabel3.setText("Waktu Tenggang 1 (hari)");

        jLabel4.setText("Waktu Tenggang 2 (hari)");

        jLabel5.setText("Besaran Denda 1 (%)");

        jLabel6.setText("Waktu Tenggang 4 (hari)");

        jLabel7.setText("Waktu Tenggang 3 (hari)");

        wt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt4KeyTyped(evt);
            }
        });

        jLabel8.setText("Besaran Denda 2 (%)");

        bd2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bd2KeyTyped(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/if_stock_save_20659.png"))); // NOI18N
        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel35.setText("Kebijakan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wt4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Komzet, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(wt3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bomzet, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(wt2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bd1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(wt1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addComponent(bd2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Komzet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bomzet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(576, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String str = evt.getActionCommand();
       simpan();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void KomzetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KomzetKeyTyped
       char vChar = evt.getKeyChar(); 
       if (!(Character.isDigit(vChar) 
               || (vChar == KeyEvent.VK_BACK_SPACE) 
               || (vChar == KeyEvent.VK_DELETE))) { 
           evt.consume(); 
       }
        if (vChar == KeyEvent.VK_ENTER) {
            Bomzet.requestFocus(true);
        }
    }//GEN-LAST:event_KomzetKeyTyped

    private void BomzetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BomzetKeyTyped
    char vChar = evt.getKeyChar(); 
       if (!(Character.isDigit(vChar) 
               || (vChar == KeyEvent.VK_BACK_SPACE) 
               || (vChar == KeyEvent.VK_DELETE))) { 
           evt.consume(); 
       }
        if (vChar == KeyEvent.VK_ENTER) {
            wt1.requestFocus(true);
        }
    }//GEN-LAST:event_BomzetKeyTyped

    private void wt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt1KeyTyped
    char vChar = evt.getKeyChar(); 
       if (!(Character.isDigit(vChar) 
               || (vChar == KeyEvent.VK_BACK_SPACE) 
               || (vChar == KeyEvent.VK_DELETE))) { 
           evt.consume(); 
       }
        if (vChar == KeyEvent.VK_ENTER) {
            wt2.requestFocus(true);
        }
    }//GEN-LAST:event_wt1KeyTyped

    private void wt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt2KeyTyped
    char vChar = evt.getKeyChar(); 
       if (!(Character.isDigit(vChar) 
               || (vChar == KeyEvent.VK_BACK_SPACE) 
               || (vChar == KeyEvent.VK_DELETE))) { 
           evt.consume(); 
       }
        if (vChar == KeyEvent.VK_ENTER) {
            bd1.requestFocus(true);
        }
    }//GEN-LAST:event_wt2KeyTyped

    private void bd1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bd1KeyTyped
    char vChar = evt.getKeyChar(); 
       if (!(Character.isDigit(vChar) 
               || (vChar == KeyEvent.VK_BACK_SPACE) 
               || (vChar == KeyEvent.VK_DELETE))) { 
           evt.consume(); 
       }
        if (vChar == KeyEvent.VK_ENTER) {
            wt3.requestFocus(true);
        }
    }//GEN-LAST:event_bd1KeyTyped

    private void wt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt3KeyTyped
     char vChar = evt.getKeyChar(); 
       if (!(Character.isDigit(vChar) 
               || (vChar == KeyEvent.VK_BACK_SPACE) 
               || (vChar == KeyEvent.VK_DELETE))) { 
           evt.consume(); 
       }
        if (vChar == KeyEvent.VK_ENTER) {
            wt4.requestFocus(true);
        }
    }//GEN-LAST:event_wt3KeyTyped

    private void wt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt4KeyTyped
    char vChar = evt.getKeyChar(); 
       if (!(Character.isDigit(vChar) 
               || (vChar == KeyEvent.VK_BACK_SPACE) 
               || (vChar == KeyEvent.VK_DELETE))) { 
           evt.consume(); 
       }
        if (vChar == KeyEvent.VK_ENTER) {
            bd2.requestFocus(true);
        }
    }//GEN-LAST:event_wt4KeyTyped

    private void bd2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bd2KeyTyped
    char vChar = evt.getKeyChar(); 
       if (!(Character.isDigit(vChar) 
               || (vChar == KeyEvent.VK_BACK_SPACE) 
               || (vChar == KeyEvent.VK_DELETE))) { 
           evt.consume(); 
       }
       if (vChar == KeyEvent.VK_ENTER) {
            simpan();
        }
    }//GEN-LAST:event_bd2KeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int vChar = evt.getKeyCode(); 
        if (vChar == 123) {
            simpan();
        }
    }//GEN-LAST:event_formKeyPressed
    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
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
            java.util.logging.Logger.getLogger(Master_Kebijakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master_Kebijakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master_Kebijakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master_Kebijakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master_Kebijakan().setVisible(true);
            }
        });
    }
    public void simpan() {
        if(JOptionPane.showConfirmDialog(null, "Anda yakin menyimpan data kebijakan?", "Simpan Kebijakan", JOptionPane.OK_CANCEL_OPTION) == 0){
            LocalDateTime a = LocalDateTime.now();
            try {
                koneksi = new koneksi();
                koneksi.Connect();
                String sql= "INSERT INTO kebijakan_n (jumlah_omzet, bonus_omzet, denda_1, denda_2, tenggang_1, tenggang_2, tenggang_3, tenggang_4, tgl_ubah, user_ubah) VALUES ('"
                    +Komzet.getText().toString()+"', '"
                    +Bomzet.getText().toString()+"', '"
                    +bd1.getText().toString()+"', '"
                    +bd2.getText().toString()+"', '"
                    +wt1.getText().toString()+"', '"
                    +wt2.getText().toString()+"', '"
                    +wt3.getText().toString()+"', '"
                    +wt4.getText().toString()+"', '"
                    +getCurrentTimeStamp()+"', '"
//                        +s+")";
                    +"3')";
            System.out.println(sql);
            koneksi.simpanData(sql);

            JOptionPane.showMessageDialog(null,"Data sukses di simpan");
//                dTambahUpdateRekening.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "data tidak dimasukkan ke database" + e, "informasi", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("223: "+e);
            }
        }else{
            loadkebijakan();
            JOptionPane.showMessageDialog(null,"Data batal di simpan");
        }
    }
    public static void loadkebijakan(){
        try {
            String query ="select * from kebijakan_n ORDER BY kode_kebijakan DESC LIMIT 1 ";
            java.sql.Connection conn = (Connection) Koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(query);
            while (res.next()){
                Komzet.setText(res.getString(2));
                Bomzet.setText(res.getString(3));
                bd1.setText(res.getString(4));
                bd2.setText(res.getString(5));
                wt1.setText(res.getString(6));
                wt2.setText(res.getString(7));
                wt3.setText(res.getString(8));
                wt4.setText(res.getString(9));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan_243 ");
            System.out.println(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField Bomzet;
    private static javax.swing.JTextField Komzet;
    private static javax.swing.JTextField bd1;
    private static javax.swing.JTextField bd2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private static javax.swing.JTextField wt1;
    private static javax.swing.JTextField wt2;
    private static javax.swing.JTextField wt3;
    private static javax.swing.JTextField wt4;
    // End of variables declaration//GEN-END:variables
}
