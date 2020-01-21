package JComboBoxDemo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ComboF extends JFrame implements ItemListener, ActionListener {
  private JLabel lblName = new JLabel("書目：");
  private String[] book = {"航海王", "暮光之城", "山楂樹之戀", "物理馬戲團"};
  private JComboBox<String> cbo = new JComboBox<>(book);
  private JLabel lblShow = new JLabel("可選取、新增、刪除書目...");
  private JButton btnAdd = new JButton("新增");
  private JButton btnDel = new JButton("刪除");

  public ComboF() {
	setTitle("圖書管理");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(50, 50, 225, 240);
	setLayout(null);

    JPanel panBook = new JPanel();
    add(panBook);
    panBook.setBounds(10, 10, 100, 120);
    panBook.setLayout(new FlowLayout(FlowLayout.LEFT));
    panBook.add(lblName);
    panBook.add(cbo);
    cbo.addItemListener(this);

    JPanel panBtn = new JPanel();
    add(panBtn);
    panBtn.setBounds(120, 50, 80, 70);
    panBtn.setLayout(new FlowLayout(FlowLayout.LEFT));
    panBtn.add(btnAdd);
    panBtn.add(btnDel);
    btnAdd.addActionListener(this);
    btnDel.addActionListener(this);

    add(lblShow);
    lblShow.setBounds(10, 160, 180, 30);
    lblShow.setBorder(BorderFactory.createLineBorder(Color.red));

    setVisible(true);
  }

  public void itemStateChanged(ItemEvent e) {
    Object show = cbo.getSelectedItem();
    int index = cbo.getSelectedIndex();
    lblShow.setText(show + "，index = " + index);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnAdd) {
      String bookName = JOptionPane.showInputDialog("請輸入書目名稱");
      cbo.addItem(bookName);
      lblShow.setText("加入 " + bookName + " 書目至最後一筆");
    }
    if (e.getSource() == btnDel) {
      Object select = cbo.getSelectedItem();
      cbo.removeItem(select);
      lblShow.setText("刪除 " + select + " 書目");
    }
  }
}

public class JComboBoxDemo {
  public static void main(String[] args) {
    new ComboF();
  }
}
