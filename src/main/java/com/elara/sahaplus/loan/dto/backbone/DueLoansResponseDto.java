package com.elara.sahaplus.loan.dto.backbone;

import com.elara.sahaplus.loan.DueLoansResponseData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DueLoansResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("Message")
    private DueLoansResponseData dueLoansResponseData;
}
