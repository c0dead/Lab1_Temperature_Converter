package TemperatureConversionPackage;

// интерфейс: определяет метод конвертации любого конвертера (общее поведение -- метод convert())
public interface IConverter {
    public double convert(double temperatureInCelsius);
}
