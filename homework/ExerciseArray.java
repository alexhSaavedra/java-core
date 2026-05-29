package homework;

public class ExerciseArray {
   public static void main(String[] args) {
    
     int[] numbers = {45, 22, 89, 16, 90, 33};

    int smallest = 0;

    int largest = 0;

    for(int num: numbers){
        if(smallest == 0 || num<smallest){
            smallest = num;
        }

        if(largest ==0 || largest<num){
            largest = num;
        }
    }

    System.out.println("Smallest: "+ smallest);
    System.out.println("Largest: "+ largest);
   }
}
