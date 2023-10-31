package com.elara.sahaplus.loan.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParInformationRequest {
    @NotNull
    private String accountOfficerCode;
    private String institution;
}
