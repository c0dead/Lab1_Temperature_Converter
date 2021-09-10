import TemperatureConversionPackage.ConverterCreator;
import TemperatureConversionPackage.FahrenheitConverterCreator;
import TemperatureConversionPackage.KelvinConverterCreator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static ConverterCreator converterCreator; // создатель конвертера

    public static void main(String[] args) {
        try {
            System.out.println("Enter the temperature to convert (in Celsius): ");
            Scanner scanner = new Scanner(System.in); // для ввода конвертируемого значения с клавиатуры
            double temperature = scanner.nextDouble(); // считываем температуру

            getConverterCreator(); // получаем нужного создателя конвертера
            double convertedTemperature = getConvertedTemperature(temperature); // получаем конвертированную температуру
            System.out.println(convertedTemperature); // выводим конвертированную температуру
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage() + ".");
        }
    }

    // метод, определяющий локаль системы и получающий нужного создателя конвертера
    static void getConverterCreator() throws Exception {
        String country = Locale.getDefault().getCountry(); // получаем страну пользователя
        System.out.println("User's country: " + country);

        // в зависимости от локали системы получаем нужного создателя конвертера
        switch (country) {
            // для США конвертируем C -> F
            case "US":
                converterCreator = new FahrenheitConverterCreator();
                break;
            // для России конвертируем C -> K
            case "RU":
                converterCreator = new KelvinConverterCreator();
                break;
            // если нет соответствующего конвертера, выбрасываем исключение
            default:
                throw new Exception("there's no appropriate converter");
        }
    }

    // метод возвращает конвертированную температуру
    static double getConvertedTemperature(double temperature) {
        return converterCreator.getConversion(temperature);
    }
}
