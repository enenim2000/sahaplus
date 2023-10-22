package com.elara.sahaplus.loan.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DueLoansRequestDto {
    @JsonProperty("accountofficerCode")
    @NotNull
    private String accountOfficerCode;

    @JsonProperty("FinancialDate")
    @NotNull
    private LocalDateTime financialDate;

    @NotNull
    private String accountNumber;

    private String institutionCode;
    private int page;
    private int pageSize;
}
