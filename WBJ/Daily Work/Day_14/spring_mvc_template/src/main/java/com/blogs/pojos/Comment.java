package com.blogs.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "comments")
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true,of= {"commentText","rating"})
public class Comment extends BaseEntity {
	@Column(name = "comment_text", length = 100)
	private String commentText;
	private int rating;
	public Comment(String commentText, int rating) {
		super();
		this.commentText = commentText;
		this.rating = rating;
	}
	

}
