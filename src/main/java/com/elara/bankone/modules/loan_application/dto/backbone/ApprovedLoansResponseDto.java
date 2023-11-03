package com.elara.bankone.modules.loan_application.dto.backbone;

import com.elara.bankone.modules.loan_application.ApprovedLoansResponseData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApprovedLoansResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("Message")
    private ApprovedLoansResponseData approvedLoansResponseData;
}
