package onem.mfs.springdemo.main;

import onem.mfs.springdemo.bean.Student;
import onem.mfs.springdemo.bean.Teacher;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class DemoMain {

    public static void main(String[] args) {
        BeanFactory applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        Student student = (Student)applicationContext.getBean("student");
        Teacher teacher = (Teacher)applicationContext.getBean("teacher");
        System.out.println("teacher:"+teacher.getSchoolName()+"student:"+student.getUsername()+student.getSchoolName());
    }

}
