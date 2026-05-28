package clases;

class Calculator{

    public int add(int a, int b,  int c){
        return a +b +c;
    }

    public int add(int a , int b){
        return a +b;
    }

    public Double add(Double a, int b){
        return a +b;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

       int result = calc.add(0, 1);

        System.out.println(result);
    }
    
}
