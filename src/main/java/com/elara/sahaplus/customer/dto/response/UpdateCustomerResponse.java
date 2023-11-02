package com.elara.sahaplus.customer.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UpdateCustomerResponse extends BaseResponse {

    private Data data;

    public UpdateCustomerResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private boolean isSuccessful;
        private String customerId;
        private Object message;
    }
}
