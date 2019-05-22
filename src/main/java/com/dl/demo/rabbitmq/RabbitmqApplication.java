package com.dl.demo.rabbitmq;

//import com.dl.demo.rabbitmq.simple.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableScheduling
public class RabbitmqApplication {

//    @Autowired
//    Sender sender;

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqApplication.class, args);
    }

//    @RequestMapping("/test")
//    public void test(){
//        sender.send();
//    }

}
