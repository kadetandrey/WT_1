package main.kadetov.test;

import main.kadetov.task.Task;

public class Test3{
    
	public void Test() {
        double a = 2, b = 5, h = 1;
        double[][] realResult;
        double[][] expectedResult = { {2.0, -2.185039863261519},
        							  {3.0, -0.1425465430742778},
        							  {4.0, 1.1578212823495777},
        							  {5.0, -3.380515006246586}
        							};
        
        realResult = Task.Task3(a, b, h);
        if( realResult == expectedResult)
        {
        	System.out.print("Right");
        }
    
    }
}