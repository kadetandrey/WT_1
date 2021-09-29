package main.kadetov.test;
import main.kadetov.task.Task;

public class Test2 {
    
    public void Test() {
        double x = 5, y = 3.5;
        boolean realResult;
        boolean expectedResult = false;
        
        realResult = Task.Task2(x, y);
        if ( realResult == expectedResult)
        {
        	System.out.print("Right");
        }
    
    }
}
