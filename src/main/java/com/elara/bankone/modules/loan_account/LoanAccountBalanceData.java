package com.elara.bankone.modules.loan_account;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanAccountBalanceData {
    private String LoanAccountNo;
    private BigDecimal AccountBalance;
    private BigDecimal PrincipalDueButUnpaid;
    private BigDecimal InterestDueButUnpaid;
    private BigDecimal LoanFeeDueButUnPaid;
    private BigDecimal PenaltyDueButUnpaid;
    private BigDecimal PrincipalPaidTillDate;
    private BigDecimal InterestPaidTillDate;
    private BigDecimal TotalOutstandingAmount;
    private BigDecimal InterestNoYetDue;
    private BigDecimal LoanFeeNotYetDue;
    private BigDecimal LoanFeePaidTillDate;
    private BigDecimal TotalAmountPaidTillDate;
    private BigDecimal LoanPenaltyPaidTillDate;
}
