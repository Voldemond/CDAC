package com.cdac.tester;

import java.sql.Date;
import java.util.Scanner;

import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

public class TestLayeredApplication {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 1. create DAO instance
			UserDao userDao = new UserDaoImpl();//up casting
			boolean exit = false;
			while (!exit) {
				System.out.println("Options - 1. Fetch Users By Role\n" 
				        + "2. User Registration\n"
				        + "3. Change Password\n"
				        + "4. Delete User\n"
				        + "5. User Sign-In\n"
				        + "0. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter role name");
						userDao.fetchUserDetailsByRole(sc.next())
						.forEach(System.out::println);
						break;
					case 2 : System.out.println("Enter voter details - "
							+ "firstName,  lastName,  email,  password,  "
							+ "dob(yr-mon-day)");
					//create voter
					User voter=new User(sc.next(), sc.next(), sc.next(),
							sc.next(),Date.valueOf(sc.next()));
					//invoke dao's method
					System.out.println(userDao.registerVoter(voter));
						
					break;
					case 3:
					    System.out.println("Enter user ID and new password:");
					    System.out.println(userDao.changePassword(sc.nextInt(), sc.next()));
					    break;

					case 4:
					    System.out.println("Enter user ID to delete:");
					    System.out.println(userDao.deleteUser(sc.nextInt()));
					    break;

					case 5:
					    System.out.println("Enter email and password for sign-in:");
					    User user = userDao.signIn(sc.next(), sc.next());
					    if (user != null) {
					        System.out.println("Sign-in successful! User details: " + user);
					    } else {
					        System.out.println("Invalid email or password.");
					    }
					    break;

					case 0:
						exit = true;
						userDao.cleanUp();
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();//to clear the tokens from the scanner.
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main app over....");
	}

}
