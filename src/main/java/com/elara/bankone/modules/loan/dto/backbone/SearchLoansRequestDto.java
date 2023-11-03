package com.elara.bankone.modules.loan.dto.backbone;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchLoansRequestDto {
    @NotNull
    private String institutionCode;

    @NotNull
    private LocalDateTime startDate;

    @NotNull
    private LocalDateTime endDate;

    @NotNull
    private String surname;

    @NotNull
    private String otherNames;

    @NotNull
    private String phoneNumber;
    private int page;
    private int pageSize;
}
