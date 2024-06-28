package amazonClone;
//import static com.mysql.cj.xdevapi.JsonLiteral;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AmazonHome extends javax.swing.JFrame
{
	
	private static final long serialVersionUID = 1L;
	int cnt =1;
	    String order= "insert into orders values(?,?,?)";
 
	    public Connection connect()
	    {
	         String url ="jdbc:mysql://localhost:3306/amazon?useSSL=true";
	        String user = "root";
	        String pass = "ROOT";
	         Connection conn = null;
	         
	        try
	        {
	            Class.forName("com.mysql.cj.jdbc.Driver");     
	            conn = DriverManager.getConnection(url,user,pass);
	            System.out.println("Connection successful!");       
	        }
	         
	        catch(Exception e)
	        {  
	            JOptionPane.showMessageDialog(null,e);
	            System.out.println("Connection failed");
	        }
	         return conn;
	    
	     }
	        
	  
	     // Creates new form AmazonHome
	     public AmazonHome() 
	     {
	        initComponents();
	        Toolkit toolkit = getToolkit();
	        Dimension size = toolkit.getScreenSize();
	        setLocation(size.width/2 - getWidth()/2 , size.height/2 - getHeight()/2);
	     }

	  @SuppressWarnings("unchecked")
	    private void initComponents() 
	    {
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jPanel1 = new javax.swing.JPanel();
	        jTabbedPane1 = new javax.swing.JTabbedPane();
	        jPanel2 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        jLabel5 = new javax.swing.JLabel();
	        jButton2 = new javax.swing.JButton();
	        jLabel6 = new javax.swing.JLabel();
	        jButton4 = new javax.swing.JButton();
	        jLabel7 = new javax.swing.JLabel();
	        jButton3 = new javax.swing.JButton();
	        jLabel8 = new javax.swing.JLabel();
	        jButton5 = new javax.swing.JButton();
	        jLabel9 = new javax.swing.JLabel();
	        jButton6 = new javax.swing.JButton();
	        jLabel10 = new javax.swing.JLabel();
	        jButton7 = new javax.swing.JButton();
	        jLabel11 = new javax.swing.JLabel();
	        jButton8 = new javax.swing.JButton();
	        jPanel3 = new javax.swing.JPanel();
	        jLabel2 = new javax.swing.JLabel();
	        lbl_search = new javax.swing.JTextField();
	        jButton9 = new javax.swing.JButton();
	        jButton10 = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

	        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

	        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

	        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amazoneclone/BestSeller.png"))); 
	        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\PlayStation.png")); 

	        jButton1.setBackground(new java.awt.Color(255, 255, 255));
	        jButton1.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Addtocart.png")); 
	        jButton1.addActionListener(new java.awt.event.ActionListener() 
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	             jButton1ActionPerformed();
	            }
	        });

	        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amazoneclone/purse.png")));

	        jButton2.setBackground(new java.awt.Color(255, 255, 255));
	        jButton2.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Addtocart.png")); 
	        jButton2.addActionListener(new java.awt.event.ActionListener() 
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                jButton2ActionPerformed();
	            }
	        });

	        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Addtocart.png")); 

	        jButton4.setBackground(new java.awt.Color(255, 255, 255));
	        jButton4.setIcon(new javax.swing.ImageIcon()); 
	        jButton4.addActionListener(new java.awt.event.ActionListener() 
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                jButton4ActionPerformed();
	            }
	        });

	        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\MousePad.png")); 

	        jButton3.setBackground(new java.awt.Color(255, 255, 255));
	        jButton3.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Addtocart.png")); 
	        jButton3.addActionListener(new java.awt.event.ActionListener() 
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                jButton3ActionPerformed();
	            }
	        });

	        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\EARPHONES.png")); 

	        jButton5.setBackground(new java.awt.Color(255, 255, 255));
	        jButton5.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Addtocart.png")); 
	        jButton5.addActionListener(new java.awt.event.ActionListener() 
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                jButton5ActionPerformed();
	            }
	        });

	        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\boat.png")); 

	        jButton6.setBackground(new java.awt.Color(255, 255, 255));
	        jButton6.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Addtocart.png"));
	        jButton6.addActionListener(new java.awt.event.ActionListener() 
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                jButton6ActionPerformed();
	            }
	        });

	        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\onePlus.png")); 

	        jButton7.setBackground(new java.awt.Color(255, 255, 255));
	        jButton7.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Addtocart.png")); 
	        
	        jButton7.addActionListener(new java.awt.event.ActionListener()
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                jButton7ActionPerformed();
	            }
	        });

	        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\REDMI.png")); 

	        jButton8.setBackground(new java.awt.Color(255, 255, 255));
	        jButton8.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Addtocart.png")); 
	        jButton8.addActionListener(new java.awt.event.ActionListener() 
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                jButton8ActionPerformed();
	            }
	        });

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel1)
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(21, 21, 21)
	                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(jPanel2Layout.createSequentialGroup()
	                                .addGap(10, 10, 10)
	                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(jPanel2Layout.createSequentialGroup()
	                                    .addGap(116, 116, 116)
	                                    .addComponent(jLabel6))
	                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGap(11, 11, 11)))
	                            .addGroup(jPanel2Layout.createSequentialGroup()
	                                .addGap(116, 116, 116)
	                                .addComponent(jLabel10)))
	                        .addGap(123, 123, 123)
	                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addGroup(jPanel2Layout.createSequentialGroup()
	                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(123, 123, 123)
	                                .addComponent(jLabel4))
	                            .addGroup(jPanel2Layout.createSequentialGroup()
	                                .addComponent(jLabel11)
	                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(jPanel2Layout.createSequentialGroup()
	                                        .addGap(144, 144, 144)
	                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                        .addGap(30, 30, 30))
	                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                        .addComponent(jLabel8)
	                                        .addGap(22, 22, 22)))))))
	                .addGap(0, 10, Short.MAX_VALUE))
	            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(jPanel2Layout.createSequentialGroup()
	                    .addGap(742, 742, 742)
	                    .addComponent(jLabel7)
	                    .addContainerGap(386, Short.MAX_VALUE)))
	            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(jPanel2Layout.createSequentialGroup()
	                    .addGap(31, 31, 31)
	                    .addComponent(jLabel9)
	                    .addContainerGap(1098, Short.MAX_VALUE)))
	            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(jPanel2Layout.createSequentialGroup()
	                    .addGap(51, 51, 51)
	                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addContainerGap(1122, Short.MAX_VALUE)))
	            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(jPanel2Layout.createSequentialGroup()
	                    .addGap(405, 405, 405)
	                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addContainerGap(768, Short.MAX_VALUE)))
	            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                    .addContainerGap(794, Short.MAX_VALUE)
	                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGap(380, 380, 380)))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addGap(83, 83, 83)
	                        .addComponent(jLabel5)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGroup(jPanel2Layout.createSequentialGroup()
	                            .addComponent(jLabel1)
	                            .addGap(18, 18, 18)
	                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(47, 47, 47)
	                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(73, 73, 73))
	                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGap(153, 153, 153))
	                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGap(145, 145, 145)))))
	            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(jPanel2Layout.createSequentialGroup()
	                    .addGap(77, 77, 77)
	                    .addComponent(jLabel7)
	                    .addContainerGap(754, Short.MAX_VALUE)))
	            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                    .addContainerGap(701, Short.MAX_VALUE)
	                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGap(143, 143, 143)))
	            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                    .addContainerGap(1073, Short.MAX_VALUE)
	                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGap(69, 69, 69)))
	            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                    .addContainerGap(1086, Short.MAX_VALUE)
	                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGap(56, 56, 56)))
	            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                    .addContainerGap(1086, Short.MAX_VALUE)
	                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGap(56, 56, 56)))
	        );

	        jTabbedPane1.addTab("Bestsellers", jPanel2);

	        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	        jPanel3.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 1384, Short.MAX_VALUE)
	        );
	        jPanel3Layout.setVerticalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 1175, Short.MAX_VALUE)
	        );

	        jTabbedPane1.addTab("tab2", jPanel3);

	        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\up1.png")); 

	        jButton9.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Search.png")); 
	        jButton9.addActionListener(new java.awt.event.ActionListener()
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                jButton9ActionPerformed();
	            }
	        });

	        jButton10.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\cart.png")); 
	        jButton10.addActionListener(new java.awt.event.ActionListener() 
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                jButton10ActionPerformed();
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jLabel2)
	                        .addGap(62, 62, 62)
	                        .addComponent(lbl_search, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(49, 49, 49)
	                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(134, 134, 134)
	                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(0, 439, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addGap(0, 0, Short.MAX_VALUE)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                .addComponent(lbl_search, javax.swing.GroupLayout.Alignment.TRAILING)
	                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
	                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(61, 61, 61))
	        );

	        jScrollPane1.setViewportView(jPanel1);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1379, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
	        );

	        pack();
	    }

	    private void jButton9ActionPerformed()
	    {
	        String item = lbl_search.getText();
	        String query = "Select * from orders where or_name like '%?%'";
	       
	       try{ 
	           PreparedStatement stmt = connect().prepareStatement(query);
	           stmt.setString(1, item);
	           
	           ResultSet rs = stmt.executeQuery();
	           
	           if(rs.next())
	           {
	               
	           }
	       
	       }
	       catch(Exception e)
	       {
	       JOptionPane.showMessageDialog(null, e);
	       }
	    }

	    private void jButton8ActionPerformed() 
	    {
	      
	        try
	        {
	            PreparedStatement stmt = connect().prepareStatement(order);
	            stmt.setString(1,"20345");
	            stmt.setString(2,"Redmi 10A");
	            stmt.setInt(3,9499);

				stmt.execute();

	        }
	        catch(Exception e)
	        {
	         JOptionPane.showMessageDialog(null, e);
	        }

	    }

	    private void jButton7ActionPerformed() 
	    {
	        try
	        {
	            PreparedStatement stmt = connect().prepareStatement(order);
	            stmt.setString(1,"12343");
	            stmt.setString(2,"OnePlus Nord CE 2 5G");
	            stmt.setInt(3,24999);

	           
				stmt.execute();

	        }
	        catch(Exception e)
	        {
	            JOptionPane.showMessageDialog(null, e);

	        }
	    }

	    private void jButton6ActionPerformed() 
	    {

	        try
	        {
	            PreparedStatement stmt = connect().prepareStatement(order);
	            stmt.setString(1,"11123");
	            stmt.setString(2,"BOAT AirDropes 121v2 True Wireless Earbuds");
	            stmt.setInt(3, 1300);
				stmt.execute();

	        }
	        catch(Exception e)
	        {
	            JOptionPane.showMessageDialog(null, e);

	        }
	    }

	    private void jButton5ActionPerformed() 
	    {
	        
	        try
	        {
	            PreparedStatement stmt = connect().prepareStatement(order);
	            stmt.setString(1,"22343");
	            stmt.setString(2,"Boat Bassheads 100 Ear wired earphomes");
	            stmt.setInt(3,299);

				stmt.execute();

	        }
	        catch(Exception e)
	        {
	            JOptionPane.showMessageDialog(null, e);

	        }
	    }

	    private void jButton3ActionPerformed()
	    {
	        
	        try
	        {
	            PreparedStatement stmt = connect().prepareStatement(order);
	            stmt.setString(1,"10112");
	            stmt.setString(2,"AmazonBasics Extended Gaming Mouse Pad Black");
	            stmt.setInt(3, 469);

				stmt.execute();

	        }
	        catch(Exception e)
	        {
	            JOptionPane.showMessageDialog(null, e);

	        }
	    }

	    private void jButton4ActionPerformed() 
	    {
	        
	        try
	        {
	            PreparedStatement stmt = connect().prepareStatement(order);
	            stmt.setString(1,"10013");
	            stmt.setString(2,"American Tourister Casual Backpack");
	            stmt.setInt(3, 1149);
				stmt.execute();

	        }
	        catch(Exception e)
	        {
	            JOptionPane.showMessageDialog(null, e);

	        }

	    }

	  //  @SuppressWarnings("unused")
		private void jButton2ActionPerformed()
	    {  
	        try
	        {
	            PreparedStatement stmt = connect().prepareStatement(order);
	            stmt.setString(1,"10012");
	            stmt.setString(2,"WILDHORN Carter Leather Wallet for Men");
	            stmt.setInt(3,2099);
             stmt.execute();

	        }
	        catch(Exception e)
	        {
	            JOptionPane.showMessageDialog(null, e);

	        }

	    }

	    private void jButton1ActionPerformed() 
	    {
	        

	        try{  PreparedStatement stmt =connect().prepareStatement(order);
	            stmt.setString(1, "10022");
	            stmt.setString(2,"Sony PlayStation Network");
	            stmt.setInt(3,1000);
	            stmt.execute();
	          }
	        
	        catch(Exception e)
	        {
	            JOptionPane.showMessageDialog(null, e);

	        }

	    }

	    private void jButton10ActionPerformed()
	    {
	        
	        new Cart().setVisible(true);
	        setVisible(false);
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
	        java.util.logging.Logger.getLogger(AmazonHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } 
	        catch (InstantiationException ex)
	        {
	        java.util.logging.Logger.getLogger(AmazonHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        catch (IllegalAccessException ex) 
	        {
	         java.util.logging.Logger.getLogger(AmazonHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } 
	        catch (javax.swing.UnsupportedLookAndFeelException ex)
	        {
	        java.util.logging.Logger.getLogger(AmazonHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	      

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable()
	        {
	            public void run()
	            {
	                new AmazonHome().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration 
	    private javax.swing.JButton jButton10;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JButton jButton4;
	    private javax.swing.JButton jButton5;
	    private javax.swing.JButton jButton6;
	    private javax.swing.JButton jButton7;
	    private javax.swing.JButton jButton8;
	    private javax.swing.JButton jButton9;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel10;
	    private javax.swing.JLabel jLabel11;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JLabel jLabel8;
	    private javax.swing.JLabel jLabel9;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JPanel jPanel3;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JTabbedPane jTabbedPane1;
	    private javax.swing.JTextField lbl_search;
}
