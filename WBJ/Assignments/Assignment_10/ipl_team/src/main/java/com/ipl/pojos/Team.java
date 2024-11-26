package com.ipl.pojos;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long id;

    @Column(length = 100, unique = true, nullable = false)
    private String name;

    @Column(length = 10, unique = true, nullable = false)
    private String abbreviation;

    @Column(nullable = false)
    private String owner;

    @Column(name = "max_age", nullable = false)
    private int maxAge;

    @Column(name = "batting_avg", nullable = false)
    private double battingAvg;

    @Column(name = "wickets_taken", nullable = false)
    private int wicketsTaken;

    public Team() {}

    public Team(String name, String abbreviation, String owner, int maxAge, double battingAvg, int wicketsTaken) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.owner = owner;
        this.maxAge = maxAge;
        this.battingAvg = battingAvg;
        this.wicketsTaken = wicketsTaken;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public double getBattingAvg() {
		return battingAvg;
	}

	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}

	public int getWicketsTaken() {
		return wicketsTaken;
	}

	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", abbreviation=" + abbreviation + ", owner=" + owner + ", maxAge="
				+ maxAge + ", battingAvg=" + battingAvg + ", wicketsTaken=" + wicketsTaken + "]";
	}

    // Getters, setters, toString methods...
}
