package com.elara.sahaplus.fixed_deposit.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CreateFixedDepositAccountResponse extends BaseResponse {
    private Data data;

    public CreateFixedDepositAccountResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private String message;
    }
}
