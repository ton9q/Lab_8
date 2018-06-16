package by.bntu.fitr.povt.sailer.model.entity;

public class PassengerCarriage extends Carriage {
    public enum TypePassengerCarriage {

    }
    public int numberPass;

    public PassengerCarriage(double length, int weight, int numberPass, boolean wear) {
        super(length,weight,wear);
        this.numberPass = numberPass;
    }

    public int getNumberPass() {
        return numberPass;
    }

    public void setNumberPass(int numberPass) {
        this.numberPass = numberPass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassengerCarriage that = (PassengerCarriage) o;

        return numberPass == that.numberPass;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberPass;
        return result;
    }

    @Override
    public String toString() {
        return "PassengerCarriage{" +
                "numberPass=" + numberPass +
                "} " + super.toString();
    }
}
