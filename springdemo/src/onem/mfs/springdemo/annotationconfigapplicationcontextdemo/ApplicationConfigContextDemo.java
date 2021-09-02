package onem.mfs.springdemo.annotationconfigapplicationcontextdemo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationConfigContextDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("onem.mfs.springdemo.annotationconfigapplicationcontextdemo");
       /* System.out.println(annotationConfigApplicationContext.getBean(TulingDao2.class));
        System.out.println(annotationConfigApplicationContext.getBean(TulingDao.class));*/
        /*annotationConfigApplicationContext.publishEvent(new ApplicationEvent("我发布了一个事件") {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });*/
        //annotationConfigApplicationContext.getBean(TulingDao.class);
    }


}
