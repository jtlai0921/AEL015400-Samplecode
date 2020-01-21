package JListDemo;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

class ListF extends JFrame implements ListSelectionListener {
  private JLabel lblName = new JLabel("書目：");
  private String[] book = {"航海王", "暮光之城", "昆蟲記", "山楂樹之戀", "完美小孩", "物理馬戲團"};
  private JList<String> lst = new JList<>(book);
  private JTextArea txtShow = new JTextArea("可選取書目...", 3, 14);

  public ListF() {
	setTitle("圖書管理");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(50, 50, 225, 245);
	setLayout(null);

	JPanel panBook = new JPanel();
    add(panBook);
    panBook.setBounds(10, 10, 90, 120);
    panBook.setLayout(new FlowLayout(FlowLayout.LEFT));
    panBook.add(lblName);
    JScrollPane scrList = new JScrollPane(lst);
    panBook.add(scrList);
    lst.setVisibleRowCount(4);
    lst.addListSelectionListener(this);

    JPanel panShow = new JPanel();
    add(panShow);
    panShow.setBounds(10, 130, 180, 100);
    panShow.setLayout(new FlowLayout(FlowLayout.LEFT));
    JScrollPane scrShow = new JScrollPane(txtShow,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    panShow.add(scrShow);

    setVisible(true);
  }

  public void valueChanged(ListSelectionEvent e) {
    ArrayList<String> values = new ArrayList<>(lst.getSelectedValuesList());
    int[] indices = lst.getSelectedIndices();
    String show = "";
    int i = 0;
    for (String s : values) {
      show += s + ", index = " + indices[i] + "\n";
      i++;
    }
    txtShow.setText(show);
  }
}

public class JListDemo {
  public static void main(String[] args) {
    new ListF();
  }
}