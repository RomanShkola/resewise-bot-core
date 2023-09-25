package com.telegram.resewise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
@EnableConfigurationProperties
public class ResewiseApplication {

    public static void main(String[] args) throws TelegramApiException {

        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        var context = SpringApplication.run(ResewiseApplication.class, args);

        botsApi.registerBot(context.getBean("resewiseBot", TelegramLongPollingBot.class));

    }

}
