public class StringvsStringBuffer {
    public static void main(String[] args) {

        //String
        String str1 = "Sita";
        str1.concat("Ram"); // str1 = Sita 'cause String is immutable
        System.out.println(str1.concat("Ram")); //output = SitaRam 'cause there is an object reference now

        //StringBuffer
        StringBuffer str2 = new StringBuffer("Dipaak");
        str2.append("Uni"); //output = DipaakUni 'cause StringBuffer is mutable
        System.out.println(str2);
    }

}
