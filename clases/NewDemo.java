package clases;

class Computer{

    public void playMusic(){
        System.out.println("playing music...");
    }

    public String getMeAPen(int num){
        if(num >=10){
            return "Pen";
        }

        return "Nothing";
    }
}

public class NewDemo {

    public static void main(String[] args) {

        Computer comp = new Computer();

        comp.playMusic();

        String pen = comp.getMeAPen(5);

        System.out.println(pen);
    }
    
}
