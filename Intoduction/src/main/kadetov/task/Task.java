package main.kadetov.task;

import java.math.BigInteger;
import java.util.ArrayList;

public class Task {
	
    
    public static double Task1(double x, double y) {
        double num = 1 + Math.sin(x + y) * Math.sin(x + y);
        double den = 2 + Math.abs(x - (2 * x) / (1 + x * x * y * y));
        double resultValue = num / den + x;
        return resultValue;
    }

    public static boolean Task2(double x, double y) {
        boolean condition = ((x >= -4 && x <= 4) &&
                (y >= 0 && y <= 5)) ||
            ((x >= -6 && x <= 6) &&
                (y >= -3 && y <= 0));
        return condition;
    }

    public static double[][] Task3(double a, double b, double h) {
        double[][] tableResult;
        int tableHeight;

        tableHeight = (int) Math.ceil(Math.abs(b - a) / h);
        tableResult = new double[tableHeight][2];

        int n = 0;
        for (double value = a; value <= b; value += h, ++n) {
        	tableResult[n][0] = value;
        	tableResult[n][1] = Math.tan(value);
        }

        return tableResult;
    }

    public static void printTable(double[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.format("%+.5f ", table[i][j]);
            }
            System.out.println();
        }
    }

    
    public static ArrayList<Integer> Task4(int n) {
        int[] randArray = new int[n];
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (int)(Math.random() * 100);
            BigInteger bigInteger = BigInteger.valueOf(randArray[i]);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(randArray[i]));

            if (probablePrime) {
            	result.add(randArray[i]);
            }
        }
        
        return result;
    }

    public static int Task5(int[] sequence) {
		
        int maxIncLen = 0, curInLen = 0;
        boolean isIncrease;

        for (int i = 0; i < sequence.length; i++) {
            isIncrease = true;
            curInLen = 1;
            for (int j = i + 1; (j < sequence.length) && isIncrease; j++) {
                if (sequence[j - 1] < sequence[j]) {
                	curInLen++;
                } else {
                    isIncrease = false;
                }
            }
            maxIncLen = Math.max(maxIncLen, curInLen);
        }
        return sequence.length - maxIncLen;
    }

    public static double[][] Task6(double[] numbers) {
        int arrayHeight = numbers.length;
        double[][] matrix = new double[arrayHeight][arrayHeight];

        for(int i = 0; i < arrayHeight; i++ ) {
            int k = i;
            for(int j = 0; j < arrayHeight; j++) {
                matrix[i][j] = numbers[k];
                if(k < arrayHeight - 1) {
                    k++;
                }
                else
                {
                    k = 0;
                }
            }
        }

        return matrix;
    }
    

    public static void Task7(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i ++) {
            int minIndex = min(array, i, n - 1);
            swap(array, i, minIndex);
        }
        
    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private static int min(int[] array, int begin, int end) {
        int minVal = array[begin];
        int minIndex = begin;
        for (int i = begin + 1; i <= end; i++) {
            if (array[i] < minVal) {
                minVal = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static String Task8(double[] a, double[] b) {
        int aLen = a.length;
        int bLen = b.length;
        String result = "";
        
        for(int i = 0; i < bLen; i++) {
            for(int j = 1; j < aLen; j++) {
                if(b[i] > a[j-1] && b[i] < a[j] ) {
                	result += String.format("Enter %3f after %3f\n", b[i], a[j-1]);
                }
            }
        }
        
        return result;
    }

}
