public class NestedClasses {
    public static void main (String[] args){
        Zest objZest = new Zest();
        Zest.Seed objSeed = objZest.new Seed();
        objSeed.message();

    }
    
}

class Zest{

    class Seed{
        public void message(){
            System.out.println("The seed is inside the zest.");
        }
    }
}


