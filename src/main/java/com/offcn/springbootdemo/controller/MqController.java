package com.offcn.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.*;

@RestController
public class MqController {
    @Autowired
    JmsTemplate jmsTemplate;
    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;
    //这个是两种类型的接口：queue\topic
    @Autowired
    Queue queue;
    @Autowired
    Topic topic;

    @GetMapping("send1")
    public String send(){
        jmsTemplate.send(queue, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage hello = session.createTextMessage("hello");
                return hello;
            }
        });
        return "ok";
        }
    @GetMapping("/send3")
    public String send2(String message){
       // jmsMessagingTemplate.convertAndSend(topic,"hello mq springboot");
        jmsMessagingTemplate.convertAndSend(queue,message);
        return "Ok";
    }
}
