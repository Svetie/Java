public class TestFizzBuzz {
    //  test our FizzBuzz methods
    public static void main(String[] args) {
        FizzBuzz tester = new FizzBuzz();
        System.out.println(tester.fizzBuzz(9));     // Fizz
        System.out.println(tester.fizzBuzz(10));    // Buzz
        System.out.println(tester.fizzBuzz(15));    // FizzBuzz
        System.out.println(tester.fizzBuzz(16));    // 16
        System.out.println(tester.fizzBuzz(2));     // 2

        System.out.println(tester.fizzBuzz(9, "By three", "By Five", "Both"));     // Fizz
        System.out.println(tester.fizzBuzz(10, "By three", "By Five", "Both"));    // Buzz
        System.out.println(tester.fizzBuzz(15, "By three", "By Five", "Both"));    // FizzBuzz
        System.out.println(tester.fizzBuzz(16, "By three", "By Five", "Both"));    // 16
        System.out.println(tester.fizzBuzz(2, "By three", "By Five", "Both"));     // 2
        // Uncomment the following for a more comprehensive test:
        for (int i = 1; i <= 50; i++) {
            System.out.println(tester.fizzBuzz(i));
        }
    }
}