package OOPConcepts;

class Lecturer {
    public void teaches() {
        System.out.println("A lecturer teaches college students.");
    }
}

class SKSir extends Lecturer {
    @Override
    public void teaches() {
        System.out.println("S.K. Sir teaches AI.");
    }
}

class JayaramSir extends Lecturer{
    @Override
    public void teaches() {
        System.out.println("Jayaram Sir teaches Cyber Sec.");
    }
}

class HemSir extends Lecturer {
    @Override
    public void teaches() {
        System.out.println("Hem Sir teaches SE.");
    }
}

class JhalnathSir extends Lecturer {
    @Override
    public void teaches() {
        System.out.println("Jhalnath Sir teaches Java.");
    }
}

class RajuSir extends Lecturer {
    @Override
    public void teaches() {
        System.out.println("Raju Sir teaches R&M.");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Lecturer obj = new Lecturer();
        System.out.println("Class: Lecturer");
        obj.teaches();

        SKSir objS = new SKSir();
        System.out.println("Class: SKSir");
        objS.teaches();

        JayaramSir objJ = new JayaramSir();
        System.out.println("Class: JayaramSir");
        objJ.teaches();

        HemSir objH = new HemSir();
        System.out.println("Class: HemSir");
        objH.teaches();

        JhalnathSir objFav = new JhalnathSir();
        System.out.println("Class: JhalnathSir");
        objFav.teaches();

        RajuSir objR = new RajuSir();
        System.out.println("Class: RajuSir");
        objR.teaches();

    }

}
