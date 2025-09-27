package com.service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

import com.business.Bank;

public class LogAfterService implements AfterReturningAdvice{
	@Override
	public void afterReturning (Object o, Method m, Object[] param, Object ret)throws Throwable{
		Log l=LogFactory.getLog(Bank.class);
		l.info("Deposit Method..."+ret);
	}

}
