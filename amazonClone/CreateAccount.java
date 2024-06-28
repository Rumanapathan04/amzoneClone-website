package amazonClone;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet; 
//import java.sql.*;

public class CreateAccount extends javax.swing.JFrame 
{

    // Creates new form CreateAccount
	private static final long serialVersionUID = 1L;

	public CreateAccount() 
    {
        initComponents();    
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2 , size.height/2 - getHeight()/2); 
    }
    
    private void initComponents()
    {

        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_number = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mobileNumber = new javax.swing.JLabel();
        lbl_password = new javax.swing.JPasswordField();
        password_underlbl = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 265, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\amazon logo.png")); 

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon("")); 

        lbl_number.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt) 
            {
                lbl_numberKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\CreateAct.png")); 

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\Project\\continue.png")); 
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\signup2.png")); 

        lbl_username.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                lbl_usernameKeyReleased(evt);
            }
        });

        lbl_name.addKeyListener(new java.awt.event.KeyAdapter() 
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                lbl_nameKeyReleased(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Passwordd.png")); 

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\mobilenumber.png")); 
        lbl_email.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                lbl_emailActionPerformed(evt);
            }
        });
        lbl_email.addKeyListener(new java.awt.event.KeyAdapter() 
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                lbl_emailKeyReleased(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\email.png")); 

        lbl_password.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt) 
            {
                lbl_passwordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_number)
                            .addComponent(lbl_email)
                            .addComponent(lbl_password)
                            .addComponent(lbl_name)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password_underlbl))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_username)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_number, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobileNumber)
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_underlbl)
                .addGap(13, 13, 13)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addGap(348, 348, 348))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 700));

        pack();
    }

    private void lbl_numberKeyReleased(java.awt.event.KeyEvent evt) 
    {
        mobileNumber.setText("");
    }
       static int close = 0;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        String url ="jdbc:mysql://localhost:3306/amazon?useSSL=true";
        String user = "root";
        String pass = "ROOT";

        int update=0;
        
        if(lbl_name.getText().trim().isEmpty())
        {
            lbl_username.setText("Enter Name");
        }
        else if(lbl_number.getText().length()!=10)
        {
//              lbl_number.setText("Valid Number");
            mobileNumber.setText("Enter a valid mobile number");
        }
        else if(lbl_password.getText().length()<5)
        {
        password_underlbl.setText("Strength : Low");
        }
       
        else
        {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection conn;
                conn = DriverManager.getConnection(url,user,pass);
                System.out.println("Connection successful!");
                
                 try{
                String query = "insert into signin values(?,?,?,?,?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                int cnt = 1;
               
                String search = "select * from signin where email = ? or mobile_num = ?";
                PreparedStatement find = conn.prepareStatement(search);
                String email = lbl_email.getText();
                String number = lbl_number.getText();
                
                find.setString(1, email);
                find.setString(2,number);
                
                ResultSet rs = find.executeQuery();
                
                
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null,"Account already exist!");
//                System.out.print("Account already exist!");
                  
                }
                else
                {
                  stmt.setInt(1,cnt++);
                stmt.setString(2, lbl_name.getText());
                stmt.setString(3, number);
                stmt.setString(4, email);
                stmt.setString(5, lbl_password.getText());
                
                update = stmt.executeUpdate();
                System.out.println(update);
                conn.close();
                
                JOptionPane.showMessageDialog(null,"ACCOUNT CREATED SUCCESFULLY!!");
                close = 1;
                setVisible(false);
                Login lf = new Login();
                lf.setVisible(true);
//                new CreateAccount().setVisible(false);
                }
          
                    
            }
            catch(SQLException e)
            {
                 JOptionPane.showMessageDialog(null,e);
            }
     
            }
            catch(Exception e)
            {

                JOptionPane.showMessageDialog(null,e);
                System.out.println("Connection failed");
            }
        }
        
    }

    private void lbl_usernameKeyReleased(java.awt.event.KeyEvent evt) 
    {
        lbl_username.setText("");
    }

    private void lbl_nameKeyReleased(java.awt.event.KeyEvent evt) 
    {
       
    }

    private void lbl_emailActionPerformed(java.awt.event.ActionEvent evt)
    {
    	
    }

    private void lbl_emailKeyReleased(java.awt.event.KeyEvent evt) 
    {
    	
    }

    private void lbl_passwordKeyReleased(java.awt.event.KeyEvent evt)
    {
        password_underlbl.setText("");
    }

    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                CreateAccount ca = new CreateAccount();
                ca.setVisible(true);
                if(close==1)
                ca.setVisible(false);
            }
        });
    }

    // Variables declaration 
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lbl_email;
    private javax.swing.JTextField lbl_name;
    private javax.swing.JTextField lbl_number;
    private javax.swing.JPasswordField lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel mobileNumber;
    private javax.swing.JLabel password_underlbl;
    // End of variables declaration
}
