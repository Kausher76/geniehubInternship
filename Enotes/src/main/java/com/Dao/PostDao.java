package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.User.*;

public class PostDao {
	private Connection conn;

	public PostDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean addPost(String ti, String co, int ui) {
		boolean f = false;

		try {
			String qu = "INSERT INTO POST (TITLE, CONTENT,UID) VALUES(?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(qu);
			ps.setString(1, ti);
			ps.setString(2, co);
			ps.setInt(3, ui);
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public List<Post> getData(int id) {
		List<Post> list = new ArrayList<>();
		Post post = null;
		
		try {
			String qu = "SELECT * FROM post where uid =? order by id DESC";
			PreparedStatement ps = conn.prepareStatement(qu);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				post = new Post();
				post.setId(rs.getInt(1));
				post.setTitle(rs.getString(2));
				post.setContent(rs.getString(3));
				post.setpDate(rs.getTimestamp(4));
				list.add(post);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public Post getDataById(int noteid) {
		Post p = null;
		
		try {
			String qu = "SELECT * FROM POST WHERE ID =?";
			PreparedStatement ps = conn.prepareStatement(qu);
			ps.setInt(1, noteid);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				p = new Post();
				p.setId(rs.getInt(1));
				p.setTitle(rs.getString(2));
				p.setContent(rs.getString(3));
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return p;
	}
	
	public boolean postUpdate(int id, String ti, String co) {
		boolean f = false;
		
		try {
			String qu = "UPDATE POST SET TITLE = ?, CONTENT = ? WHERE ID = ?";

			PreparedStatement ps = conn.prepareStatement(qu);
			ps.setString(1, ti);
			ps.setString(2, co);
			ps.setInt(3, id);
		 	int i = ps.executeUpdate();
		 	if(i== 1) {
		 		f = true;
		 	}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	
	public boolean deletePost(int id) {
		boolean f = false;

		try {

			String sql = "DELETE FROM POST WHERE ID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
}
