package amazonClone;

//import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoadingData extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	public LoadingData() 
	  {
	        initComponents();
	    }

	    private void initComponents() 
	    {

	        jPanel1 = new javax.swing.JPanel();
	        jPanel2 = new javax.swing.JPanel();
	        signin = new javax.swing.JButton();

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 100, Short.MAX_VALUE)
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 100, Short.MAX_VALUE)
	        );

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        signin.setText("jButton1");
	        
	        signin.addActionListener(new java.awt.event.ActionListener() 
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) 
	            {
	                signinActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(152, 152, 152)
	                .addComponent(signin)
	                .addContainerGap(171, Short.MAX_VALUE))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                .addContainerGap(140, Short.MAX_VALUE)
	                .addComponent(signin)
	                .addGap(135, 135, 135))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	    }

	    private void signinActionPerformed(java.awt.event.ActionEvent evt) 
	    {        
	       String url ="jdbc:mysql://localhost:3306/amazon?useSSL=true";
	       String user = "root";
	       String pass = "ROOT";
	        
	        
	         
	            
	            
	            
	            try{
	                Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn;
	            conn = DriverManager.getConnection(url,user,pass);
	            System.out.println("Connection successful!");
	            
	            try{
	                String query = "insert into signin values(?,?)";
	                PreparedStatement stmt = conn.prepareStatement(query);
	                stmt.setString(1,"Ram");
	                stmt.setString(2, "Ram");
	                stmt.execute();
	                conn.close();
	            }
	            catch(SQLException e)
	            {
	                 JOptionPane.showMessageDialog(null,e);
	            }
	            
	          
	            
	            
////	            Statement pst = (Statement) conn.createStatement();
//	            PreparedStatement stmt =  conn.createStatement();
//	            stmt.executeUpdate(sql);
	            }
	            catch(Exception e)
	            {
	                JOptionPane.showMessageDialog(null,e);
	            System.out.println("Connection failed");
	            }
	             
	            
	            
	            
//	            pst.setString(1, username.getText());
//	            pst.setString(2, password.getText());            
	           
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
	        } 
	        catch (ClassNotFoundException ex) 
	        {
	            java.util.logging.Logger.getLogger(LoadingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } 
	        catch (InstantiationException ex) 
	        {
	            java.util.logging.Logger.getLogger(LoadingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } 
	        catch (IllegalAccessException ex) 
	        {
	            java.util.logging.Logger.getLogger(LoadingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } 
	        catch (javax.swing.UnsupportedLookAndFeelException ex) 
	        {
	            java.util.logging.Logger.getLogger(LoadingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	     

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new LoadingData().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration 
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JButton signin;
	    // End of variables declaration
}
