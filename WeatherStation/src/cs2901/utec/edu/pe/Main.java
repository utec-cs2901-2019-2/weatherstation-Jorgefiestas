package cs2901.utec.edu.pe;

public class Main {

    public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditions cc = new CurrentConditions();
		CurrentConditions sd = new StaticDisplay();

		weatherData.addObserver(cc);
		weatherData.addObserver(sd);

		weatherData.start();
    }
}
