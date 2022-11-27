package com.example.bookStore.BookStore.Module;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BookRent {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="rentId")
	long rentId;
	@Column(name="user_id")
	long user_id;
	@Column(name="bookId")
	long bookId;
	@Column(name="depositAmt")
	double depositAmt;
	

}
