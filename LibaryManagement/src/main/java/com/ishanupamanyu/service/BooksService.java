package com.ishanupamanyu.service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.ishanupamanyu.model.user.Book;
import com.ishanupamanyu.model.user.BookIssueNote;
import com.ishanupamanyu.model.user.Category;
import com.ishanupamanyu.model.user.User;

public class BooksService {
  private MembershipService membershipService;
  private ChargesService chargesService;

  private final int DEFAULT_BOOK_ISSUE_DAYS = 7;

  public BooksService(MembershipService membershipService, ChargesService chargesService){
    this.chargesService = chargesService;
    this.membershipService = membershipService;
  }

  public void addBook(Book book){
    //Add book to library database and update the number of copies held.
  }

  public void removeBook(Book book){
    //Remove book from library and update the number of copies held.
  }

  public BookIssueNote issueBook(Book book, User user){
    Date issueDate = new Date();
    Date returnDate = new Date(issueDate.getTime() + 1000 * 60 * 60 * 24 * DEFAULT_BOOK_ISSUE_DAYS);
    BookIssueNote issueNote = new BookIssueNote(book, issueDate, returnDate);

    //Save issue not in database
    //Update books database that book is issued.

    return issueNote;
  }

  public void returnBook(BookIssueNote issueNote, boolean isBookDamagedOrLost){
    long timeNow = new Date().getTime();
    long bookReturnTime = issueNote.getReturnDate().getTime();
    if(isBookDamagedOrLost){
      chargesService.deductChargesOnBookLossOrDamage(issueNote.getBook());
    } else if(bookReturnTime - timeNow < 0){
      chargesService.deductLateSubmissionCharges(issueNote);
    }

    //Update books database that book is returned. Update the number of copies.
  }


  public List<Book> searchByCategory(Category category){

    //Search database by category. Filter searches by category type
    //Return actual results
    return Collections.EMPTY_LIST;
  }

  public List<Book> searchByTitle(String text){

    //Search database by text in title and return results
    return Collections.EMPTY_LIST;
  }

  public List<Book> searchByAuthor(String text){
    //Search database by text in author name and return results.
    return Collections.EMPTY_LIST;
  }




}
