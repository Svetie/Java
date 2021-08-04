import java.util.ArrayList;
import java.util.Arrays;
/**
 * BasicJava
 */
public class BasicJava {

    // method that prints all the numbers from 1 to 255
    public void printAllNums() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    // method that prints all the odd numbers from 1 to 255
    public void printOdds() {
        for (int i = 1; i <= 255; i+=2) {
            System.out.println(i);
        }
    }

    // Sigma of 255: sum of number 1 through 255
    public int sigma() {
        int sum = 0;
        for(int i = 1; i <= 255; i++){
            sum += i;
        }
        return sum;
    }

    // print all values in a given array
    public void printValuesInArray(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }

    // method that finds a maximum value in an array
    public void findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if(i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }

    //  a method that creates an array 'y' that contains all the odd numbers between 1 to 255
    public ArrayList<Integer> arrayOddNums() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i+=2) {
            y.add(i);
        }
        return y;
    }

    //*******************Ninja bonuses
    // method that takes an array, and prints the AVERAGE of the values in the array
    public void getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println("Average is " + avg);
    }

    //method that takes an array and returns the number of values in that array whose value is greater than a given value
    public void getNumsGreater(int[] arr, int number) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > number){
                counter++;
            }
        }
        System.out.println(counter);
    }

    // method that multiplies each value in the array by itself
    public int[] squareValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
        return arr;
    }

    // replace negative values with 0 in a given array
    public int[] removeNegatives(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    // ************ Sensei bonuses
    public int[] maxMinAvg(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        int avg;
        int[] mma = new int[3];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]  < min){
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        avg = sum / arr.length;
        mma[0] = max;
        mma[1] = min;
        mma[2] = avg;
        for (int val : mma) {
            System.out.println(val);
        }
        return mma;
    }

    public int[] shiftValuesInArray(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;
        for (int value : arr) {
            System.out.println(value);
        }
        return arr;
    }
}