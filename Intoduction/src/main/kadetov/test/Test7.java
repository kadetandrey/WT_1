package main.kadetov.test;
import main.kadetov.task.Task;

public class Test7 {
	    public void Test() {
	        int[] data = new int[] { 5, 4, 3, 2, 1 };
	        int[] expectedResult = new int[] { 1, 2, 3, 4, 5};
	        Task.Task7(data); 
	        
        if ( data == expectedResult)
        {
        	System.out.print("Right");
        }
    }
}