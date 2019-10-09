package cs2901.utec.edu.pe;

public interface Subject {
    void registerObserver(Observer);
	void removeObserver(Observer);
	void notifyObserver(Observer);
}
