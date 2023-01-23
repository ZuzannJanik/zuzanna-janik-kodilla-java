package com.kodilla.testing.weather.stub;
import org.testng.IResultMap;

import java.util.*;
public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double sum = 0.0;
        double averageTemperature;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum = sum + (temperature.getValue());
        }
        return averageTemperature = sum / calculateForecast().size();
    }

    public double medianTemperature() {
        double median;
        double aver;
        List<Double> medianList = new ArrayList<>(temperatures.getTemperatures().values()); //Zmiana wartości w listę
        medianList.sort(Comparator.naturalOrder()); //posortowanie

            if (medianList.size() % 2 == 0) {
                return medianList.get(medianList.size()/2) + medianList.get((medianList.size() / 2) - 1);
            } else {
                return medianList.get(medianList.size() / 2);
            }
        }
    }
