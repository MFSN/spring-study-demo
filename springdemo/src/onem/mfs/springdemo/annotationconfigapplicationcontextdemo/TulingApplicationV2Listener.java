package onem.mfs.springdemo.annotationconfigapplicationcontextdemo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TulingApplicationV2Listener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        System.out.println("V2 我接受到了一个事件"+event.getSource());
    }
}
