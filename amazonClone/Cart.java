package amazonClone;
//import com.mysql.cj.xdevapi.Statement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Cart  extends javax.swing.JFrame 

{
    // Creates new form Cart
	
   
	private static final long serialVersionUID = 1L;

	public Cart() 
    {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2 , size.height/2 - getHeight()/2);
        show_user();
    }
    
    int cnt=0;
    int subTotal=0;
    
    public ArrayList<User> userList()
    {
    ArrayList<User> userList = new ArrayList<>();
    try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
             String url ="jdbc:mysql://localhost:3306/amazon?useSSL=true";
             String user = "root";
             String pass = "ROOT";
            
            Connection conn;
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Connection successful!");
            
            String query1 = "select * from orders";
            java.sql.Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User userr;
            
            while(rs.next())
            {
            userr = new User(rs.getString("or_num"),rs.getString("or_name"),rs.getInt("or_price"));
            cnt=cnt+1;
            subTotal = subTotal + rs.getInt("or_price");
            userList.add(userr);
            }
            
            System.out.print(subTotal+" "+cnt);
            String it = Integer.toString(cnt);
            ITEM.setText(it);
            
            String price = Integer.toString(subTotal);
            Price.setText("₹ " + price);
        }
   
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
    return userList;
   
    }
    
    public void show_user()
    {
    ArrayList<User> list = userList();
    DefaultTableModel model = (DefaultTableModel) jtable_orders.getModel();
    
    Object[] row= new Object[3];
    for(int i=0;i<list.size();i++)
    {
    row[0]=list.get(i).getNum();
    row[1]=list.get(i).getName();
    row[2]=list.get(i).getPrice();
    
    model.addRow(row);
    }
    
    }
  
    @SuppressWarnings({  "serial" })
    private void initComponents() 
    {
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_orders = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ITEM = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jtable_orders.setForeground(new java.awt.Color(0, 0, 102));
        
        jtable_orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] 
            {

            },
            new String [] 
            {
                "Order_Number", "Order_Name", "Order_Price"
            }
          )
        {
            Class[] types = new Class [] 
            {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class<?> getColumnClass(int columnIndex) 
            {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtable_orders);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\Homeupper2.png")); 

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("D:\\weje3\\amazoneclone\\SHOPPING CART.png"))); 

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amazoneclone/di1.png"))); 

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); 
        jLabel4.setText("Subtotal");

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\buy.png")); 
        
        jButton1.addActionListener(new java.awt.event.ActionListener() 
         {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                try {
					jButton1ActionPerformed(evt);
				} 
                catch (Exception e) 
                {
					
					e.printStackTrace();
				}
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); 
        jLabel5.setText("ITEM(S)  ");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); 
        jLabel6.setText("TOTAL ");

        ITEM.setFont(new java.awt.Font("Arial", 1, 18)); 

        Price.setFont(new java.awt.Font("Arial", 0, 18)); 

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Price)
                            .addComponent(ITEM))
                        .addGap(67, 67, 67))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ITEM))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2))
                        .addGap(128, 128, 128))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(254, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1357, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );

        pack();
    }
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws Exception 
    {
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
             String url ="jdbc:mysql://localhost:3306/amazon?useSSL=true";
             String user = "root";
             String pass = "ROOT";
            
            Connection conn;
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Connection successful!");
            String clean ="truncate table orders;";
            java.sql.Statement stmt = conn.createStatement();
            stmt.execute(clean);
            
             int ans = JOptionPane.showConfirmDialog(null, "Are you sure?!");
             System.out.println(ans);
             
             if(ans==0)
             {
                 JOptionPane.showMessageDialog(null, "ORDER PLACED!!");
                 setVisible(false);
             }
             
            
        }
        
          try 
          {
			
		  } 
          catch (Exception e)
          {
			JOptionPane.showMessageDialog(null, e);
		  }          
        
    }

  
    public static void main(String args[]) 
    {
        try 
        {
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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new Cart().setVisible(true);
            }
       
        });             

    }

    private javax.swing.JLabel ITEM;
    private javax.swing.JLabel Price;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtable_orders;
	
}
