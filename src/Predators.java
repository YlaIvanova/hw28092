import java.util.Objects;

public final class Predators extends Mammals {

    public String typeOfFood;

    public Predators(String name, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    public Predators(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    public Predators(String name, String typeOfFood) {
        super(name);
        this.typeOfFood = typeOfFood;
    }

    public void hunt(){

    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null) {
            this.typeOfFood = " Информация не указана ";
        }else {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public String toString() {
        return "Predators{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
