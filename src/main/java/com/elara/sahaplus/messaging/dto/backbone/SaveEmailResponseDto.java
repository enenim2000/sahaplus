package com.elara.sahaplus.messaging.dto.backbone;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveEmailResponseDto {
    private boolean isMessageSent;
}
