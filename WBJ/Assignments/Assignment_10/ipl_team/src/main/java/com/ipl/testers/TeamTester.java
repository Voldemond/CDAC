package com.ipl.testers;

import java.util.List ;
import com.ipl.dao.TeamDao;
import com.ipl.dao.TeamDaoImpl;
import com.ipl.pojos.Team;
import com.ipl.utils.HibernateUtils;

public class TeamTester {
	public static void main(String[] args) {
		TeamDao teamDao = new TeamDaoImpl();
		
		try {
			Team newTeam = new Team("ROYAL CHALLENGERS BANGALORE", "RCB", "Vijay_M", 35, 45.5, 20);
			teamDao.addTeam(newTeam);
			
			// Get team by ID
			Team team = teamDao.getTeamById(1L);
			if (team != null) {
			    System.out.println("Team with ID 1: " + team);
			} else {
			    System.out.println("No team found with ID 1.");
			}

			
			List<Team> teams = teamDao.getAllTeams()	;
			teams.forEach(System.out::println);
		
		}finally {
			HibernateUtils.closeFactory();
		}
	}
}
