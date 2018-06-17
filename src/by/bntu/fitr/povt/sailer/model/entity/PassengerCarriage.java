package by.bntu.fitr.povt.sailer.model.entity;

public class PassengerCarriage extends Carriage {
    public enum TypePassengerCarriage {
        COMMON(81), SLEEPING(18), REVERSED_SEAT(54), COMPARTMENT(36), SITTING(62);

        private final int maxNumberPass;

        TypePassengerCarriage(int maxNumberPass) {
            this.maxNumberPass = maxNumberPass;
        }

        public int getMaxNumberPass() {
            return maxNumberPass;
        }
    }

    private String typeCarriage;
    private int numberPass;

    public PassengerCarriage(double length, int weight, boolean wear) {
        super(length, weight, wear);
        this.typeCarriage = TypePassengerCarriage.COMMON.name();
        this.numberPass = TypePassengerCarriage.valueOf(typeCarriage).getMaxNumberPass();
    }

    public PassengerCarriage(double length, int weight, boolean wear, String typeCarriage) {
        super(length, weight, wear);
        this.typeCarriage = typeCarriage;

        try {
            this.numberPass = TypePassengerCarriage.valueOf(typeCarriage).getMaxNumberPass();
        } catch (IllegalArgumentException e){
            this.numberPass = TypePassengerCarriage.COMMON.getMaxNumberPass();
        }
    }

    public int getNumberPass() {
        return numberPass;
    }

    public String getTypeCarriage() {
        return typeCarriage;
    }

    public void setNumberPass(int numberPass) {
        this.numberPass = numberPass;
    }

    public void setTypeCarriage(String typeCarriage) {
        this.typeCarriage = typeCarriage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassengerCarriage that = (PassengerCarriage) o;

        if (numberPass != that.numberPass) return false;
        return typeCarriage != null ? typeCarriage.equals(that.typeCarriage) : that.typeCarriage == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (typeCarriage != null ? typeCarriage.hashCode() : 0);
        result = 31 * result + numberPass;
        return result;
    }

    @Override
    public String toString() {
        return "PassengerCarriage{" +
                "typeCarriage='" + typeCarriage + '\'' +
                ", numberPass=" + numberPass +
                '}' + super.toString();
    }
}
