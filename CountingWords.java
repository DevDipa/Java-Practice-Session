public class CountingWords {
    public static void main(String[] args) {
        String message = "Hello, Uni! This is Dipaak.";
        System.out.println("The number of words in the message is: " + message.split("\\s").length);
    }
}