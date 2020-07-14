package libraryManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DeleteLibrarian extends JFrame{
	static DeleteLibrarian frame;
	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) { 
	        EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                try{
	                    frame = new DeleteLibrarian();
	                    frame.setVisible(true);
	                }catch (Exception e){
	                    e.printStackTrace();
	                }
	            }
	        });
	}
	public DeleteLibrarian(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
       setContentPane(contentPane);
	}

}
