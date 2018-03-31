package by.bntu.fitr.povt.sailer.model.entity;

public class CargoCarriage extends Carriage {

    private int volume;
    private int capacity;

    public CargoCarriage(double length, int weight, int volume, int capacity, boolean wear) {
        super(length,weight,wear);
        this.volume = volume;
        this.capacity = capacity;
    }

    public int getVolume() {
        return volume;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "CargoCarriage{" +
                "volume=" + volume +
                ", capacity=" + capacity +
                "} " + super.toString();
    }
}
