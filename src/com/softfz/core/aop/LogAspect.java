package com.softfz.core.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


/**
 * 日志切面
 * @author Administrator
 *
 */
//@Aspect
public class LogAspect {
	
	
	
	public LogAspect() {
	}

	private Log logger = LogFactory.getLog(LogAspect.class);
	//写入日志
	
	//@Before("execution(* com.softfz.core.web.controller..*.*(..))")
	public void writeLog(){
		logger.debug("记录日志...");
	
		System.out.println("记录日志...");
	}
}
