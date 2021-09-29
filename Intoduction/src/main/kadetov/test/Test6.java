package main.kadetov.test;
import main.kadetov.task.Task;

public class Test6 {
    public void Test() {
        double[] data = new double[] { 1, 2, 3, 4, 5 };
        double[][] realResult;
        double[][] expectedResult = 
        	    {{1.0, 2.0, 3.0, 4.0, 5.0},
        		{2.0, 3.0, 4.0, 5.0, 1.0},
        		{3.0, 4.0, 5.0, 1.0, 2.0},
        		{4.0, 5.0, 1.0, 2.0, 3.0},
        		{5.0, 1.0, 2.0, 3.0, 4.0}};
        
        realResult = Task.Task6(data);
        if ( realResult == expectedResult)
        {
        	System.out.print("Right");
        }
    }
}