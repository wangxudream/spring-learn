package com.kataer.spring.learn.entity;

import lombok.Data;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@Data
public class User implements ApplicationContextAware, BeanFactoryAware {
  private String name;
  private Integer age;
  private ApplicationContext applicationContext;
  private BeanFactory beanFactory;
}
