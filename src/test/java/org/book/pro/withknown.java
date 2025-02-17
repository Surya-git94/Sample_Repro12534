package org.book.pro;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import net.bytebuddy.asm.Advice.Return;

public class withknown implements IRetryAnalyzer{
int min= 0,max = 5;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return true;
	}
	return false;

}
