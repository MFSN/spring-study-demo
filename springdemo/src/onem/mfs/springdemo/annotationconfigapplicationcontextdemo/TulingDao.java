package onem.mfs.springdemo.annotationconfigapplicationcontextdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TulingDao {

    @Autowired
    private TulingDao2 tulingDao2;

    public TulingDao(){
        System.out.println("我是TulingDao的构造方法");
    }

}
