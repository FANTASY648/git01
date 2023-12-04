package lgw.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class LogAdvice {

    @Before("execution(* lgw.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        String simpleName = joinPoint.getTarget().getClass().getSimpleName(); //得到类名
        String methodName = joinPoint.getSignature().getName(); //方法名
        System.out.println(simpleName + "::" + methodName + "执行了");
    }

}
