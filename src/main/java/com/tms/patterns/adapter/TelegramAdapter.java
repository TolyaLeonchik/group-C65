package com.tms.patterns.adapter;

public class TelegramAdapter extends Sender{
    private TelegramLogic telegramLogic = new TelegramLogic();
    @Override
    void send() {
        telegramLogic.sendMessageToTelegram();
    }
}
