public class Driver {
    public static void main(String[] args){

        // create an instance of the ClassExamples class
        ClassExamples example = new ClassExamples();

        // cube the number and output the result
        int numToBeCubed = 4;
        int cubedNumber = example.cubeOfInteger(numToBeCubed);
        System.out.println(numToBeCubed + " cubed is " + cubedNumber);

        // leave a space between the outputs
        System.out.println();

        // call the parameterless version of the method
        int otherCubedNumber = example.cubeOfInteger();
        System.out.println("The cube of this number is: " + otherCubedNumber);
    }
}
