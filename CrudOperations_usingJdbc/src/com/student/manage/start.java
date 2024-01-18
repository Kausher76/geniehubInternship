package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.PublicKey;
public class start {

	public static void main(String[] args)  throws  IOException {
		// TODO Auto-generated method stub
			System.out.println("Welcome To Student Management Application");
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				System.out.println("Enter 1 to Add Students ");
				System.out.println("Enter 2 to Delete Students ");
				System.out.println("Enter 3 to View Students ");
				System.out.println("Enter 4 to Update Students ");
				System.out.println("Enter 5 to exit ");
				int c = Integer.parseInt(br.readLine());
				if(c==1) {
					//add
					System.out.println("Enter Student Name");
					String name = br.readLine();
					
					System.out.println("Enter Student city");
					String city = br.readLine();
					
					System.out.println("Enter Student phone");
					String phone = br.readLine();
					
					students st = new students(name,phone,city);
					boolean ans= StudentDao.insertToStudentDB(st);
					System.out.println( "Number of affected rows: " +StudentDao.affectedRows);
					
					
				}
				else if(c==2) {
					//delete
					System.out.println("enter student id to delete");
					int userid = Integer.parseInt(br.readLine());
					boolean x= StudentDao.deleteStudent(userid);
					if(x) {
						System.out.println("Student deleted");
						System.out.println( "Number of affected rows: " +StudentDao.affectedRows);
						
					}
					else {
						System.out.println("something went wrong");
					}
				}
				else if(c==3) {
					//display
					StudentDao.showStudent();
				}
				else if(c==4) {
				    System.out.println("enter student id to update");
				    int userid = Integer.parseInt(br.readLine());
				    System.out.println("Enter new Student Name");
				    String name = br.readLine();
									
				    System.out.println("Enter Student's new city");
				    String city = br.readLine();
									
				    System.out.println("Enter Student's new phone");
				    String phone = br.readLine();
				   StudentDao.updateStudents(userid, name, phone, city);
				   System.out.println( "Number of affected rows: " +StudentDao.affectedRows);
				   System.out.println("updated");
									
				    
				}
				else if(c==5) {
					break;
				}
				else {
					System.out.println("Enter Proper Choice");
				}
			}
			System.out.println("Thank you for using my application\nSee you Soon");
			
			
	}

}

