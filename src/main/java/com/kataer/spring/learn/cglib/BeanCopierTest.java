package com.kataer.spring.learn.cglib;

import org.springframework.cglib.beans.BeanCopier;
import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @author kataer
 * @description: 测试beanCopier的原理
 * @date 2021/12/7
 */
public class BeanCopierTest {
  public static void main(String[] args) throws InterruptedException {
    //利用asm字节吗框架生成代理类
    System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\DevelopmentDirs\\spring-learn");
    BeanCopier beanCopier = BeanCopier.create(UserA.class, UserB.class, false);
    BeanCopier beanCopier2 = BeanCopier.create(UserA.class, UserB.class, false);
    System.out.println(beanCopier.getClass());
    System.out.println(beanCopier2 == beanCopier );
  }
}
