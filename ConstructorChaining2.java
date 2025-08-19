class ParentConstructor {
    private int value;
    public ParentConstructor(int value) {
        this.value = value;
        System.out.println("The value in the Parent constructor is: " + value);

    }
}

class ChildConstructor extends ParentConstructor {
    private int value; 
    private String message;
    public ChildConstructor(int value, String message) {
        super(value); //calling the Parent class constructor
        this.message = message;
        System.out.println("The value in the Child constructor is: " + value);
        System.out.println("The message in the Child constructor is: " + message);    }
}

public class ConstructorChaining2  {
    public static void main(String[] args) {
        ChildConstructor obj = new ChildConstructor(21, "Good?");

    }

}
