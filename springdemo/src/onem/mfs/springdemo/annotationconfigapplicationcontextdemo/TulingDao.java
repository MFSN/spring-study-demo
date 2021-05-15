package onem.mfs.springdemo.annotationconfigapplicationcontextdemo;

import org.springframework.stereotype.Component;

@Component
public class TulingDao {

    public TulingDao(){
        System.out.println("我是TulingDao的构造方法");
    }

}
