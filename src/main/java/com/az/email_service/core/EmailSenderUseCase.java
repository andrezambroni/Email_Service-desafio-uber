package com.az.email_service.core;

public interface EmailSenderUseCase {

    void sendEmail( String to, String subject, String body);
}
