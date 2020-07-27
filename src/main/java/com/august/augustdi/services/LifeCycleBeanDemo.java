package com.august.augustdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBeanDemo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("### Bean factory set: " + beanFactory.getClass().getName() + ".");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("### Setting bean name: "+ s + ".");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("### Destroying bean.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("### After property set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("### Bean application context set: " + applicationContext.getClass().getName() + ".");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("### Post construct called!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("### Pre destroy called");
    }

    public void beforeInit() {
        System.out.println("### Before init - called from post processor.");
    }

    public void afterInit() {
        System.out.println("### After init - called from post processor.");
    }
}
