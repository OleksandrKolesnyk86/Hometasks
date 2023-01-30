package Lesson2;

public class Lesson2task123 {
    public static void main(String[] args) {
        double celsiusTemperature = 20;
        double fahrenheitTemperature = 5 / 9 * celsiusTemperature + 32;
        double kelvinTemperature = celsiusTemperature + 273.16;
        System.out.println("For celsius temperature " + celsiusTemperature
                + " fahrenheit temperature is: " + fahrenheitTemperature + "\n"
                + "For celsius temperature " + celsiusTemperature + " kelvin temperature is: " + kelvinTemperature);
    }
}