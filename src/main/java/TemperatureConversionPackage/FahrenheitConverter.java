package TemperatureConversionPackage;

// класс FahrenheitConverter реализует методы интерфейса IConverter
public class FahrenheitConverter implements IConverter {
    @Override
    public double convert(double temperatureInCelsius) {
        return temperatureInCelsius * 1.8 + 32; // формула перевода F = C * 1,8 + 32
    }
}
