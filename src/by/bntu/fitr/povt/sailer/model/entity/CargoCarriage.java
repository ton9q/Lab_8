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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CargoCarriage that = (CargoCarriage) o;

        if (volume != that.volume) return false;
        return capacity == that.capacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + volume;
        result = 31 * result + capacity;
        return result;
    }

    @Override
    public String toString() {
        return "CargoCarriage{" +
                "volume=" + volume +
                ", capacity=" + capacity +
                "} " + super.toString();
    }
}
