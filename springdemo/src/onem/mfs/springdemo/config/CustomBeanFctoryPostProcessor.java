package onem.mfs.springdemo.config;

import onem.mfs.springdemo.bean.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class CustomBeanFctoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        //获取到了bean的定义信息
       /* Object student = configurableListableBeanFactory.getBean("student");
        if(student instanceof Student){
            ((Student) student).setSchoolName("lala");
            System.out.println("BeanFctoryPostProcessor执行了");
        }*/
        System.out.println("BeanFctoryPostProcessor执行了");
    }
}
