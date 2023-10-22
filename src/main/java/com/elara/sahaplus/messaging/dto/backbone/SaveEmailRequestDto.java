package com.elara.sahaplus.messaging.dto.backbone;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveEmailRequestDto {
    @NotNull
    private String mfbCode;

    @NotNull
    private String emailFrom;

    @NotNull
    private String emailTo;

    @NotNull
    private String subject;

    @NotNull
    @JsonProperty("Message")
    private String message;

    private String institutionCode;
}
