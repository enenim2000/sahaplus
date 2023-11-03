package com.elara.bankone.modules.fixed_deposit.dto.response;

import com.elara.bankone.util.BaseResponse;
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
