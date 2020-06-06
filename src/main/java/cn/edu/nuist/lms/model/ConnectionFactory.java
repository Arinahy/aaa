package Java_Design;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
	private String classname=null;String url=null; String userName=null;String pswd=null;
	BufferedReader br=null;
	public Connection getConnection() {
		String path="D:\\eclipse-workspace\\Demo\\src\\Java_Design\\yxConfigurationFile.txt";
		File file = new File(path);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			classname = br.readLine();
			url = br.readLine();
			userName = br.readLine();
			pswd = br.readLine();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(br != null) try{br.close();}catch(IOException e) {e.printStackTrace();}
		}
		
		Connection conn;
		try {
			Class.forName(classname);
			conn=DriverManager.getConnection(url,userName,pswd);
		}catch(Exception e) {
			System.out.println("连接数据库失败");
			conn=null;
			e.printStackTrace();
		}
		return conn;
	}
	public void closed(ResultSet rs,PreparedStatement pstm, Connection conn) {
		try {
			if(pstm!=null) pstm.close();
		}catch(SQLException e) {
			System.out.println("关闭pstm对象失败");
			e.printStackTrace();
		}
		try {
			if(conn!=null) conn.close();
		}catch(SQLException e) {
			System.out.println("关闭conn对象失败");
			e.printStackTrace();
		}
	}
}
