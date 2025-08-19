public class ConstructorChaining1 {
    private int id;
    public String name;
    public String sem;

    //constructor1
    public ConstructorChaining1(int id) {
        this.id = id;
        System.out.println("ID : " + id);
    }

    //constructor2
    public ConstructorChaining1(int id, String name) {
        this(id); //calling constructor1
        this.name = name;
        System.out.println("ID: " + id + " and Name: " + name);
    }

    //constructor3
    public ConstructorChaining1(int id, String name, String sem) {
        this(id, name); //calling constructor2
        this.sem = sem;
        System.out.println("ID: " + id + " and Name: " + name + " and Semester: " + sem);
    }

    public static void main(String[] args) {
        ConstructorChaining1 obj = new ConstructorChaining1(1, "Dipaak", "BCA-VI");
        
    }

}
