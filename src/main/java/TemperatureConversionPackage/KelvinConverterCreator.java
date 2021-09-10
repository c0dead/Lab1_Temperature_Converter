package TemperatureConversionPackage;

// подкласс KelvinConverterCreator абстрактного класса ConverterCreator предоставляет реализацию метода createConverter()
public class KelvinConverterCreator extends ConverterCreator {
    @Override
    public IConverter createConverter() {
        return new KelvinConverter();
    }
}
