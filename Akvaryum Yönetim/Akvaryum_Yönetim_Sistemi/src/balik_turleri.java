
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nahit
 */
public class balik_turleri extends javax.swing.JFrame {

    
     public Object item = null;
    
    
     public Statement statement = null;
    
     public PreparedStatement preparedstatement= null;
     
     public  ResultSet resultset = null;
     
     Database_Connect islem = new Database_Connect();
        
     public Connection conn = islem.con;
    
    /**
     * Creates new form balik_turleri
     */
    public balik_turleri() {
        initComponents();
                 Toolkit toolkit = getToolkit();
        Dimension dim = toolkit.getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setTitle("Balık Türleri Ekranı");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        balik_turu_kodu_field = new javax.swing.JTextField();
        balik_turu_field = new javax.swing.JTextField();
        ekle_buton = new javax.swing.JButton();
        guncelle_buton = new javax.swing.JButton();
        sil_buton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        getir_buton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Balık Türü Kodu");

        jLabel2.setText("Balık Türü");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, balik_turu_field, org.jdesktop.beansbinding.ObjectProperty.create(), balik_turu_kodu_field, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        balik_turu_kodu_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                balik_turu_kodu_fieldKeyTyped(evt);
            }
        });

        balik_turu_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balik_turu_fieldActionPerformed(evt);
            }
        });
        balik_turu_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                balik_turu_fieldKeyTyped(evt);
            }
        });

        ekle_buton.setText("Ekle");
        ekle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_butonActionPerformed(evt);
            }
        });

        guncelle_buton.setText("Güncelle");
        guncelle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelle_butonActionPerformed(evt);
            }
        });

        sil_buton.setText("Sil");
        sil_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_butonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Balık Türü Kodu", "Balık Türü"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getir_buton.setText("Getir");
        getir_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getir_butonActionPerformed(evt);
            }
        });

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                            .addComponent(balik_turu_kodu_field, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(57, 57, 57)
                            .addComponent(balik_turu_field)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ekle_buton)
                        .addGap(88, 88, 88)
                        .addComponent(guncelle_buton)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sil_buton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(getir_buton)))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ekle_buton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sil_buton)
                                .addComponent(getir_buton)
                                .addComponent(guncelle_buton)))
                        .addGap(56, 56, 56)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(balik_turu_kodu_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(balik_turu_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void balik_turu_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balik_turu_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balik_turu_fieldActionPerformed

    private void ekle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_butonActionPerformed
        
        String balik_tur_kodu=balik_turu_kodu_field.getText().toUpperCase();
        String balik_turu_adi=balik_turu_field.getText().toUpperCase();
        
        String sorgu = " insert into balik_turleri"
                 + " (balik_tur_kodu,balik_turu)"
                 + " values (?, ?)";
        
        
        try
        {

            preparedstatement=conn.prepareStatement(sorgu);

            preparedstatement.setString(1,balik_tur_kodu);
            preparedstatement.setString(2,balik_turu_adi);

            preparedstatement.execute();

        }
                       
       
         
         catch (SQLException ex) 
         {
             
            String hata_mesajı = ex.getMessage();
            
            boolean pk_kontrol = hata_mesajı.contains("PK");    //Primary Key
             
            boolean null_kontrol = hata_mesajı.contains("NULL");

            if(pk_kontrol == true)
            {
             JOptionPane.showMessageDialog(this, "Girdiğiniz ilaç türü kodu kayitlarda mevcuttur!","UYARI",JOptionPane.WARNING_MESSAGE);

             balik_turu_kodu_field.requestFocus();

             return;
            }
            
            else if (null_kontrol)
            {
               
             JOptionPane.showMessageDialog(this, "İlaç türü kodu boş geçilemez!","UYARI",JOptionPane.WARNING_MESSAGE);

             balik_turu_kodu_field.requestFocus();

             return;
                       
            }
                  
             
             ex.printStackTrace();
         }
         
        JOptionPane.showMessageDialog(this,"Kayit Başarıyla Eklendi!");
        
        balik_turu_field.setText("");
        balik_turu_kodu_field.setText("");
        
    }//GEN-LAST:event_ekle_butonActionPerformed

    private void getir_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getir_butonActionPerformed
      
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        
        String sorgu = " Select balik_tur_kodu,balik_turu From balik_turleri order by balik_tur_kodu";

        String balik_tur_kodu;
        String balik_turu;
        
        
        
        try
        {
            
            statement=conn.createStatement();
            
            resultset = statement.executeQuery(sorgu);
            
            while(resultset.next())
            {
             
               balik_tur_kodu=resultset.getString("balik_tur_kodu");
               balik_turu=resultset.getString("balik_turu");
               
               Object [] eklenecek = {balik_tur_kodu,balik_turu};
               
               model.addRow(eklenecek);
            
                
            }
            
            resultset.close();
            
        }
                       
       
         
         catch (SQLException ex) 
         {
             
           ex.printStackTrace();
           return;
                  
         }
    
        
  
        
        
        
    }//GEN-LAST:event_getir_butonActionPerformed

    private void guncelle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelle_butonActionPerformed
       
        String balik_tur_kodu=balik_turu_kodu_field.getText();
        String balik_turu_adi=balik_turu_field.getText().toUpperCase();
        
        String sorgu = " Update balik_turleri Set balik_turu=?  Where balik_tur_kodu=?   ";
      

        
        if(balik_tur_kodu.equals(""))
        {
            
             JOptionPane.showMessageDialog(this, "İlaç türü kodu boş geçilemez!","UYARI",JOptionPane.WARNING_MESSAGE);

             balik_turu_kodu_field.requestFocus();

             return;
            
        }
        
        boolean kontrol=kod_kontrol(balik_tur_kodu);
        
        if(kontrol==false)
        {
           JOptionPane.showMessageDialog(this, "Böyle bir ilaç türü kodu kayıtlarda bulunmamaktadır!","UYARI",JOptionPane.WARNING_MESSAGE); 
           
           balik_turu_kodu_field.requestFocus();
           
           return;
           
        }
        
        
        
        try
        {

            preparedstatement=conn.prepareStatement(sorgu);

            preparedstatement.setString(1,balik_turu_adi);
            preparedstatement.setString(2,balik_tur_kodu);

            preparedstatement.execute();

        }
                       
       
         
         catch (SQLException ex) 
         {
             
           ex.printStackTrace();
           return;
                  
         }
         
        JOptionPane.showMessageDialog(this,"Kayit Başarıyla Güncellendi!");
        
        balik_turu_field.setText("");
        balik_turu_kodu_field.setText("");
        
    }//GEN-LAST:event_guncelle_butonActionPerformed

    private void sil_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_butonActionPerformed
        
        String balik_tur_kodu=balik_turu_kodu_field.getText();
        
        if(balik_tur_kodu.equals(""))
        {
            
             JOptionPane.showMessageDialog(this, "İlaç türü kodu boş geçilemez!","UYARI",JOptionPane.WARNING_MESSAGE);

             balik_turu_kodu_field.requestFocus();

             return;
            
        }
        
        boolean kontrol=kod_kontrol(balik_tur_kodu);
        
        if(kontrol==false)
        {
           JOptionPane.showMessageDialog(this, "Böyle bir ilaç türü kodu kayıtlarda bulunmamaktadır!","UYARI",JOptionPane.WARNING_MESSAGE); 
           
           balik_turu_kodu_field.requestFocus();
           
           return;
           
        }
        
        
        try
        {
            
            
            preparedstatement=conn.prepareStatement(
                    "DELETE FROM balik_turleri"
                            + " WHERE balik_tur_kodu=?");
            
            preparedstatement.setString(1,balik_tur_kodu);
            
            preparedstatement.execute();
        }
        
        catch (SQLException ex) 
        {
            
            String fk_kontol = ex.getMessage();
            
           if(fk_kontol.contains("FK"));   //Foreign Key Hatası
           {
           JOptionPane.showMessageDialog(this, "Silmeye çalıştığınız ilaç türü kodu ilaç tanım tablosunda bulunmaktadır, silemezsiniz!!","UYARI",JOptionPane.WARNING_MESSAGE);
           }
           return;
            
          
            
        }
        
        
        
        
        JOptionPane.showMessageDialog(this,"Kayit Başarıyla Silindi"); 
        
        balik_turu_field.setText("");
        balik_turu_kodu_field.setText("");
        
        
    }//GEN-LAST:event_sil_butonActionPerformed

    private void balik_turu_kodu_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_balik_turu_kodu_fieldKeyTyped
       
        String metin = balik_turu_kodu_field.getText();
        int uzunluk = metin.length();
        
        char karakter = evt.getKeyChar();
    
        if( !(Character.isDigit(karakter)) || uzunluk == 4 )
        {
         evt.consume();
        }
        
    }//GEN-LAST:event_balik_turu_kodu_fieldKeyTyped

    private void balik_turu_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_balik_turu_fieldKeyTyped
       
   
        char karakter = evt.getKeyChar();
    
        if( (Character.isDigit(karakter)) )
        {
         evt.consume();
        }
        
    }//GEN-LAST:event_balik_turu_fieldKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.dispose();
        balik_islem_ekrani ekran = new balik_islem_ekrani();
        ekran.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
     public boolean kod_kontrol(String kod)
    {
        
        String sorgu= " Select balik_tur_kodu from "
                + "balik_turleri"
                + " where balik_tur_kodu=?";
        
        
        
        try
        {
            PreparedStatement st = conn.prepareStatement(sorgu);

           
            st.setString(1,kod); //Soru işareti yerine tc gönderiyoruz
           
            ResultSet rs = st.executeQuery();
            
           
            if(rs.next())
            {
                return true;
            }    
            
        } 
        
        
        
        catch (SQLException ex)
        {
             Logger.getLogger(Giris_Ekrani.class.getName()).log(Level.SEVERE, null, ex);
             
        }
        
        return false;
        
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
            java.util.logging.Logger.getLogger(balik_turleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(balik_turleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(balik_turleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(balik_turleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new balik_turleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balik_turu_field;
    private javax.swing.JTextField balik_turu_kodu_field;
    private javax.swing.JButton ekle_buton;
    private javax.swing.JButton getir_buton;
    private javax.swing.JButton guncelle_buton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sil_buton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
