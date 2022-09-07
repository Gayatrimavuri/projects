package com.aop.prgs.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class LoggingAspect {
	@After("execution(public String getName())")
	public void LogginAdvice()
	{
			System.out.println("Advice run Method Called");
	}

}
