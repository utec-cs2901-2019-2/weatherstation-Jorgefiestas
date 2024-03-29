package cs2901.utec.edu.pe;

public class CurrentCoditions implements Observer, DisplayElement {

	double temperature;
	double humidity;
	double pressure;

	@Override
	void update(double t, double h, double p) {
		temperature = t;
		humidity = h;
		pressure = p;

		display();
	}

	@Override
	void display() {
		System.out.println(temperature);
		System.out.println(humidity);
		System.out.println(pressure);
	}

}
