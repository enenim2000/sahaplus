package com.elara.sahaplus.account.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CloseAccountRequest {
    private String AccountNumber;
    private String Narration;
}
