package by.bntu.fitr.povt.sailer.model.entity;

public class Carriage {
    private double length;
    private int weight;
    private boolean wear = false;

    public Carriage(double length, int weight, boolean wear) {
        int percentChangeLength = 5;

        this.length = length;
        if (wear){
            this.length =  length*(100-percentChangeLength)/100;
        }
        this.weight = weight;
        this.wear = wear;
    }

    public double getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isWear() {
        return wear;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setWear(boolean wear) {
        this.wear = wear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carriage carriage = (Carriage) o;

        if (Double.compare(carriage.length, length) != 0) return false;
        if (weight != carriage.weight) return false;
        return wear == carriage.wear;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + weight;
        result = 31 * result + (wear ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "length=" + length +
                ", weight=" + weight +
                ", wear=" + wear +
                '}';
    }
}
