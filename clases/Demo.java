package clases;

class Calculator{
    int x;

    public int add(int num1, int num2){
        return num1 + num2;
    }
}

public class Demo {
    public static void main(String[] args) {

        int numberOne = 5;

        int numberTwo = 4;

        Calculator calc = new Calculator();

        int result = calc.add(numberOne, numberTwo);

        System.out.println(result);
        
    }
}
