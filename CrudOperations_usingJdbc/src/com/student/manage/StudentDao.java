package com.student.manage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class StudentDao {
	static int   affectedRows;
	public static boolean insertToStudentDB(students st ) {
		//jdbc code
		boolean f= false;
		try {
			Connection con = CP.createC();
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";
			//prepared statement
			PreparedStatement ptmr = con.prepareStatement(q);
			//setting value
			ptmr.setString(1, st.getStudentName());
			
			ptmr.setString(2, st.getStudentPhone());
			
			ptmr.setString(3, st.getStudentCity());
			
			try {
				affectedRows = ptmr.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			ptmr.executeUpdate();
			f=true;
			
			
		}
		catch(Exception e) {
			e.fillInStackTrace();
		}
		return f;
	}
	
	
	public static boolean deleteStudent(int userid){
		//jdbc code
		boolean f= false;
		try {
			Connection con = CP.createC();
			String q = "delete from students where sid=?";
			//prepared statement
			PreparedStatement ptmr = con.prepareStatement(q);
			//setting value
			ptmr.setInt(1, userid);
			affectedRows = ptmr.executeUpdate();
//			ptmr.executeUpdate();
			try {
				affectedRows = ptmr.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			f=true;
			
			
		}
		catch(Exception e) {
			e.fillInStackTrace();
		}
		return f;
	}
	public static void showStudent() {
		try {
			Connection con = CP.createC();
			String q = "select * from students";
			Statement statement = con.createStatement();
			ResultSet set = statement.executeQuery(q);
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone =  set.getString(3);
				String city =  set.getString(4);
				System.out.println("ID " + id);
				System.out.println("name " + name);
				System.out.println("phone " + phone);
				System.out.println("city " + city);
				System.out.println("***************");
			}
			
			
			
		}
		catch(Exception e) {
			e.fillInStackTrace();
		}
		
		
	}
	public static void updateStudents(int userid, String name, String phone, String city) {
		try {
			Connection con = CP.createC();
			String q = "update students set sname=?, sphone=?, scity=? where sid=?";
			PreparedStatement ptmr = con.prepareStatement(q);
			ptmr.setString(1, name);
			ptmr.setString(2, phone);
			ptmr.setString(3, city);
			ptmr.setInt(4, userid);
			try {
				affectedRows = ptmr.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//ptmr.executeUpdate();	
			
			
		} catch (Exception e) {
			e.fillInStackTrace();
		}
		
		
		
	}
	
	
}
