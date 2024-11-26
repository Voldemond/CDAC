package com.ipl.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ipl.pojos.Team;
import com.ipl.utils.HibernateUtils;

public class TeamDaoImpl implements TeamDao {

	@Override
	public void addTeam(Team team) {
	    Transaction tx = null;
	    try (Session session = HibernateUtils.getFactory().openSession()) {
	        tx = session.beginTransaction();
	        session.save(team);
	        tx.commit();
	    } catch (Exception e) {
	        if (tx != null) {
	            try {
	                tx.rollback();
	            } catch (Exception rollbackEx) {
	                System.err.println("Rollback failed: " + rollbackEx.getMessage());
	            }
	        }
	        System.err.println("Error adding team: " + e.getMessage());
	        e.printStackTrace();
	    }
	}



    @Override
    public Team getTeamById(Long id) {
        Team team = null;
        try (Session session = HibernateUtils.getFactory().openSession()) {
            team = session.get(Team.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return team;
    }

    @Override
    public List<Team> getAllTeams() {
        List<Team> teams = null;
        try (Session session = HibernateUtils.getFactory().openSession()) {
            teams = session.createQuery("select t from Team t", Team.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return teams;
    }
}
