package com.elara.sahaplus.loan.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class LoanByAccountNumberResponse extends BaseResponse {
    private Data data;

    public LoanByAccountNumberResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private String address;
        private String emailAddress;
        private String phoneNumber;
        private LocalDateTime creationDate;
        private String loanAmount;
        private String customerID;
        private Object message;
    }
}
