package rsDb2;

import java.sql.*;

public class rsDb2 {
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
	       try
	       {
	          Connection cn=DriverManager.getConnection
	("jdbc:sqlserver://localhost;user=sa;password=ab8626043;database=mydb");
	          Statement sm = cn.createStatement();
	          ResultSet rs = sm.executeQuery("SELECT * FROM 員工");
	          ResultSetMetaData rsmd = rs.getMetaData();
	          for (int i=1; i<=rsmd.getColumnCount(); i++)
	          {
	              System.out.print(rsmd.getColumnName(i) + "\t");
	          }
	          System.out.println("\n-----------------------------");
	          while (rs.next())
	          {
	        	  System.out.print(	rs.getString("員工編號") + "\t" +
	    					rs.getString("姓名") + "\t"+ 
	   						rs.getString("職稱") + "\t" + 
	   						rs.getInt("薪資") + "\n");

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

