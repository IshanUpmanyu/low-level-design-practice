package com.ishanupamanyu.model.user;

import java.util.Date;

public class BookIssueNote {
  private Book book;
  private Date issueDate;
  private Date returnDate;

  public BookIssueNote(Book book, Date issueDate, Date returnDate) {
    this.book = book;
    this.issueDate = issueDate;
    this.returnDate = returnDate;
  }

  public Book getBook() {
    return book;
  }

  public Date getIssueDate() {
    return issueDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }
}
