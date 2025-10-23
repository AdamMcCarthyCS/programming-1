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

    /**
     * Demonstrate the use of the compareTo method
     */
    public void exer3() {
        // Part 1
//        String str1 = "Dog";
//        String str2 = "Cat";

        // Part 2
//        String str1 = "cat";
//        String str2 = "Cat";

        // Part 3
//        String str1 = "Animal";
//        String str2 = "Cat";

        // Part 4
        String str1 = "Cat";
        String str2 = "Cat";

        if(str1.compareTo(str2) < 0) {
            System.out.println(str1 + " comes before " + str2 + " in the alphabet");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println(str2 + " comes before " + str1 + " in the alphabet");
        } else {
            System.out.println("The strings are identical");
        }
    }

    /**
     * Demonstrate the use of the equals method
     */
    public void exer4() {
        // Part 1
//        String str1 = "a";
//        String str2 = "b";

        // Part 2
        String str1 = "a";
        String str2 = "a";

        if (str1.equals(str2)) {
            System.out.println(str1 + " is the same as " + str2);
        } else {
            System.out.println(str1 + " is NOT the same as " + str2);
        }
    }
}
