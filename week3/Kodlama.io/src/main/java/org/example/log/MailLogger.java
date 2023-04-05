package org.example.log;

public class MailLogger implements BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Mail gönderildi : " + message);
    }
}
