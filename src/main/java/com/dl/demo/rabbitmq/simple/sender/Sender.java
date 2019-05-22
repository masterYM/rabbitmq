//package com.dl.demo.rabbitmq.simple.sender;
//
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Sender {
//
//    @Autowired
//    private AmqpTemplate amqpTemplate;
//
//    public String send(){
//
//        System.out.println("Sender : start");
//
//        for(int i = 0;i < 10;i++){
//            String context = "hello " + i;
//            this.amqpTemplate.convertAndSend("hello",context);
//            try {
//                Thread.sleep(10_00);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println("send over");
//        return "send over";
//
//
//    }
//}
