package com.elara.bankone.modules.messaging.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveEmailRequest {
    @NotNull
    private String mfbCode;

    @NotNull
    private String emailFrom;

    @NotNull
    private String emailTo;

    @NotNull
    private String subject;

    @NotNull
    private String message;

    private String institutionCode;
}
