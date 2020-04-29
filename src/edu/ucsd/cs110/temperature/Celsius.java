package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature{
    public Celsius(float t)
    {
        super(t);
    }
    public String toString()
    {
        return getValue() + " C";
    }

    @Override
    public Temperature toCelsius() {
        return (new Celsius(getValue()));
    }

    @Override
    public Temperature toFahrenheit() {
        return (new Fahrenheit(((getValue()*9)/5) + 32));
    }
}
