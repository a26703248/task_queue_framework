package blog.howardli.aop;

import blog.howardli.annotation.TaskExecutor;
import blog.howardli.annotation.TaskExtractor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


@Aspect
@Component
public class TaskExtractorAop implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Around("execution(public * *(..)) && @annotation(blog.howardli.annotation.TaskExtractor)")
    private Object TaskExtractorAop(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = joinPoint.proceed();
        String[] contextAllBeanNames = applicationContext.getBeanDefinitionNames();
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        TaskExtractor annotation = signature.getMethod().getAnnotation(TaskExtractor.class);

        for (String beanName : contextAllBeanNames) {
            Object bean = applicationContext.getBean(beanName);
            Method[] methods = bean.getClass().getMethods();
            for (Method method : methods) {
                Set<? extends Class<? extends Annotation>> annotationSet = Arrays.stream(method.getAnnotations())
                        .map(Annotation::annotationType)
                        .collect(Collectors.toSet());
                if (!annotationSet.contains(TaskExecutor.class)) continue;
                if (method.getAnnotation(TaskExecutor.class).value().equals(annotation.taskProcessName())){
                    method.invoke(bean, result);
                }
            }
        }
        return result;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        TaskExtractorAop.applicationContext = applicationContext;
    }
}
