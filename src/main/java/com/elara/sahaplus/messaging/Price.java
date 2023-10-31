package com.elara.sahaplus.messaging;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Price {
    private double pricePerMessage;
    private String currency;
}
