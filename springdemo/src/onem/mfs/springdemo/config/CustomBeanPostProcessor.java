package onem.mfs.springdemo.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;


public class CustomBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

            System.out.println("postProcessBeforeInitialization执行了-----------");

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

            System.out.println("postProcessAfterInitialization执行了-----------");

        return bean;
    }

}
