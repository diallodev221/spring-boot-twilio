package com.devfun.springboottwillio.twilio;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service("twilio")
public class TwilioSmsSender implements SmsSender {

    private final static Logger LOGGER = LoggerFactory.getLogger(TwilioSmsSender.class);

    private final TwilioConfiguration twilioConfiguration;

    @Override
    public void sendSms(SmsRequest smsRequest) {
        if (isPhoneNumberValid(smsRequest.getPhoneNumber())) {
            PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
            String message = smsRequest.getMessage();
            MessageCreator creator = Message.creator(to, from, message);
            creator.create();
            LOGGER.info("send sms {}", smsRequest);
        } else {
            throw new IllegalArgumentException("Phone Number " + smsRequest.getMessage() + " is not a valid phone number");
        }

    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return true;
    }
}
