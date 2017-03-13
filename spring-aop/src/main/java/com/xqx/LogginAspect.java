package com.xqx;



import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@Before("execution(* com.xqx.Calculator.*(..))&&args(a,..)")
	private void arithmeticDoLog(JoinPoint jp,int a){
		System.out.println(a + ":" + jp.toString());
	}
}
