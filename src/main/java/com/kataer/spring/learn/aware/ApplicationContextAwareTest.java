package com.kataer.spring.learn.aware;

import com.kataer.spring.learn.CommonTest;
import com.kataer.spring.learn.entity.User;
import org.springframework.context.ApplicationContext;

/**
 * invokeAwareMethods 调用实现aware接口的bean
 */
public class ApplicationContextAwareTest extends CommonTest {
  public static void main(String[] args) {
    ApplicationContext context = getApplicationContext();
    User user = context.getBean("user", User.class);
    ApplicationContext applicationContext = user.getApplicationContext();
    System.out.println(applicationContext.getApplicationName());
  }
}
