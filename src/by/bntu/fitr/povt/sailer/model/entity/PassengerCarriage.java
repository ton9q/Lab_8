package by.bntu.fitr.povt.sailer.model.entity;

public class PassengerCarriage extends Carriage {

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
    public String toString() {
        return "PassengerCarriage{" +
                "numberPass=" + numberPass +
                "} " + super.toString();
    }
}
