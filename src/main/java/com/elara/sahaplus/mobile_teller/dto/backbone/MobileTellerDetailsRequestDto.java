package com.elara.sahaplus.mobile_teller.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileTellerDetailsRequestDto {
    @NotNull
    private String staffCode;

    @NotNull
    private String institutionCode;
}
