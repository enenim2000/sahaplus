package com.elara.sahaplus.loan.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchLoansRequest {
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
