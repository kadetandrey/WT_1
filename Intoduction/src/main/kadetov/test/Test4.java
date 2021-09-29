package main.kadetov.test;

import java.util.ArrayList;
import java.util.stream.IntStream;

import main.kadetov.task.Task;

public class Test4
{
	private static boolean isPrime(int number) {
	    return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
	}
	
    public void Test() {
        ArrayList<Integer> realResult = Task.Task4(20);
        boolean expectedResult = true;
        
        for(Integer num : realResult) {
        	if (!isPrime(num.intValue())) {
        		expectedResult = false;
        		break;
        	}
        }
    }
    
    
}
