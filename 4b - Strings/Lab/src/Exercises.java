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

    /**
     * Demonstrate the use of the substring String method
     */
    public void exer2() {
        // Version 1 (with variable)
//        String anotherPalindrome = "Niagara. O roar again!";
//        String roar = anotherPalindrome.substring(11, 15);
//        System.out.println(roar);

        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.substring(11, 15));
    }
}
