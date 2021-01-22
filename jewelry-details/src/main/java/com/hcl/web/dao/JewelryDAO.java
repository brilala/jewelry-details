package com.hcl.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.hcl.web.model.Jewelry;

public class JewelryDAO {

	public Jewelry getJewelry(int id) {

		Jewelry j = new Jewelry();


				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * from simplilearn.jewelry WHERE id=" + id);

			if (rs.next() == false) {
				System.out.println("ID not found");
			} else {
				do {
					j.setId(rs.getInt("id"));
					j.setType(rs.getString("type"));
					j.setMetal(rs.getString("metal"));
				} while (rs.next());
			}


		} catch (Exception e) {
			System.out.println(e);
		}
		return j;
	
	}
}
