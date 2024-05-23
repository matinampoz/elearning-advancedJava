package ch2.manualTest;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        //test data and expected results
        int a = 5, b = 7;
        int expected = 12;

        //actual results
        int actual = calc.add(5, 7);

        //assert expected == actual
        if (expected == actual){
            System.out.println("test ok in add method");
        } else{
            System.out.println("test failed in add method");
        }
    }
}
