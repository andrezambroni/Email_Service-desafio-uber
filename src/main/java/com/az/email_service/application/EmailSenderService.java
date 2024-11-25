package com.az.email_service.application;

import com.az.email_service.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService()

    @Override
    public void sendEmail (String to, String subject, String body){

    }

}
