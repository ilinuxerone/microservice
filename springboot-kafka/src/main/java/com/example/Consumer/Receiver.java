package com.example.Consumer;

import com.example.domain.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/3/6.
 */
@Component
public class Receiver {
    private Gson gson = new GsonBuilder().create();

    @KafkaListener(topics = "mytopic12")
    public void processMessage(String content) {
        Message m = gson.fromJson(content, Message.class);
    }
}
