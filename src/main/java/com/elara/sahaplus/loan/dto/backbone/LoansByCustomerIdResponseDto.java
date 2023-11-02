package com.elara.sahaplus.loan.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoansByCustomerIdResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("CustomerIDInString")
    private String customerIDInString;

    @JsonProperty("Message")
    private Object message;

    @JsonProperty("Dates")
    private Object dates;
}
