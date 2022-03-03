package com.kataer.spring.learn.factory;

import com.kataer.spring.learn.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Test {
  //BeanDefinition 类的定义
  //BeanFactory 容器
  //BeanFactoryPostProcessor 容器增强
  public static void main(String[] args) {
    ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("test.xml");
    User user = xmlApplicationContext.getBean("user", User.class);
    int beanDefinitionCount = xmlApplicationContext.getBeanDefinitionCount();
    System.out.println(beanDefinitionCount);
    Arrays.stream(xmlApplicationContext.getBeanDefinitionNames()).map(item->{
      System.out.println(item);
      return item;
    }).count();
  }
}
