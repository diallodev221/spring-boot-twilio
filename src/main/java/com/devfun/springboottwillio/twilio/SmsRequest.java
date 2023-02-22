package com.devfun.springboottwillio.twilio;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SmsRequest {
    @NotBlank
    private final String phoneNumber;
    @NotBlank
    private final String message;

    public SmsRequest(
            @JsonProperty("phoneNumber") String phoneNumber,
            @JsonProperty("message") String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }
}
