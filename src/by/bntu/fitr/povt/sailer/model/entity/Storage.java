package by.bntu.fitr.povt.sailer.model.entity;

import by.bntu.fitr.povt.sailer.model.entity.container.Train;

import java.util.LinkedList;

public class Storage<T extends Train> {
    private final int DEFAULT_NUM_PLACES = 100;
    private int numberPlaces;
    private LinkedList<T> entityes = new LinkedList<>();

    public Storage() {
        numberPlaces = DEFAULT_NUM_PLACES;
    }

    public Storage(int numberPlaces) {
        this.numberPlaces = numberPlaces;
    }

    public int getNumberPlaces() {
        return numberPlaces;
    }

    public void setNumberPlaces(int numberPlaces) {
        this.numberPlaces = numberPlaces;
    }

    public LinkedList<T> getEntityes() {
        return entityes;
    }

    public void addEntity(T entity) {
        int freePlaces = numberPlaces;

        if (!entityes.isEmpty()) {
            for (T e : entityes) {
                freePlaces -= e.getSize();
            }

        }
        if (entity.getSize() < freePlaces) {
            entityes.add(entity);
        }
    }

    public void deleteEntity(T entity) {
        entityes.remove(entity);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "\nnumberPlaces=" + numberPlaces +
                ", \nentityes=\n" + entityes +
                '}';
    }

}
