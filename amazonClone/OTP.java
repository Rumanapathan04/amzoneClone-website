package amazonClone;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;
import javax.swing.JOptionPane;

public class OTP extends  javax.swing.JFrame 
{
	
	private static final long serialVersionUID = 1L;
	int OTPP;
    
    // * Creates new form OTP
    public OTP() 
    {
        initComponents();
    }

    private void initComponents() 
    {
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtVerOTP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtName.setText("Anuroop");
        txtName.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                txtNameActionPerformed(evt);
            }
        });

        jButton1.setText("CONTINUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("VERIFY");
        jButton2.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVerOTP, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(txtPhone)
                            .addComponent(txtName)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton2)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(txtVerOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt)
    {
    	
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
    {
        if(Integer.parseInt(txtVerOTP.getText())==OTPP)
        {
        JOptionPane.showMessageDialog(null, "Login successful");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Incorrect OTP");
        }
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        try { 
			// Construct data
			String apiKey = "apikey=" + "N2E2ZTQ5NjY2OTM5Nzg1MDQ2NDI3ODc5NTc2YzRmNzk=";
                        Random rand = new Random();
                        OTPP=rand.nextInt(99999);
                        
                        String name = txtName.getText();
                        
			String message = "&message=" + "Hey! "+ name+" your OTP is "+ OTPP;
			String sender = "&sender=" + "ANUROOP AMAZON";
			String numbers = "&numbers=" + txtPhone.getText();
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			JOptionPane.showMessageDialog(null, "OTP SEND SUCCESFULLY"+OTPP);
//			System.out.println( stringBuffer.toString());
		} catch (Exception e) {
		        JOptionPane.showMessageDialog(null,"Error SMS "+e);
//			System.out.println("Error "+e);
		}
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
            java.util.logging.Logger.getLogger(OTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(OTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(OTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(OTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new OTP().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtVerOTP;
    // End of variables declaration
}
