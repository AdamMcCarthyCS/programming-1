public class Exercises {

    /**
     * Demonstrate the use of the charAt string method
     */
    public void exer1(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String errorMessage404 = "HTTP 404 Not Found Error";

        System.out.println("The character at position 4 in "
            + alphabet
            + " is "
            + alphabet.charAt(3));

        System.out.println("The character at position 10 in "
            + errorMessage404
            + " is "
            + errorMessage404.charAt(9));
    }
}
