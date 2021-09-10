package TemperatureConversionPackage;

// подкласс FahrenheitConverterCreator абстрактного класса ConverterCreator предоставляет реализацию метода createConverter()
public class FahrenheitConverterCreator extends ConverterCreator {
    @Override
    public IConverter createConverter() {
        return new FahrenheitConverter();
    }
}
