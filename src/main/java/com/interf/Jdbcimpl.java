package com.interf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.vin.VinFoundationPojo;
@Repository
public class Jdbcimpl implements Interf1 {

	public void saveoperation(VinFoundationPojo pojo) throws Exception {
System.out.println("connection opend");
		Class.forName("com.mysql.jdbc.Driver");
System.out.println("connection opend222222");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafound", "root", "admin");

		PreparedStatement p = con.prepareStatement("insert into vinfoundationpojo(fnme,age,gender,dateofbirth,country,adhar,mobileno,mail)values(?,?,?,?,?,?,?,?)");

		
		System.out.println("test1");
		p.setString(6, pojo.getFnme());
		p.setInt(3, pojo.getAge());
		p.setString(7, pojo.getGender());
		p.setString(5, pojo.getDateofbirth());
		p.setString(4, pojo.getCountry());
		p.setString(2, pojo.getAdhar());
		p.setString(8, pojo.getMobileno());
		p.setString(1, pojo.getMail());
		

		p.executeUpdate();
		
		System.out.println("jdbc over ");

	}

}
