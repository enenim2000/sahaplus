package com.elara.sahaplus.loan.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParInformationRequestDto {
    @NotNull
    private String accountOfficerCode;
    private String institution;
}
