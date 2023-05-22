
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author uwilljo
 */
public class Server extends javax.swing.JFrame {

    /**
     * Creates new form Server
     */
    private static int count;

    public Server() {
        initComponents();
        //Connect();
        setVisible(true);
        Connect();
    }

    public void Connect() {
        try {
            ServerSocket svrSocket = new ServerSocket(4000);
            jta_display.append("\nServer Started !!!!!");

            while (true) {
                Socket socket = svrSocket.accept();
                jta_display.append("\nConnected to Client " + count++ + " " + 
                        socket.getRemoteSocketAddress() + " @ " + new Date());

                new ClientWork(socket).start();
            }

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

        btn_Add_Inventory = new javax.swing.JButton();
        btn_Check_Inventory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_display = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Add_Inventory.setText("Update Inventory");
        btn_Add_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Add_InventoryActionPerformed(evt);
            }
        });

        btn_Check_Inventory.setText("Check Inventory");
        btn_Check_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Check_InventoryActionPerformed(evt);
            }
        });

        jta_display.setColumns(20);
        jta_display.setRows(5);
        jScrollPane1.setViewportView(jta_display);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Server Side Inventory Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Add_Inventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Check_Inventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Add_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Check_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Add_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Add_InventoryActionPerformed
        Update_Inventory add = new Update_Inventory();
        add.setVisible(true);
    }//GEN-LAST:event_btn_Add_InventoryActionPerformed

    private void btn_Check_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Check_InventoryActionPerformed
        Check_Inventory check = new Check_Inventory();
        check.setVisible(true);
    }//GEN-LAST:event_btn_Check_InventoryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Server();
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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Server().setVisible(true);
            }
        });
    }

    class ClientWork extends Thread {

        private Socket socket;
        private Connection conn;
        private DataInputStream input;
        private DataOutputStream output;

        public ClientWork(Socket socket) {
            this.socket = socket;

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

        @Override
        public void run() {
            try {
                connect();
                input = new DataInputStream(socket.getInputStream());
                output = new DataOutputStream(socket.getOutputStream());

                String option = input.readUTF();
                
                System.out.println("Received Option " + option);

                switch (option) {
                    case "Register":
                        registerUser();
                        break;

                    case "Authenticate":
                        authenticateUser();
                        break;

                    case "getModel":
                        String pdt_name = input.readUTF();
                        getModelnSize(pdt_name);

                        break;

                    case "getPrice":
                        getPrice();
                        break;

                    case "recordSales":
                        recordSales();
                        break;
                        

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void registerUser() {
            try {
                ObjectInputStream objectInput = new ObjectInputStream(socket.getInputStream());
                //ObjectOutputStream objectOutput = new ObjectOutputStream(socket.getOutputStream());

                Registration object = (Registration) objectInput.readObject();

                String name = object.getFirstName();
                String lastName = object.getLastName();
                String phone = object.getPhone();
                String id = object.getIdNumber();
                String password = object.getPassword();

                String gender = getGender(id);

                boolean validDate = isValidDate(id);

                if (validDate && isValidPhone(phone) && isValidID(id)) {

                    String userID = createID(name, lastName);
                    jta_display.append("\n Name" + "\t" + "lastName" + "\t" + "phone" + "\t" + 
                            "id" + "\t" + "password" + "\t" + "Gender" + "\t" + "userID" + "\n");
                    jta_display.append("\n" + name + "\t" + lastName + "\t" + phone + "\t" + id + 
                            "\t" + password + "\t" + gender + "\t" + userID + "\n");

                    String query = "INSERT INTO users(idUser, firstname, lastname, phone_Number, "
                            + "gender, id, password) VALUES(?,?,?,?,?,?,?)";
                    PreparedStatement ps = conn.prepareStatement(query);

                    ps.setString(1, userID);
                    ps.setString(2, name);
                    ps.setString(3, lastName);
                    ps.setString(4, phone);
                    ps.setString(5, gender);
                    ps.setString(6, id);
                    ps.setString(7, password);

                    ps.execute();
                    jta_display.append("\n New User : " + userID + " added to database");

                    output.writeUTF(userID);
                    output.flush();

                } else {
                    jta_display.append("\n New User could not be added to database");
                    output.writeUTF("Registration Error!!!!!! Data Validation unsuccessful");
                    output.flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void authenticateUser() {
            try {
                String username = input.readUTF();
                String password2 = input.readUTF();

                System.out.println(username + " " + password2);

                //Statement stmt = conn.createStatement();
                String query = "SELECT password FROM users WHERE idUser=?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, username);

                ResultSet rs = ps.executeQuery();

                String mypassword = "";
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                    mypassword = rs.getString(1);
                }

                if (password2.equals(mypassword)) {
                    output.writeBoolean(true);
                } else {
                    output.writeBoolean(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void recordSales() {

            Random random = new Random();
            int salesID = random.nextInt(10000);

            try {

                ObjectInputStream objectInput = new ObjectInputStream(socket.getInputStream());

                //ShoppingCart object = (ShoppingCart) objectInput.readObject();
                
                String product = input.readUTF();
                String model = input.readUTF();// object.getModel();
                int size = input.readInt();//object.getSize();
                int quantity = input.readInt();//object.getQuantity();
                double price = input.readDouble();//object.getPrice();

                System.out.println(product + " " + model + " " + size + " " + quantity + " " + price);

                int pdt_ID = getProductID(size, model);

                double totalPrice = quantity * price;
                double vat = calcVAT(totalPrice);

                output.writeDouble(totalPrice);
                output.flush();

                String query = "INSERT INTO sales(pdt_ID, quantity, totalPrice,vat) VALUES(?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(query);            ;
                ps.setInt(1, pdt_ID);
                ps.setInt(2, quantity);
                ps.setDouble(3, totalPrice);
                ps.setDouble(4,vat);

                ps.executeUpdate();
                jta_display.append("\n New sales : " + salesID + " added to database");

                output.writeInt(salesID);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        public int getProductID(int size, String model) {
            int pdt_ID = 0;
            try {
                String query2 = "SELECT pdt_ID FROM products WHERE  size = ? AND model = ?";              
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, size);
                ps2.setString(2, model);
                ResultSet rs = ps2.executeQuery();
                pdt_ID = rs.getInt(1);

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.toString());
            }

            return pdt_ID;
        }

        public void getPrice() {
            try {

                int size = input.readInt();
                String model = input.readUTF();

                System.out.println(size + " " + model);
                String query = "SELECT price FROM products WHERE  size = ? AND model = ?";
//AND model = ?
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, size);
                ps.setString(2, model);
                ResultSet rs = ps.executeQuery();                
                double price = 0.0;
                while (rs.next()) {
                    //quantity = rs.getInt(1);
                    price = rs.getDouble(1);

                    //System.out.println(quantity);
                    System.out.println(price + "");
                }

                //output.writeInt(quantity);
                output.writeDouble(price);
                output.flush();

                System.out.println("retrieved info");

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.toString());
            }
        }

        public void getModelnSize(String pdt_name) {
            try {
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output = new DataOutputStream(socket.getOutputStream());

                String query = "Select model,size from stock_mgt.products where pdt_Name = ? ";

                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, pdt_name);

                String[] model = new String[6];
                int[] size = new int[10];
                ResultSet rs = ps.executeQuery();

                int count = 0;
                while (rs.next()) {
                    model[count] = rs.getString("model");
                    size[count] = rs.getInt("size");
                    count++;
                }
                output.writeInt(count);

                for (int i = 0; i < count; i++) {
                    output.writeInt(size[i]);
                    output.writeUTF(model[i]);

                }
                output.flush();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        public String getGender(String ID) {
            String gender = "N";
            String ID2 = ID.substring(6, 10);
            int gen = Integer.parseInt(ID2);
            System.out.println(ID2);

            if (gen < 5000) {
                gender = "F";
            }
            if (gen >= 5000 && gen < 10000) {
                gender = "M";
            }

            return gender;
        }//----------------------------------------------------------------------------/4

        public boolean isValidDate(String id) {
            //[YYMMDD]

            String ID2 = id.substring(0, 5);
            int month = Integer.parseInt(id.substring(2, 3));
            int day = Integer.parseInt(id.substring(4, 5));

            boolean trueday = false;
            boolean truemonth = false;

            if (day > 0 && day <= 31) {
                trueday = true;
            } else {
                trueday = false;
            }

            if (month > 0 && month <= 12) {
                truemonth = true;
            } else {
                truemonth = true;
            }

            if (trueday == true && truemonth == true) {
                return true;
            } else {
                return false;
            }
        }//---------------------------------------------/4

        public double calcVAT(double totalPrice){
            double vat = totalPrice * 0.15;
            return vat;
        }
        public boolean isValidPhone(String phone) {
            if (phone.length() == 10) {
                return true;
            } else {
                return false;
            }
        }//-----------------------------------------/2

        public boolean isValidID(String id) {
            if (id.length() != 13) {
                return false;
            } else {
                return true;
            }
        }

        public String createID(String name, String lname) {
            String id = "u" + lname.substring(0, 4) + name.substring(0, 2);
            return id.toLowerCase();
        }//---------------------------------------------/2

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add_Inventory;
    private javax.swing.JButton btn_Check_Inventory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta_display;
    // End of variables declaration//GEN-END:variables
}
