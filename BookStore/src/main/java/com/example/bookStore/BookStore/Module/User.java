package com.example.bookStore.BookStore.Module;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "User")

public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long user_id;

  @Column(name = "first_name")
  String first_name;

  @Column(name = "phone_no")
  String phone_no;

  @Column(name = "email_id")
  String email_id;

  @Column(name = "wallet")
  int wallet;

  @Column(name = "is_suspended")
  int is_suspended;
  @Column(name="booksBorrowed")
  int booksBorrowed;
  
public int getBooksBorrowed() {
	return booksBorrowed;
}

public void setBooksBorrowed(int booksBorrowed) {
	this.booksBorrowed = booksBorrowed;
}

//  
//  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = false)
//  private List<BookReview> listAuthorities = new ArrayList<>();
  public long getUser_id() {
    return user_id;
  }

  public void setUser_id(long user_id) {
    this.user_id = user_id;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getPhone_no() {
    return phone_no;
  }

  public void setPhone_no(String phone_no) {
    this.phone_no = phone_no;
  }

  public String getEmail_id() {
    return email_id;
  }

  public void setEmail_id(String email_id) {
    this.email_id = email_id;
  }

  public int getWallet() {
    return wallet;
  }

  public void setWallet(int wallet) {
    this.wallet = wallet;
  }

  public int getIs_suspended() {
    return is_suspended;
  }

  public void setIs_suspended(int is_suspended) {
    this.is_suspended = is_suspended;
  }
}
