package com.elara.sahaplus.loan_application.dto.backbone;

import com.elara.sahaplus.loan_application.ApprovedLoansResponseData;
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
