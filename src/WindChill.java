//Import Scanner utility
import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {

		// Create a Scanner object called input to read data from the user
		Scanner input = new Scanner(System.in);

		// Declare variables to save values of temperature in Fahrenheit, wind speed and wind chill temperature
		double tempInFahrenheit, windSpeed, windChillTemp;
		String PROGRAM_PURPOSE = "Wind Chill Temperature Calculator",
				PROMPT_FOR_TEMPERATURE = "Please enter the temperature between -45 and 40 inclusively in Fahrenheit: ",
				PROMPT_FOR_WINDSPEED = "Please enter the wind speed between 5 and 60 inclusively in miles per hour: ";
		
		// Print purpose of the program
		System.out.println("\n" + PROGRAM_PURPOSE + "\n");
		
		// Prompt user for temperature in Fahrenheit
		System.out.print(PROMPT_FOR_TEMPERATURE);
		// Read temperature in Fahrenheit and save it to double variable tempInFahrenheit
		tempInFahrenheit = input.nextDouble();

		// Prompt user for wind speed
		System.out.print(PROMPT_FOR_WINDSPEED);
		// Read wind speed and save it to double variable windSpeed
		windSpeed = input.nextDouble();

		// Calculate wind-chill temperature, using the formula 35.74 + 0.6215T - 35.75(V^0.16) + 0.4275T(V^0.16)
		windChillTemp = 35.74 + (0.6215 * tempInFahrenheit) - (35.75 * (Math.pow(windSpeed, 0.16)))
				+ (0.4275 * tempInFahrenheit *(Math.pow(windSpeed, 0.16)));

		// Display wind-chill temperature 
		System.out.println("The wind chill temperature is " + windChillTemp + " degrees Fahrenheit");
		// Display programmer's name
		System.out.println("\nProgrammer: Gabriel I Feliz\n");		

		input.close(); // Close Scanner object to avoid resource leak
	}

}