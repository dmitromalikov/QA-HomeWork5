package HomeWork5.lesson5.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
	Result result = JUnitCore.runClasses(FuncSuite.class);
	
	for (Failure failure : result.getFailures()) {
	System.out.println(failure.toString());
	}
	System.out.println(result.wasSuccessful());
	}
		// TODO Auto-generated method stub

	}
