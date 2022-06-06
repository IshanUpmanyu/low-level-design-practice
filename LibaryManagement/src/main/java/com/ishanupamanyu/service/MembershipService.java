package com.ishanupamanyu.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ishanupamanyu.model.user.User;
import com.ishanupamanyu.model.user.MembershipDetails;

public class MembershipService {
  private Map<User, MembershipDetails> membershipDetailsMap = new HashMap<User, MembershipDetails>();
  private final int DEFAULT_MEMBERSHIP_LENGTH_IN_DAYS = 365;

  public MembershipDetails doRegistration(User user){
    Date startDate = new Date();
    Date endDate = new Date(startDate.getTime() + (1000 * 60 * 60 * 24 * DEFAULT_MEMBERSHIP_LENGTH_IN_DAYS));
    MembershipDetails membershipDetails = new MembershipDetails(user, startDate, endDate);
    membershipDetailsMap.put(user, membershipDetails);

    return membershipDetails;
  }

  public MembershipDetails doRenewal(User user, int renewalLength){

    if(renewalLength == -1){
      renewalLength = DEFAULT_MEMBERSHIP_LENGTH_IN_DAYS;
    }

    MembershipDetails membershipDetails = membershipDetailsMap.get(user);

    if(membershipDetails == null){
      throw new RuntimeException(String.format("User with email %s does not exist", user.getEmail()));
    }

    Date endDate = membershipDetails.getEndDate();

    Date endDateAfterRenewal = new Date(endDate.getTime() + 1000 * 60 * 60 * 24 * renewalLength);
    membershipDetails.setEndDate(endDateAfterRenewal);

    return membershipDetails;
  }

}
