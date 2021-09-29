package main.kadetov.test;

import main.kadetov.task.Task;

public class Test1 {
    
    public void Test() {
        double x = 5, y = 3.5;
        double realResult;
        double expectedResult = 5.235;
        realResult = Task.Task1(x, y);  
        if ( realResult > expectedResult * 0.99 &&
        		realResult < expectedResult * 1.01 )
        {
        	System.out.print("Right");
        }
    }
}