package OOPConcepts;

import java.util.Scanner;


public class Encapsulation {

    public String name = "Dipaak";
    private int pinNumber; 

    //setter
    public void setPinNumber(int pin) {
        this.pinNumber = pin;

    }

    //getter
    public int getPinNumber() {
        return pinNumber; //returning a private data type
    }

    public static void main(String[] args) {
        Encapsulation mainObj = new Encapsulation();

        Scanner obj = new Scanner(System.in);
        
        int num;
        System.out.println("Hello, Dipaak! Enter your pin number:");
        num = obj.nextInt();

        mainObj.setPinNumber(num);

        System.out.println("Your pin number is: " + mainObj.getPinNumber());

    }

}
