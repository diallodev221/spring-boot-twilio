package com.devfun.springboottwillio.twilio;

import io.github.cdimascio.dotenv.Dotenv;
import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class TwilioConfiguration {
    private Dotenv dotenv = Dotenv.configure().load();
    private String accountSid = dotenv.get("ACCOUNT_SID");
    private String authToken = dotenv.get("AUTH_TOKEN");
    private String trialNumber = dotenv.get("TRIAL_NUMBER");

}
