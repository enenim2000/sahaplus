package com.elara.sahaplus.mobile_teller.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileTellerDetailsRequest {
    @NotNull
    private String staffCode;

    @NotNull
    private String institutionCode;
}
