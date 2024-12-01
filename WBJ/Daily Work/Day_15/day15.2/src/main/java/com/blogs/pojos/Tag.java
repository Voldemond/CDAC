package com.blogs.pojos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tags")
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true, of = "name")
public class Tag extends BaseEntity {
	@Column(length = 20, unique = true)
	private String name;
	//Tag *--->* BlogPost - many to many , uni dir association between the entities
	@ManyToMany //mandatory o.w MappingException !
	@JoinTable(name="my_tag_posts") //optional to specify name of the mapping table
	private Set<BlogPost> blogPosts=new HashSet<>();
	public Tag(String name) {
		super();
		this.name = name;
	}

}
