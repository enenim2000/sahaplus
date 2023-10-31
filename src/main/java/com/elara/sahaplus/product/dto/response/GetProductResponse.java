package com.elara.sahaplus.product.dto.response;

import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetProductResponse extends BaseResponse {
    private Data data;

    public GetProductResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private String productCode;
        private String productName;
        private String productDiscriminator;
    }
}
