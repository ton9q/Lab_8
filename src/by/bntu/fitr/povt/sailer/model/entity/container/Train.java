package by.bntu.fitr.povt.sailer.model.entity.container;

import by.bntu.fitr.povt.sailer.model.entity.Carriage;

public class Train {
    private static final int DEFAULT_SIZE = 3;
    private Carriage[] carriages;
    private int size;

    public Train() {
        carriages = new Carriage[DEFAULT_SIZE];
    }

    public Train(int size) {
        carriages = new Carriage[size];
        this.size = size;
    }

    public Carriage getCarriage(int index) {
        return carriages[index];
    }

    public Carriage[] getTrain() {
        return this.carriages;
    }

    public void setCarriage(Carriage carriage, int index) {
        this.carriages[index] = carriage;
    }

    public int getSize() {
        for (int i = 0; i < size; i++) {
            if (carriages[i] == null) {
                return i;
            }
        }

        return size;
    }

    public boolean addCarriage(Carriage carriage) {
        int number = getSize();
        if (number < size) {
            carriages[number++] = carriage;
            return true;
        }
        return false;
    }

    public void deleteCarriage(int number) {
        int i = number - 1;
        for (; i < size - 1; i++) {
            carriages[i] = carriages[i + 1];
            carriages[i + 1] = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of products:\n");

        for (Carriage carriage : carriages) {
            if (carriage != null) {
                builder.append(carriage).append("\n");
            } else {
                break;
            }
        }

        return builder + "";
    }
}