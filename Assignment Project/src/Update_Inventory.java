
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Update_Inventory extends javax.swing.JFrame {

    /**
     * Creates new form Update_Inventory
     */
    private Connection conn;

    public Update_Inventory() {
        initComponents();
        setVisible(true);
        connect();

    }

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!!!!");

            conn = DriverManager.getConnection("jdbc:mysql://localhost/stock_mgt", "root", "");
            System.out.println("Connected to Database!!!!");

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_name = new javax.swing.JComboBox<>();
        cmb_size = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtf_Quantity = new javax.swing.JTextField();
        cmb_Model = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jbtn_Add = new javax.swing.JButton();
        jbtn_Cancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtf_Price = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Update Inventory");

        jLabel2.setText("PRODUCT NAME");

        jLabel3.setText("SIZE");

        cmb_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SHOE NAME", "NIKE", "ADIDAS ", "PUMA", "REEBOK", " " }));
        cmb_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_nameActionPerformed(evt);
            }
        });

        cmb_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel5.setText("Quantity");

        jtf_Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_QuantityActionPerformed(evt);
            }
        });

        cmb_Model.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SHOE MODEL", " " }));
        cmb_Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ModelActionPerformed(evt);
            }
        });

        jLabel6.setText("Model");

        jbtn_Add.setText("Update  Product");
        jbtn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_AddActionPerformed(evt);
            }
        });

        jbtn_Cancel.setText("Cancel");
        jbtn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_CancelActionPerformed(evt);
            }
        });

        jLabel7.setText("PRICE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(118, 118, 118)
                                .addComponent(jtf_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(cmb_name, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmb_Model, 0, 241, Short.MAX_VALUE)
                                    .addComponent(cmb_size, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtf_Quantity)
                                        .addGap(97, 97, 97))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_Cancel)
                    .addComponent(jbtn_Add))
                .addGap(97, 97, 97))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_QuantityActionPerformed

    private void jbtn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_CancelActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jbtn_CancelActionPerformed

    private void jbtn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_AddActionPerformed
        updateProducts();
    }//GEN-LAST:event_jbtn_AddActionPerformed

    public void updateProducts() {
        try {

            String name = cmb_name.getItemAt(cmb_name.getSelectedIndex());
            int size = Integer.parseInt(cmb_size.getItemAt((cmb_size.getSelectedIndex())));

            String model = cmb_Model.getItemAt(cmb_Model.getSelectedIndex());

            int quantity = Integer.parseInt(jtf_Quantity.getText().trim());

            double price = Double.parseDouble(jtf_Price.getText().trim());

            String query = "UPDATE products SET quantity = ?,price = ?  WHERE model = ? AND size = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, quantity);
            ps.setDouble(2, price);
            ps.setString(3, model);
            ps.setInt(4, size);

            int result = ps.executeUpdate();
            if(result>0)
                JOptionPane.showMessageDialog(null,"Successfully updated infor");
            else
                JOptionPane.showMessageDialog(null,"The update was unsuccessful");

            //PreparedStatement ps = conn.prepareStatement(query);
            //ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
// System.out.println(e.printStackTrace());
        }
    }


    private void cmb_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_nameActionPerformed
        String pdt_Name = cmb_name.getItemAt(cmb_name.getSelectedIndex());
        retrieveInfo(pdt_Name);

    }//GEN-LAST:event_cmb_nameActionPerformed

    public void retrieveInfo(String pdt_Name) {
        try {
            

            String query = "Select model,size from stock_mgt.products where pdt_Name = ? ";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, pdt_Name);

            String[] model = new String[6];
            int[] size = new int[10];

            ResultSet rs = ps.executeQuery();

            int count = 0;
            while (rs.next()) {
                model[count] = rs.getString("model");
                size[count] = rs.getInt("size");
                count++;
            }

            cmb_Model.removeAllItems();
            cmb_size.removeAllItems();

            for (int i = 0; i < count; i++) {
                String item = model[i];
                cmb_Model.addItem(item);
            }

            for (int i = 0; i < count; i++) {
                int mysize = size[i];
                cmb_size.addItem("" + mysize);
            }

            ps.close();
            JOptionPane.showMessageDialog(null, "Successfully retrieve infor");

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    private void cmb_ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ModelActionPerformed

    }//GEN-LAST:event_cmb_ModelActionPerformed

    /*public void SelectQuantitynPrice() {
        try {
            int size = Integer.parseInt(cmb_size.getItemAt((cmb_size.getSelectedIndex())));

            String model = cmb_Model.getItemAt(cmb_Model.getSelectedIndex());

            String query = "SELECT quantity,price FROM stock_mgt.products WHERE  model = ? AND size = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, model);
            ps.setInt(2, size);
            

            ResultSet rs = ps.executeQuery();

            String quantity = rs.getString("quantity");
            double price = rs.getDouble("price");

            jtf_Old_Price.setText(quantity);
            jtf_Old_Quantity.setText(price + "");

            System.out.println("info selected");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Update_Inventory();
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
            java.util.logging.Logger.getLogger(Update_Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_Model;
    private javax.swing.JComboBox<String> cmb_name;
    private javax.swing.JComboBox<String> cmb_size;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtn_Add;
    private javax.swing.JButton jbtn_Cancel;
    private javax.swing.JTextField jtf_Price;
    private javax.swing.JTextField jtf_Quantity;
    // End of variables declaration//GEN-END:variables
}
