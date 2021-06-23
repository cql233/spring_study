package org.example;

import org.example.Bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("现在开始初始化容器！！！");

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("容器初始化成功！！！");
        Person person=context.getBean("people", Person.class);
        System.out.println(person);
//        System.out.println(person.getName());
        System.out.println("现在开始关闭容器！！！");
        ((ClassPathXmlApplicationContext)context).registerShutdownHook();
    }
}
