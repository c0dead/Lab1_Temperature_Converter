package TemperatureConversionPackage;

// абстрактный класс-создатель ConverterCreator объявляет (абстрактный) фабричный метод createConverter(), который возвращает объект интерфейса IConverter,
// и реализует метод getConversion()
public abstract class ConverterCreator {
    // метод getConversion() получает нужный конвертер и возвращает результат конвертации
    public double getConversion(double temperatureInCelsius) {
        IConverter IConverter = createConverter();
        return IConverter.convert(temperatureInCelsius);
}
    // фабричный метод
    public abstract IConverter createConverter();
}