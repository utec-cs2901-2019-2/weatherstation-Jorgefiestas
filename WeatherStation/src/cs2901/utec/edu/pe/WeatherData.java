package weather;

import java.util.*;

public class WeatherData implements Subject {

	double temperature;
	double humidity;
	double pressure;

	List<Observer> observers = new ArrayList();

	public void registerObserver(Observer obs){
		observers.add(observer);
		
	}

	public void removeObserver() {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void getTemperature() {
		return temperature;
	}

	public void getHumidity() {
		return humidity;
	}

	public void getPressure() {
		return pressure;
	}

	public void measurmentsChanged(double t, double h, double p) {
		temperature = t;
		humidity = h;
		pressure = p;
		notifyObservers();
	}

	public void start() {
		while(true) {
			double r1 = Math.random();
			double r2 = Math.random();
			double r3 = Math.random();

			measurmentsChanged(r1, r2, r3);
			
			try {
				Thread.sleep(3 * 1000);
			}
			catch (Exception e) {
				Thread.currentThread().interrupt();
			}
		}
	}
}

