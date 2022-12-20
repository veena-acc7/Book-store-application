package com.example.bookStore.BookStore.Module;

import javax.persistence.*;

@Entity
@Table(name = "Books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long bookId;

    @Column(name = "bookCode")
    String bookCode;

    @Column(name = "bookName")
    String bookName;

    @Column(name = "bookAuthor")
    String bookAuthor;

    @Column(name = "bookPrice")
    int bookPrice;

    @Column(name = "bookCategory")
    String bookCategory;

    @Column(name = "bookCopies")
    int bookCopies;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public int getBookCopies() {
        return bookCopies;
    }

    public void setBookCopies(int bookCopies) {
        this.bookCopies = bookCopies;
    }
}
