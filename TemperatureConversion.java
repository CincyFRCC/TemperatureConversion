import java.util.Scanner;
public class TemperatureConversion {
    public  static void main (String[] args){
        //Printing the name of the project
        System.out.println("Temperature Conversion Project");
        //get the input for temperature in Fahrenheit
        Scanner temp=new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        //Assigning the temperature value to a variable
        int temperature=temp.nextInt();
        System.out.println("Temperature in Fahrenheit: "+temperature);
        //Converting the temperature in Fahrenheit to Celsius
        int tempCelsius=(temperature-32)*5/9;
        //Printing temperature in Celsius
        System.out.println("The temperature in Celsius is: "+tempCelsius);
        //Converting the temperature in Fahrenheit to Kelvin
        double tempKelvin= tempCelsius+273.15;
        //Printing temperature in Kelvin
        System.out.println("The temperature in Kelvin is: "+tempKelvin);
    }
}
