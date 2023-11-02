package com.elara.sahaplus.loan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoansResponseData {
    @JsonProperty("RowNum")
    private long rowNum;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("OtherNames")
    private String otherNames;

    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("LedgerBalance")
    private BigDecimal ledgerBalance;

    @JsonProperty("CustomerID")
    private long customerID;

    @JsonProperty("CustomerIDInString")
    private String customerIDInString;

    @JsonProperty("LoanID")
    private long loanID;

    @JsonProperty("LoanAccountNumber")
    private String loanAccountNumber;

    @JsonProperty("LoanAmount")
    private long loanAmount;

    @JsonProperty("LoanCycle")
    private int loanCycle;

    @JsonProperty("LoanPaymentScheduleType")
    private int loanPaymentScheduleType;

    @JsonProperty("LoanStatus")
    private int loanStatus;

    @JsonProperty("DateCreatedFinancial")
    private LocalDateTime dateCreatedFinancial;

    @JsonProperty("DateCreated")
    private LocalDateTime dateCreated;

    @JsonProperty("AccountOfficerID")
    private long accountOfficerID;

    @JsonProperty("OutstandingPrincipal")
    private BigDecimal outstandingPrincipal;

    @JsonProperty("OutstandingPenalty")
    private BigDecimal outstandingPenalty;

    @JsonProperty("OverdueLoanInterest")
    private BigDecimal overdueLoanInterest;

    @JsonProperty("LoanFees")
    private BigDecimal loanFees;

    @JsonProperty("LoanWriteOffBalance")
    private BigDecimal loanWriteOffBalance;

    @JsonProperty("NotDuePrincipalRepayment")
    private long notDuePrincipalRepayment;

    @JsonProperty("NotDueInterestRepayment")
    private long notDueInterestRepayment;

    @JsonProperty("NotDueFeeRepayment")
    private long notDueFeeRepayment;

    @JsonProperty("DuePrincipalRepayment")
    private long duePrincipalRepayment;

    @JsonProperty("DueInterestRepayment")
    private long dueInterestRepayment;

    @JsonProperty("DueFeeRepayment")
    private long dueFeeRepayment;
}
