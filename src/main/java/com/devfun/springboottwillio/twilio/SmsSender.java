package com.devfun.springboottwillio.twilio;

import com.devfun.springboottwillio.twilio.SmsRequest;

public interface SmsSender {

    void sendSms(SmsRequest smsRequest);
}
