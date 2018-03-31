package by.bntu.fitr.povt.sailer.model.entity;

public class Carriage {
    private double length;
    private int weight;
    private boolean wear = false;
    private int percentChangeLength = 5;

    public Carriage(double length, int weight, boolean wear) {
        this.length = length;
        if (wear == true){
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
    public String toString() {
        return "Carriage{" +
                "length=" + length +
                ", weight=" + weight +
                ", wear=" + wear +
                '}';
    }
}
