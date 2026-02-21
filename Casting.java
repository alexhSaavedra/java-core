public class Casting{

    public static void main(String[] args){
        byte b1= 127;
        int integer = 123123;

        byte test = (byte)integer;

        float floatNumber = 12.3f;

        int numberInt = (int)floatNumber;

        System.out.println(test);

        System.out.println(numberInt);
    }
}