
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
public class davranislar extends javax.swing.JFrame {

    /**
     * Creates new form davranislar
     */
    public davranislar() {
        initComponents();
                 Toolkit toolkit = getToolkit();
        Dimension dim = toolkit.getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setTitle("Davranış Biçimi Ekranı");
    }
    
    
    public Object item = null;
    
    
     public Statement statement = null;
    
     public PreparedStatement preparedstatement= null;
     
     public  ResultSet resultset = null;
     
     Database_Connect islem = new Database_Connect();
        
     public Connection conn = islem.con;
     
     
     

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
        davranis_kodu_field = new javax.swing.JTextField();
        davranis_adi_field = new javax.swing.JTextField();
        ekle_buton = new javax.swing.JButton();
        sil_buton = new javax.swing.JButton();
        guncelle_buton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        getir_buton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Davranış Kodu");

        jLabel2.setText("Davranış Adı");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, davranis_adi_field, org.jdesktop.beansbinding.ObjectProperty.create(), davranis_kodu_field, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        davranis_kodu_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                davranis_kodu_fieldActionPerformed(evt);
            }
        });
        davranis_kodu_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                davranis_kodu_fieldKeyTyped(evt);
            }
        });

        davranis_adi_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                davranis_adi_fieldActionPerformed(evt);
            }
        });
        davranis_adi_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                davranis_adi_fieldKeyTyped(evt);
            }
        });

        ekle_buton.setText("Ekle");
        ekle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_butonActionPerformed(evt);
            }
        });

        sil_buton.setText("Sil");
        sil_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_butonActionPerformed(evt);
            }
        });

        guncelle_buton.setText("Güncelle");
        guncelle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelle_butonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Davranış Kodu", "Davranış Adi"
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
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(davranis_kodu_field, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(davranis_adi_field)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ekle_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(guncelle_buton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sil_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(getir_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ekle_buton)
                            .addComponent(sil_buton)
                            .addComponent(getir_buton)
                            .addComponent(guncelle_buton))
                        .addGap(68, 68, 68)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(davranis_kodu_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(davranis_adi_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void davranis_kodu_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_davranis_kodu_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_davranis_kodu_fieldActionPerformed

    private void davranis_adi_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_davranis_adi_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_davranis_adi_fieldActionPerformed

    private void ekle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_butonActionPerformed
       
        String davranis_kodu=davranis_kodu_field.getText().toUpperCase();
        String davranis_tipi=davranis_adi_field.getText().toUpperCase();
        
        String sorgu = " insert into davranis"
                 + " (davranis_kodu,davranis_tipi)"
                 + " values (?, ?)";
        
        
        try
        {

            preparedstatement=conn.prepareStatement(sorgu);

            preparedstatement.setString(1,davranis_kodu);
            preparedstatement.setString(2,davranis_tipi);

            preparedstatement.execute();

        }
                       
       
         
         catch (SQLException ex) 
         {
             
            String hata_mesaji = ex.getMessage();
            
            boolean pk_kontrol = hata_mesaji.contains("PK");    //Primary Key
             
            boolean null_kontrol = hata_mesaji.contains("NULL");

            if(pk_kontrol == true)
            {
             JOptionPane.showMessageDialog(this, "Girdiğiniz davranis kodu kayitlarda mevcuttur!","UYARI",JOptionPane.WARNING_MESSAGE);

             davranis_kodu_field.requestFocus();

             return;
            }
            
            else if (null_kontrol)
            {
               
             JOptionPane.showMessageDialog(this, "davranis kodu boş geçilemez!","UYARI",JOptionPane.WARNING_MESSAGE);

             davranis_kodu_field.requestFocus();

             return;
                       
            }
                  
         }
         
        JOptionPane.showMessageDialog(this,"Kayit Başarıyla Eklendi!");
        
        davranis_adi_field.setText("");
        davranis_kodu_field.setText("");
        
    }//GEN-LAST:event_ekle_butonActionPerformed

    private void getir_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getir_butonActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        
        String sorgu = " Select davranis_kodu,davranis_tipi From davranis order by davranis_kodu";

        String davranis_kodu;
        String davranis_tipi;
        
        
        
        try
        {
            
            statement=conn.createStatement();
            
            resultset = statement.executeQuery(sorgu);
            
            while(resultset.next())
            {
             
               davranis_kodu=resultset.getString("davranis_kodu");
               davranis_tipi=resultset.getString("davranis_tipi");
               
               Object [] eklenecek = {davranis_kodu,davranis_tipi};
               
               model.addRow(eklenecek);
            
                
            }
            
            resultset.close();
            
        }
                       
       
         
         catch (SQLException ex) 
         {
             
           
            ex.printStackTrace();
                  
         }
        
        
        
        
        
    }//GEN-LAST:event_getir_butonActionPerformed

    private void guncelle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelle_butonActionPerformed
       
        String davranis_kodu=davranis_kodu_field.getText().toUpperCase();
        String davranis_tipi=davranis_adi_field.getText().toUpperCase();
        
        String sorgu = " UPDATE davranis set davranis_tipi=? WHERE davranis_kodu=?";
        
        if(davranis_kodu.equals("null"))
        {
            
             JOptionPane.showMessageDialog(this, "davranis kodu boş geçilemez!","UYARI",JOptionPane.WARNING_MESSAGE);

             davranis_kodu_field.requestFocus();

             return;
            
        }
        
        boolean kontrol=kod_kontrol(davranis_kodu);
        
        if(kontrol==false)
        {
           JOptionPane.showMessageDialog(this, "Böyle bir davranis kodu kayıtlarda bulunmamaktadır!","UYARI",JOptionPane.WARNING_MESSAGE); 
           
           davranis_kodu_field.requestFocus();
           
           return;
           
        }

        try
        {

            preparedstatement=conn.prepareStatement(sorgu);

            preparedstatement.setString(1,davranis_tipi);
            preparedstatement.setString(2,davranis_kodu);
            
            preparedstatement.execute();

        }
                       
       
         
         catch (SQLException ex) 
         {
             
           ex.printStackTrace();
           return;
                  
         }
         
        JOptionPane.showMessageDialog(this,"Kayit Başarıyla Güncellendi!");
        
        davranis_adi_field.setText("");
        davranis_kodu_field.setText("");
        
    }//GEN-LAST:event_guncelle_butonActionPerformed

    private void sil_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_butonActionPerformed
        
        String davranis_kodu=davranis_kodu_field.getText();
        String davranis_tipi=davranis_adi_field.getText();

        if(davranis_kodu.equals("null"))
        {
            
             JOptionPane.showMessageDialog(this, "davranis kodu boş geçilemez!","UYARI",JOptionPane.WARNING_MESSAGE);

             davranis_kodu_field.requestFocus();

             return;
            
        }
        
        boolean kontrol=kod_kontrol(davranis_kodu);
        
        if(kontrol==false)
        {
           JOptionPane.showMessageDialog(this, "Böyle bir davranis kodu kayıtlarda bulunmamaktadır!","UYARI",JOptionPane.WARNING_MESSAGE); 
           
           davranis_kodu_field.requestFocus();
           
           return;
           
        }
        
        try
        {
            davranis_kodu = davranis_kodu_field.getText();
            
            preparedstatement=conn.prepareStatement(
                    "DELETE FROM davranis"
                            + " WHERE davranis_kodu=?");
            
            preparedstatement.setString(1,davranis_kodu);
            
            preparedstatement.execute();
        }
        
        catch (SQLException ex) 
        {
           
            String fk_kontol = ex.getMessage();
            
           if(fk_kontol.contains("FK"));   //Foreign Key Hatası
           JOptionPane.showMessageDialog(this, "Silmeye çalıştığınız reçete kodu ilaç tanım tablosunda bulunmaktadır, silemezsiniz!!","UYARI",JOptionPane.WARNING_MESSAGE);
           
           return;
            
        }
        
        
        JOptionPane.showMessageDialog(this,"Kayit Başarıyla Silindi"); 
        
        davranis_adi_field.setText("");
        davranis_kodu_field.setText("");
        
    }//GEN-LAST:event_sil_butonActionPerformed

    private void davranis_kodu_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_davranis_kodu_fieldKeyTyped
        
       String metin = davranis_kodu_field.getText();
       int uzunluk = metin.length();
       
       char karakter = evt.getKeyChar();
    
       if( !(Character.isDigit(karakter)) || uzunluk == 4 )
        {
         evt.consume();
        }
        
        
    }//GEN-LAST:event_davranis_kodu_fieldKeyTyped

    private void davranis_adi_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_davranis_adi_fieldKeyTyped
        

       char karakter = evt.getKeyChar();
    
       if( (Character.isDigit(karakter))  )
       {
           
        evt.consume();
        
       } 
        
    }//GEN-LAST:event_davranis_adi_fieldKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        this.dispose();
        balik_islem_ekrani ekran = new balik_islem_ekrani();
        ekran.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean kod_kontrol(String kod)
    {
        
        String sorgu= " Select davranis_kodu from "
                + "davranis"
                + " where davranis_kodu=?";
        
        
        
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
            java.util.logging.Logger.getLogger(davranislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(davranislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(davranislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(davranislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new davranislar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField davranis_adi_field;
    private javax.swing.JTextField davranis_kodu_field;
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
