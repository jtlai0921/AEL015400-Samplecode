package JRadioButtonDemo;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class InterFrame extends JFrame {
  InterFrame() {
    setTitle("JRadioButtonDemo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(50, 50, 280, 250);
	setLayout(null);
		    
    JPanel panSex = new JPanel();
    add(panSex);
    panSex.setBounds(20, 60, 80, 120);
    Border lineB = BorderFactory.createLineBorder(Color.black);
    panSex.setBorder(BorderFactory.createTitledBorder(lineB, "性別"));
    panSex.setLayout(new FlowLayout(FlowLayout.LEFT));
    ButtonGroup group = new ButtonGroup();
    JRadioButton[] rdb = new JRadioButton[2];
    rdb[0] = new JRadioButton("男", true);
    rdb[1] = new JRadioButton("女");
    for(int i = 0; i < rdb.length; i++) {
      group.add(rdb[i]);
      panSex.add(rdb[i]);
    }
    
    setVisible(true);
  }
}

public class JRadioButtonDemo {
  public static void main(String[] args) {
    new InterFrame();
  }
}