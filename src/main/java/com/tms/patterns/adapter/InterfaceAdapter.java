package com.tms.patterns.adapter;

public class InterfaceAdapter extends TelegramLogic implements InterfaceSender{
    @Override
    public void send() {
        sendMessageToTelegram();
    }
}
