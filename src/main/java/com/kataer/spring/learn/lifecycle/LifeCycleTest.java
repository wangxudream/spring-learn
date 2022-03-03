package com.kataer.spring.learn.lifecycle;

import com.kataer.spring.learn.CommonTest;
import com.kataer.spring.learn.entity.User;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;

/**
 * Bean的生命周期
 */
@Slf4j
public class LifeCycleTest {
  public static void main(String[] args) {
    ApplicationContext applicationContext = CommonTest.getApplicationContext();
    String name = applicationContext.getClass().getName();
    log.info("ApplicationContext class");
    boolean prototype = applicationContext.isPrototype("user");
    User user = applicationContext.getBean("user", User.class);

//    Bean factory implementations should support the standard bean lifecycle interfaces as far as possible. The full set of initialization methods and their standard order is:
//    beanFactory应该实现这些接口
//   1、实现aware接口
//    BeanNameAware's setBeanName
//    BeanClassLoaderAware's setBeanClassLoader
//    BeanFactoryAware's setBeanFactory
//    EnvironmentAware's setEnvironment
//    EmbeddedValueResolverAware's setEmbeddedValueResolver
//    ResourceLoaderAware's setResourceLoader (only applicable when running in an application context)
//    ApplicationEventPublisherAware's setApplicationEventPublisher (only applicable when running in an application context)
//    MessageSourceAware's setMessageSource (only applicable when running in an application context)
//    ApplicationContextAware's setApplicationContext (only applicable when running in an application context)
//    ServletContextAware's setServletContext (only applicable when running in a web application context)
//   2、BeanPostProcessors的before方法
//    postProcessBeforeInitialization methods of BeanPostProcessors
//  3、afterPropertiesSet
//    InitializingBean's afterPropertiesSet
//   4、初始化方法
//    a custom init-method definition
//   5、BeanPostProcessors的after方法
//    postProcessAfterInitialization methods of BeanPostProcessors
//    On shutdown of a bean factory, the following lifecycle methods apply:
//    postProcessBeforeDestruction methods of DestructionAwareBeanPostProcessors
//    DisposableBean's destroy
//    a custom destroy-method definition
  }
}
