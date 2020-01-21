package JFrameDemo;
import java.awt.*;
import javax.swing.*;

class MyJFrame extends JFrame {
	private JPanel contentPane;
	public MyJFrame() {   
		setTitle("JFrameDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
		setBounds(50, 50, 280, 200);    
	  	    
		contentPane = new JPanel();                          
		setContentPane(contentPane);                         
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			                                                     
		JButton btn1 = new JButton("«ö¶s 1");      
		contentPane.add(btn1);                       
	                                                     
		JButton btn2 = new JButton("«ö¶s 2");    
		contentPane.add(btn2);                     
		                                                     
		JButton btn3 = new JButton("«ö¶s 3");    
		contentPane.add(btn3);     
		
		setVisible(true);
	}     
}

public class JFrameDemo {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();   
	}
}
