

    // PART 1 (INCORRECT)
//    public class Main {
//    public static void main(String[] args) {
//        int num1 = 1;
//        int num2 = 2;
//
//        if (num1 = num2)
//            System.out.println(num1+" is the same as "+ num2);
//        else
//            System.out.println(num1+" is NOT same as "+ num2);;
//    }

    // PART 1 (CORRECT)
//    public class Main {
//        public static void main(String[] args) {
//            int num1 = 1;
//            int num2 = 2;
//
//            if (num1 == num2)
//                System.out.println(num1+" is the same as "+ num2);
//            else
//                System.out.println(num1+" is NOT same as "+ num2);;
//        }
//    }

    // PART 2 (INCORRECT)
//    public class Main {
//        public static void main(String[] args) {
//            int num1 = 1;
//            int num2 = 2;
//
//            if (num1 == num2) ;
//                System.out.println(num1+" is the same as "+ num2);
//            if (num1 != num2)
//                System.out.println(num1+" is NOT same as "+ num2);
//
//        }

    // PART 2 (CORRECT)
//    public class Main {
//        public static void main(String[] args) {
//            int num1 = 1;
//            int num2 = 2;
//
//            if (num1 == num2)
//            System.out.println(num1+" is the same as "+ num2);
//            if (num1 != num2)
//                System.out.println(num1+" is NOT same as "+ num2);
//
//        }

// PART 3 (INCORRECT)
//    public class Main {
//        public static void main(String[] args) {
//            int num1 = 1;
//            int num2 = 2;
//
//            if(num1 == num2)
//                System.out.println(num1+" is the same as "+ num2);
//            System.out.println("This means that they are equal");
//            if (num1 != num2)
//                System.out.println(num1+" is NOT same as "+ num2);
//
//        }
//    }

    // PART 3 (CORRECT)
    public class Main {
        public static void main(String[] args) {
            int num1 = 1;
            int num2 = 1;

            if(num1 == num2) {
                System.out.println(num1 + " is the same as " + num2);
                System.out.println("This means that they are equal");
            }

            if (num1 != num2)
                System.out.println(num1+" is NOT same as "+ num2);

        }
    }

