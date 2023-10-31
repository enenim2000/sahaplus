package com.elara.sahaplus.loan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DueLoans {
    @JsonProperty("AccountNo")
    private String accountNo;

    @JsonProperty("CustomerID")
    private String customerID;

    @JsonProperty("CustomerName")
    private String customerName;

    @JsonProperty("LendingGroupName")
    private String lendingGroupName;

    @JsonProperty("TotalRepaymentAmount")
    private String totalRepaymentAmount;

    @JsonProperty("PrincipalDue")
    private String principalDue;

    @JsonProperty("InterestDue")
    private String interestDue;

    @JsonProperty("LoanFeesDue")
    private String loanFeesDue;

    @JsonProperty("MaturationDate")
    private String maturationDate;

    @JsonProperty("PhoneNo")
    private String phoneNo;

    @JsonProperty("LoanOfficer")
    private String loanOfficer;

    @JsonProperty("Tenure")
    private int tenure;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("DaysLeft")
    private int daysLeft;

    @JsonProperty("OutstandingPrincipal")
    private String outstandingPrincipal;

    @JsonProperty("OutstandingInterest")
    private String outstandingInterest;

    @JsonProperty("Branch")
    private String branch;
}
