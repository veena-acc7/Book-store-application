package com.example.bookStore.BookStore.Module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="bookreview")
public class BookReview {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="reviewId")
	long reviewId;
	@Column(name="bookId")
	long bookId;
	@Column(name="user_id")
	long user_id;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "user.username")
//	private User user;
	
	@Column(name="review")
	String review;
	@Column(name="likes")
	int likes;
	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

}
