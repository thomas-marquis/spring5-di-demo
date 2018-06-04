package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("LifeCycleDemoBean.setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("LifeCycleDemoBean.setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LifeCycleDemoBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeCycleDemoBean.afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("LifeCycleDemoBean.setApplicationContext");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("LifeCycleDemoBean.postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("LifeCycleDemoBean.preDestroy");
    }

    public void beforeInit() {
        System.out.println("LifeCycleDemoBean.beforeInit");
    }

    public void afterInit() {
        System.out.println("LifeCycleDemoBean.afterInit");
    }
}
