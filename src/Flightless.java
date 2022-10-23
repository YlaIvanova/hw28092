import java.util.Objects;

public final class Flightless extends Birds {

    public String typeOfMovement;

    public Flightless(String name, String livingEnvironment, String typeOfMovement) {
        super(name, livingEnvironment);
        this.typeOfMovement = typeOfMovement;
    }

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = typeOfMovement;
    }

    public void walk() {

    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement == null) {
            this.typeOfMovement = " Информация не указана ";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    @Override
    public String toString() {
        return "Flightless{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }
}
