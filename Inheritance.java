public class Inheritance {
    public static void main(String[] args){
        Child newChild = new Child();
        System.out.println("Your first name is: " + newChild.firstName);
        newChild.displayLastName();


    }
}

class Parent{
    protected String lastName = "Parker";

    public void displayLastName(){
        System.out.println("Your last name is: " + lastName);

    }
}

class Child extends Parent{
    public String firstName = "Peter";
}
