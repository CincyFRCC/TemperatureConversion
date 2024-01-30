import java.util.Scanner;
public class TemperatureConversion {
    public  static void main (String[] args){
        //Printing the name of the project
        System.out.println("Temperature Conversion Project");
        //get the input for temperature in Fahrenheit
        Scanner temp=new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        //Assigning the temperature value to a variable
        double temperature=temp.nextDouble();
        System.out.println("Temperature in Fahrenheit: "+temperature);
        //Converting the temperature in Fahrenheit to Celsius
        double TempCelsius=(temperature-32)*5/9;
        //Printing temperature in Celsius
        System.out.println("The temperature in Celsius is: "+TempCelsius);
        //Converting the temperature in Fahrenheit to Kelvin
        double TempKelvin= (float) (TempCelsius+273.15);
        //Printing temperature in Kelvin
        System.out.println("The temperature in Kelvin is: "+TempKelvin);
    }
}
