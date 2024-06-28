package amazonClone;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ProcessBar2 extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	public ProcessBar2() {
	        initComponents();
	         Toolkit toolkit = getToolkit();
	        Dimension size = toolkit.getScreenSize();
	        setLocation(size.width/2 - getWidth()/2 , size.height/2 - getHeight()/2); 
	    }
	    private void initComponents() 
	    {

	        jPanel1 = new javax.swing.JPanel();
	        jProgressBar1 = new javax.swing.JProgressBar();
	        jLabel1 = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

	        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\amazon logo.png")); 
	        jLabel1.setText("jLabel1");

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(328, 328, 328)
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(403, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                .addGap(111, 111, 111)
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
	                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(33, 33, 33))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	    }

	    public static void main(String args[]) 
	    {               
	        ProcessBar2 pb = new ProcessBar2 ();
	        
	        for(int i =0; i< 10;i++)
	            
	        {
	            try{
	            Thread.sleep(10);
	            }
	            catch(Exception e)
	            {
	            System.out.println(e);
	            }
	            
	            pb.jProgressBar1.setStringPainted(true);
	            pb.jProgressBar1.setValue(50);
	        }
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
	        } catch (ClassNotFoundException ex) 
	        {
	            java.util.logging.Logger.getLogger(ProcessBar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        catch (InstantiationException ex) 
	        {
	            java.util.logging.Logger.getLogger(ProcessBar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } 
	        catch (IllegalAccessException ex)
	        {
	            java.util.logging.Logger.getLogger(ProcessBar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } 
	        catch (javax.swing.UnsupportedLookAndFeelException ex) 
	        {
	            java.util.logging.Logger.getLogger(ProcessBar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run()
	            {
	                new ProcessBar2().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration 
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JProgressBar jProgressBar1;
	    // End of variables declaration
}
