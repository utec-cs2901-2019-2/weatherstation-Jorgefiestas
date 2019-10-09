package cs2901.utec.edu.pe;

public class StaticDisplay implements Observer, DisplayElement {

	double minTemp, avgTemp, maxTemp;
	double minHum, avgHum, maxHum;
	double minPres, avgPres, maxPres;
	double n = 0;

	@Override
	public void update(double t, double h, double p){
		if(minTemp > t){
			minTemp = t;
		}
		if(maxTemp < t){
			maxTemp = t;
		}
		avgTemp = (avgTemp * n + t)/(n + 1.0);
		
		if(minHum > h){
			minHum = h;
		}
		if(maxHum < h){
			maxHum = h;
		}
		avgHum = (avgHum * n + h)/(n + 1.0);

		if(minPres > p){
			minPres = p;
		}
		if(maxPres < p){
			maxPres = p;
		}
		avgPres = (avgPres * n + p)/(n + 1.0);

		n += 1;

		display();
	}

	@Override
	public void display(){
		System.out.println("Temperature:");
		System.out.println("Min: " + minTemp + "\tAvg: " + avgTemp + "\tMax: " + maxTemp);

		System.out.println("Humidity:");
		System.out.println("Min: " + minHum + "\tAvg: " + avgHum + "\tMax: " + maxHum);

		System.out.println("Pressure:");
		System.out.println("Min: " + minPres + "\tAvg: " + avgPres + "\tMax: " + maxPres);
	}
}

