package com.elara.sahaplus.loan.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanByAccountNumberResponseDto {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("EmailAddress")
    private String emailAddress;

    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    @JsonProperty("CreationDate")
    private LocalDateTime creationDate;

    @JsonProperty("LoanAmount")
    private String loanAmount;

    @JsonProperty("CustomerID")
    private String customerID;

    @JsonProperty("Message")
    private Object message;
}
