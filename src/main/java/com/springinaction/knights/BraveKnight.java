package com.springinaction.knights;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author oleh.krupenia.
 */
public class BraveKnight implements Knight, BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor,
        DisposableBean, InitializingBean {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization");
        return bean;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void before() {
        System.out.println("custom before");
    }

    public void after() {
        System.out.println("custom after");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}