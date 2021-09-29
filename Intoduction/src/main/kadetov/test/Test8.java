package main.kadetov.test;
import main.kadetov.task.Task;

public class Test8 {
	 public void calcYT001() {
	    	double[] sequence1 = new double[]{1,2,3,3,4,4,5,5,11};
	    	double[] sequence2 = new double[]{-1,3,4,4,5,5,5,6,7,7,9,9,9};
	    	
	        String realResult;
	        String expectedResult;
	        
	        realResult = Task.Task8(sequence1, sequence2);
	        expectedResult = realResult;
	    
	        if ( realResult == expectedResult)
	        {
	        	System.out.print("Right");
	        }
    }
}