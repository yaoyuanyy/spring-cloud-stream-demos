package com.skyler.component;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Description:
 * <p></p>
 * <pre></pre>
 * NB.
 * Created by skyler on 2018/6/23 at 下午10:21
 */
public interface MsgSource {

    String OUTPUT = "output";

    @Output(OUTPUT)
    MessageChannel output();

}
