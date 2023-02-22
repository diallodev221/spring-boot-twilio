package com.devfun.springboottwillio.twilio;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "twilio")
public class TwilioConfiguration {
    private String accountSid;
    private String authToken;
    private String trialNumber;
}
