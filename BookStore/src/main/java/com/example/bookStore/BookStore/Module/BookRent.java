package com.example.bookStore.BookStore.Module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="book_rent")
public class BookRent {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="rent_id")
	long rent_id;
	@Column(name="user_id")
	long user_id;
	@Column(name="bookId")
	long bookId;
	@Column(name="depositAmt")
	double depositAmt;
	@Column(name="status")
	String status;
	public long getRent_id() {
		return rent_id;
	}
	public void setRent_id(long rent_id) {
		this.rent_id = rent_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getRentId() {
		return rent_id;
	}
	public void setRentId(long rentId) {
		this.rent_id = rentId;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public double getDepositAmt() {
		return depositAmt;
	}
	public void setDepositAmt(double depositAmt) {
		this.depositAmt = depositAmt;
	}
	 

}
