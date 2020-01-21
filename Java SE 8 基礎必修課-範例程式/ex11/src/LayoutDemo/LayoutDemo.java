package LayoutDemo;

import javax.swing.*;		//載入swing套件

class MyJFrame extends JFrame{
	private JPanel contentPane;
	MyJFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
		setBounds(100, 100, 450, 300); 
		contentPane = new JPanel();                         
		 
		setContentPane(contentPane);                        
		contentPane.setLayout(null);                        
		                                                    
		JButton btn1 = new JButton("按鈕元件1");    
		btn1.setBounds(10, 10, 100, 23);            
		contentPane.add(btn1);                      
		                                                 
		JButton btn2 = new JButton("按鈕元件2");  
		btn2.setBounds(74, 76, 100, 23);          
		contentPane.add(btn2);                    
		                                                  
		JButton btn3 = new JButton("按鈕元件3");  
		btn3.setBounds(228, 29, 100, 23);         
		contentPane.add(btn3);                    
		                                                  
		JButton btn4 = new JButton("按鈕元件4");  
		btn4.setBounds(228, 94, 100, 23);         
		contentPane.add(btn4);                    
		                                                   
		JButton btn5 = new JButton("按鈕元件5");  
		btn5.setBounds(151, 144, 100, 23);        
		contentPane.add(btn5);     
		setVisible(true);
	}
}

public class LayoutDemo {
	public static void main(String[] args){
		MyJFrame f = new MyJFrame();  
	}
}
