package OOPConcepts;

abstract class Abstraction {
    public void display() {
        System.out.println("This class extends the abstract class.");
    }

    abstract void Trait();
}

class Dipaak extends Abstraction {
    public void Trait() {
        System.out.println("Reserved");
    }
}

    class Bhawsie extends Abstraction {
        public void Trait() {
            System.out.println("Sassy");
        }
    }

    class Jenn10 extends Abstraction {
        public void Trait() {
            System.out.println("Extrovert");
    }
    }


public class Abstract {
    public static void main(String[] args) {
        Dipaak objD = new Dipaak();
        System.out.println("Class: Dipaak");
        objD.display();
        objD.Trait();

        Bhawsie objB = new Bhawsie();
        System.out.println("Class: Bhawsie");
        objB.display();
        objB.Trait();

        Jenn10 objJ = new Jenn10();
        System.out.println("Class: Jenn10");
        objJ.display();
        objJ.Trait();
    }
    
    
}
