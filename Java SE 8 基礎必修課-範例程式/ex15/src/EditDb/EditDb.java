package EditDb;

import java.sql.*;
import javax.swing.*;

class EditDb
{
   public static void main(String[] args)
   {
       try
       {
    	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       }
       catch(ClassNotFoundException ce)
       {
    	   System.out.println("JDBC沒有驅動程式" + ce.getMessage());
       }
       int op=0;
       String sqlstr="", id="", name="", position="", salary="";
       try
       {
           op = Integer.parseInt(JOptionPane.showInputDialog
		("請選擇選單\n1：新增   2:修改   3:刪除"));
           if (op == 1)
           {
                id = JOptionPane.showInputDialog
				("請輸入員工編號").replace("'", "''");
                name = JOptionPane.showInputDialog
				("請輸入姓名").replace("'", "''");
                position = JOptionPane.showInputDialog
				("請輸入職稱").replace("'", "''");
                salary = JOptionPane.showInputDialog("請輸入薪資(輸入數值)");
                sqlstr = "INSERT INTO 員工(員工編號,姓名,職稱,薪資)Values(" + 
				"'" + id + "','" + name + "','" + position +
				"'," + salary + ")";
           }
           else if(op == 2)
           {
                id = JOptionPane.showInputDialog
				("請輸入欲修改的資料(以員工編號為依據)").replace("'", "''");
                name = JOptionPane.showInputDialog
				("請輸入姓名").replace("'", "''");
                position = JOptionPane.showInputDialog
				("請輸入職稱").replace("'", "''");
                salary = JOptionPane.showInputDialog("請輸入薪資(輸入數值)");
                sqlstr = "UPDATE 員工 SET 姓名='" + name +
				"',職稱='" +  position + "',薪資=" + salary +
				" WHERE 員工編號='" + id + "'" ;
           }
           else if(op == 3)
           {
            	id = JOptionPane.showInputDialog
				("請輸入欲刪除的資料(以員工編號為依據").replace("'", "''");
                sqlstr = "DELETE FROM 員工 WHERE 員工編號='" + id + "'" ;
           }
       }
       catch(NumberFormatException ne)
       { }

       try
       {
       	Connection cn=DriverManager.getConnection
("jdbc:sqlserver://localhost;user=sa;password=ab8626043;database=mydb");
          Statement sm = cn.createStatement();
          if(op != 0)
          {
              sm.executeUpdate(sqlstr);
          }
          ResultSet rs = sm.executeQuery("SELECT * FROM 員工");
          ResultSetMetaData rsmd = rs.getMetaData();
          System.out.println();
          for (int i=1; i<=rsmd.getColumnCount(); i++)
          {
              System.out.print(rsmd.getColumnName(i) + "\t");
          }
          System.out.println("\n-----------------------------");
          while (rs.next())
          {
              System.out.print(rs.getString(1) + "\t" +
						rs.getString(2) + "\t"+
						rs.getString(3) + "\t" +
						rs.getInt(4) + "\n");
          }
          sm.close();
          cn.close();
       }
       catch(SQLException e)
       {
       	System.out.println("資料庫連接失敗\n" + e.getMessage());
       }
   }
}
