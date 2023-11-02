package com.elara.sahaplus.institution.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RetrieveByCodeRequest {
    private String code;
}
