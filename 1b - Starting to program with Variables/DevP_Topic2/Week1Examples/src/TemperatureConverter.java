public class TemperatureConverter {
    public static void main(String[] args) {
        // store the temperature to be converted to Fahrenheit
        int celsius = 20;

        /*
        Use the formula F = (C * 9/5) + 32 to convert Celsius to Fahrenheit
        Store the result in a double as division may result in a decimal
        Use implicit casting to a double by dividing by 5.0
         */
        double fahrenheit = (celsius * 9 / 5.0)  + 32;

        // Output the result of the conversion
        System.out.println(celsius + "C is " + fahrenheit + "F");
    }
}
