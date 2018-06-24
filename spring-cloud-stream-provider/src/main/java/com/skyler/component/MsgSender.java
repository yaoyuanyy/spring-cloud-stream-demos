package com.skyler.component;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * Description:
 * <p></p>
 * <pre></pre>
 * NB.
 * Created by skyler on 2018/6/23 at 下午10:25
 */
@EnableBinding(MsgSource.class)
public class MsgSender {

    @Resource
    private MsgSource msgSource;

    public void send(){
        msgSource.output().send(MessageBuilder.withPayload("{\"name\":\"didi\", \"id\":30}").build());
    }
}
