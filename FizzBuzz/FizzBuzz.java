
/**
 * FizzBuzz
 * Returns differen Strings if a number
 * divisible by 3, 5, 3 and 5, or not divisible by them
 */
public class FizzBuzz {

    public String fizzBuzz(int number) {
        if((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        }
        else if(number % 3 == 0) {
            return "Fizz";
        }
        else if(number % 5 == 0) {
            return "Buzz";
        }
        else {
            return String.valueOf(number);
        }
    }

    public String fizzBuzz(int number, String multOf3Word, String multOf5Word, String multOf15Word) {
        // Implement the same logic, but replace "Fizz", "Buzz" and
        // "Fizzbuzz" with the given words
        if((number % 3 == 0) && (number % 5 == 0)) {
            return multOf15Word;
        }
        else if(number % 3 == 0) {
            return multOf3Word;
        }
        else if(number % 5 == 0) {
            return multOf5Word;
        }
        else {
            return String.valueOf(number);
        }
    }
}