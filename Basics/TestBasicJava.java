public class TestBasicJava {
    public static void main(String[] args) {
        int[] arr = {-1, 5, 4, -7, 8};
        BasicJava basic = new BasicJava();
        basic.printAllNums();
        basic.printOdds();
        System.out.println(basic.sigma());
        basic.printValuesInArray(arr);
        basic.findMax(arr);
        System.out.println(basic.arrayOddNums());
        basic.getAverage(arr);
        basic.getNumsGreater(arr, 3);
        basic.maxMinAvg(arr);
        basic.shiftValuesInArray(arr);
    }
}
