package com.blogs.tester;

import static com.blogs.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.blogs.dao.UserDao;
import com.blogs.dao.UserDaoImpl;
import com.blogs.entities.User;
import com.blogs.entities.UserRole;

public class GetUserDetailsById {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); //class loading --> static init block ->SF
				Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			UserDao userDao = new UserDaoImpl();
			System.out.println("Enter user id");
			// create user instance - TRANSIENT
			
			// invoke dao's method
			System.out.println(userDao.getUserDeatils(sc.nextLong()));

		} // JVM - sf.close() -> DBCP cleaned up !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
