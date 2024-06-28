package amazonClone;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	public Login() {
	        initComponents();
	        Toolkit toolkit = getToolkit();
	        Dimension size = toolkit.getScreenSize();
	        setLocation(size.width/2 - getWidth()/2 , size.height/2 - getHeight()/2); 
	        
	           
	    }

	    private void initComponents() 
	    {
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jTable1 = new javax.swing.JTable();
	        list1 = new java.awt.List();
	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jPanel2 = new javax.swing.JPanel();
	        jLabel2 = new javax.swing.JLabel();
	        username = new javax.swing.JTextField();
	        jButton1 = new javax.swing.JButton();
	        jLabel4 = new javax.swing.JLabel();
	        lbl_username = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        jSeparator1 = new javax.swing.JSeparator();
	        jButton2 = new javax.swing.JButton();

	        jTable1.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] 
	            	{
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null}
	                },
	            new String [] 
	            	{
	                "Title 1", "Title 2", "Title 3", "Title 4"
	                }
	        ));
	        jScrollPane1.setViewportView(jTable1);

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

	        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

	        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\amazon logo.png")); 

	        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
	        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

	        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Sign in.png")); 

	        username.addActionListener(new java.awt.event.ActionListener()
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                usernameActionPerformed(evt);
	            }
	        });
	        username.addKeyListener(new java.awt.event.KeyAdapter()
	        {
	            public void keyReleased(java.awt.event.KeyEvent evt) 
	            {
	                usernameKeyReleased(evt);
	            }
	        });

	        jButton1.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\continue.png"));
	        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
	        jButton1.addActionListener(new java.awt.event.ActionListener() 
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\signup2.png")); 

	        lbl_username.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyReleased(java.awt.event.KeyEvent evt) {
	                lbl_usernameKeyReleased(evt);
	            }
	        });

	        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\user.png")); 

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(9, 9, 9)
	                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(jLabel4)
	                            .addGroup(jPanel2Layout.createSequentialGroup()
	                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGap(23, 23, 23))))
	                    .addComponent(username)
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jLabel5))
	                        .addGap(0, 0, Short.MAX_VALUE)))
	                .addContainerGap())
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(22, 22, 22)
	                .addComponent(jLabel5)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(lbl_username)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
	                .addComponent(jLabel4)
	                .addContainerGap())
	        );

	        jButton2.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Create.png")); 
	        jButton2.setMaximumSize(new java.awt.Dimension(377, 35));
	        jButton2.setMinimumSize(new java.awt.Dimension(377, 35));
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(350, 350, 350)
	                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(359, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                .addGap(342, 342, 342)
	                .addComponent(jLabel1)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(233, 233, 233)
	                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(18, 18, 18)
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(39, 39, 39)
	                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(61, 61, 61)
	                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(28, 28, 28)
	                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(89, Short.MAX_VALUE))
	        );

	        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 670));

	        pack();
	    }

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
	    {        
	        String url ="jdbc:mysql://localhost:3306/amazon?useSSL=true";
	        String user = "root";
	        String pass = "ROOT";
	        
	        
	        
	        if(username.getText().trim().isEmpty())
	        {
	            lbl_username.setText("Enter Username");
	        }
	        else
	        {
	        try
	        {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            
	            Connection conn;
	            conn = DriverManager.getConnection(url,user,pass);
	            System.out.println("Connection successful!");
	            
	            String sql = "Select * from signin where email =? or mobile_num = ?";
	            PreparedStatement pst = conn.prepareStatement(sql);
	            String userId = username.getText();
	            
	            pst.setString(1, userId);
	            pst.setString(2,userId);
//	            pst.setString(2, password.getText());
	    

	            
	            ResultSet rs = pst.executeQuery();
	            
	            if(rs.next())
	            {
//	            JOptionPane.showMessageDialog(null,"Success!!");
//	                Store st = new Store();
//	                st.setVisible(true);
	                                lbl_username.setText("");
	                                new PasswordFrame(userId).setVisible(true);
	                                setVisible(false);
	                                
	                                 

	            }
	            else {
	                lbl_username.setText("Invalid Username");
//	                JOptionPane.showMessageDialog(null,"Try Again!");
	            }
	            
	            
	            
	        }
	        catch(Exception e)
	        {
	            
	            JOptionPane.showMessageDialog(null,e);
	            System.out.println("Connection failed");
	    }
	        }
	    }

	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
	    {
	        CreateAccount act = new CreateAccount();
	        act.setVisible(true);
	        setVisible(false);
	    }

	    private void lbl_usernameKeyReleased(java.awt.event.KeyEvent evt) 
	    {
	        lbl_username.setText("");
	    }

	    private void usernameKeyReleased(java.awt.event.KeyEvent evt)
	    {
	         lbl_username.setText("");
	    }

	    private void usernameActionPerformed(java.awt.event.ActionEvent evt) 
	    {
	    }
	    public static void main(String args[]) 
	    {
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() 
	        {
	            public void run() 
	            {
	                new Login().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration 
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JSeparator jSeparator1;
	    private javax.swing.JTable jTable1;
	    private javax.swing.JLabel lbl_username;
	    private java.awt.List list1;
	    private javax.swing.JTextField username;
	    // End of variables declaration
}
