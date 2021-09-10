package TemperatureConversionPackage;

// класс KelvinConverter реализует методы интерфейса IConverter
public class KelvinConverter implements IConverter {
    @Override
    public double convert(double temperatureInCelsius) {
        return temperatureInCelsius + 273.15; // формула перевода K = C + 273,15
    }
}
