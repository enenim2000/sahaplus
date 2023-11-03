package com.elara.bankone.modules.mobile_teller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileTellerDetailsResponseData {
    @JsonProperty("StaffCode")
    private String staffCode;

    @JsonProperty("AccountName")
    private String  accountName;

    @JsonProperty("AccountCode")
    private String  accountCode;

    @JsonProperty("AccountBalance")
    private String  accountBalance;

    @JsonProperty("TotalDeposit")
    private String  totalDeposit;

    @JsonProperty("TotalWithdrawal")
    private String  totalWithdrawal;
}
