package com.ishanupamanyu.model.user;


import java.util.Date;

public class MembershipDetails {
  private User user;
  private Date startDate;
  private Date endDate;

  public MembershipDetails(User user, Date startDate, Date endDate){
    this.user = user;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
}
