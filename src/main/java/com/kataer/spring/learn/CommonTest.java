package com.kataer.spring.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommonTest {
  public static ApplicationContext getApplicationContext() {
    ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("test.xml");
    return xmlApplicationContext;
  }
}
