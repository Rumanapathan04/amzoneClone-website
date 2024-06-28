package amazonClone;
//import java.awt.Color;
//import static java.awt.Color.blue;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
//import javax.swing.JFrame;
//import javax.swing.UIManager;

public class ProcessBar extends javax.swing.JFrame
{
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form ProcessBar
     */
 
    public ProcessBar() 
    {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2 , size.height/2 - getHeight()/2); 
        setBackground(Color.white);
        setForeground(Color.white);
    }

    private void initComponents() 
    {

        jPanel1 = new javax.swing.JPanel();
        loadbar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 350));

        loadbar.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 36)); 
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\weje3\\amazoneclone\\amazon logo.png"));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); 
        jLabel2.setText("LOADING....");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1)))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loadbar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }
    public static void main(String args[]) throws InterruptedException 
    {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(ProcessBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(ProcessBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ProcessBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(ProcessBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new ProcessBar().setVisible(true);
            }
        });
        new ProcessBar().setVisible(true);
//       ProcessBar frame1=new ProcessBar();
//        frame1.setVisible(true);
//       
        for(int i = 0; i<100;i++)
        {
            try
            {
                   Thread.sleep(10);
                   ProcessBar.loadbar.setStringPainted(true);
                   ProcessBar.loadbar.setValue(i);
            }
            catch(InterruptedException e)
               {
                   JOptionPane.showMessageDialog(null, e);
               }
              

        }
       new Login().setVisible(true);
//       setVisible(false);              
    }

    // Variables declaration 
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JProgressBar loadbar;
    // End of variables declaration
}
