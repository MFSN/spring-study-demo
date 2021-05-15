package onem.mfs.springdemo.config;

import onem.mfs.springdemo.bean.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * beanfactorypostprocessor是在Bean的配置信息(beandefination)加载后但是bean的实例化之前(调用构造方法之前)执行的，也就是BeanfactoryPostProcessor的postProcessBeanFactory方法会在每个bean调用构造方法之前执行
 */

public class CustomBeanFctoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        //获取到了bean的定义信息  如果这里调用的某个bean的方法就会使该bean提前实例化，那么该bean中的构造方法以及set方法就会在Beanfactorypostprocessor之前调用
        //如果这里给注释掉那么打印结果如下
        /*BeanFctoryPostProcessor执行了
                student构造方法执行了
        set方法执行了
                set方法执行了
        postProcessBeforeInitialization执行了-----------
                initmethod执行了
        postProcessAfterInitialization执行了-----------
                teacher构造方法执行了
        teacherset方法执行了
                teacherset方法执行了
        postProcessBeforeInitialization执行了-----------
                teacherinitmethod执行了
        postProcessAfterInitialization执行了-----------
                teacher:beidastudent:mmmMFS*/
        //如果下列代码不注释掉，也就是要提前初始化student类那么调用执行的顺序结果如下
       /* student构造方法执行了
                set方法执行了
        set方法执行了
                initmethod执行了
        BeanFctoryPostProcessor执行了
                BeanFctoryPostProcessor执行了
        teacher构造方法执行了
                teacherset方法执行了
        teacherset方法执行了
        postProcessBeforeInitialization执行了-----------
                teacherinitmethod执行了
        postProcessAfterInitialization执行了-----------
                teacher:beidastudent:mmmMFS*/
        //可以看到student中的构造方法以及set方法在postProcessBeanFactory调用之前被调用了而teacher中的构造方法和set方法是在postProcessBeanFactory调用之后被调用的
       /* Object student = configurableListableBeanFactory.getBean("student");
        if(student instanceof Student){
            ((Student) student).getSchoolName();
           // ((Student) student).setSchoolName("lala");
            System.out.println("BeanFctoryPostProcessor执行了");
        }*/
        System.out.println("BeanFctoryPostProcessor执行了");
    }
}
