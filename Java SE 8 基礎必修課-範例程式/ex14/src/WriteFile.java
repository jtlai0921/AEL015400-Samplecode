 import java.util.Scanner;
 import java.io.*;

 public class WriteFile {
	public static void main(String[] args)
	{
		try
	    {
			String fpath = "D:/test.txt";
			BufferedWriter fout=new BufferedWriter(new FileWriter(fpath));
			fout.write("Java SE 8基礎必修課");
			fout.newLine();
			fout.write("Visual C# 2013 程式設計經典");
			fout.newLine();
			fout.close();
			System.out.println(fpath+"寫檔完成");
		}
		catch (IOException e)
		{
			System.out.println("輸入檔案路徑有誤!!");
		}
	}
 }
