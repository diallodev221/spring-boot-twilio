package com.devfun.springboottwillio.twilio;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/sms")
public class TwilioController {

    private final TwilioService twilioService;

    @PostMapping
    public void smsSender(@Valid @RequestBody SmsRequest smsRequest) {
        twilioService.sendSms(smsRequest);
    }
}
