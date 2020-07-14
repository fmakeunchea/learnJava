package libraryManagement;
import java.awt.EventQueue;

import javax.swing.*; 
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AdminLogin extends JFrame{
	static AdminLogin frame;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    //launch the app
    JLabel lbEnterName = new JLabel("Enter Name:");
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    frame = new AdminLogin();
                    frame.setVisible(true);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
    // create the frame

    public AdminLogin(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
       setContentPane(contentPane);

       JLabel lbAdminLoginForm = new JLabel("Admin Login Form");
       lbAdminLoginForm.setForeground(Color.GRAY);
       lbAdminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 22));

       JLabel lbEnterName = new JLabel("Enter Name:");
       JLabel lbEnterPassword = new JLabel("Enter Password:");

       textField = new JTextField(10);
       textField.setColumns(10);

       JButton btnLogin = new JButton("Login");
       btnLogin.addActionListener((ActionListener) new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String name = textField.getText();
               String password = String.valueOf(passwordField.getPassword());
               if (name.equals("admin")&&password.equals("admin123")){
                   AdminSuccess.main(new String[]{});
                   frame.dispose();
               }else{
                   JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, UserName Or Password Error", "Login Error!", JOptionPane.ERROR_MESSAGE);
                   textField.setText("");
                   passwordField.setText("");
               }
           }
       });
		
		passwordField = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
		gl_contentPane.createParallelGroup(Alignment.TRAILING)
		  .addGroup(gl_contentPane.createSequentialGroup()
			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(124)
							.addComponent(lbAdminLoginForm))
					.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lbEnterName)
									.addComponent(lbEnterPassword))
							.addGap(47)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(passwordField)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
			.addContainerGap(107, Short.MAX_VALUE))
			.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(187, Short.MAX_VALUE)
			.addComponent(btnLogin,GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
			.addGap(151))
		  
	 );                      
							
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				  .addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lbAdminLoginForm)
									.addGap(26)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
											.addComponent(lbEnterName)
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(28)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
											.addComponent(lbEnterPassword)
											.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnLogin,GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(80, Short.MAX_VALUE))
				  
		 );                     					
		  contentPane.setLayout(gl_contentPane);
    }

}
