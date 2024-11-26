package com.ipl.dao;

import java.util.List;
import com.ipl.pojos.Team;

public interface TeamDao {
	void addTeam(Team team);
	Team getTeamById(Long id);
	List<Team> getAllTeams();
}
