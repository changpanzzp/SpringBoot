package com.w77996.springboot.object;

import com.w77996.springboot.bean.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {
    @RabbitHandler
    public void process(User user){
        System.out.println("ObjectReceiver :"+user.toString());
    }
}
