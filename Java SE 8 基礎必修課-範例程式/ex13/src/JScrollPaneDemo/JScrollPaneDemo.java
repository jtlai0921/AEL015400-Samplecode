package JScrollPaneDemo;
import java.awt.*;
import javax.swing.*;

class TextAreaF extends JFrame {
  TextAreaF() {
	setTitle("捲軸面板");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(50, 50, 325, 150);
	setLayout(null);
		   
    String st1 = "擁有與浪費\n";
    String st2 = "擁有一個東西，你享受它，同時你也是受到它的支配、";
    String st3 = "它的擁有。如果它讓你付出時間、精神、金錢，";
    String st4 = "而沒有提供你相對的價值和利益。那麼擁有就是浪費，";
    String st5 = "浪費你的時間，浪費你的精神，浪費你的金錢。";
    JTextArea txtST = new JTextArea(st1);
    txtST.append(st2);
    txtST.append(st3);
    txtST.append(st4);
    txtST.append(st5);
    txtST.setLineWrap(true);
    JScrollPane span = new JScrollPane(txtST,
                       ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                       ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    span.setBounds(5, 5, 200, 90);
    add(span);
     
    setVisible(true);
  }
}

public class JScrollPaneDemo {
  public static void main(String[] args) {
    new TextAreaF();
  }
}