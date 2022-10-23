import java.util.Objects;

public class Mammals extends Animals {

    private String livingEnvironment;

    private int movementSpeed;

    public Mammals(String name, String livingEnvironment, int movementSpeed) {
        super(name);
        this.livingEnvironment = livingEnvironment;
        this.movementSpeed = movementSpeed;
    }

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.movementSpeed = movementSpeed;
    }

    public Mammals(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(" Я жую пищу !");
    }

    @Override
    public void sleep() {
        System.out.println(" Я сплю лежа !");
    }

    @Override
    public void moveAround() {
        System.out.println(" Я перемещаюсь по-разному !");
    }

    public void walk() {

    }


    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null) {
            this.livingEnvironment = " Информация не указана ";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed <= 0) {
            this.movementSpeed = 0;
        } else {
            this.movementSpeed = movementSpeed;
        }
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", movementSpeed=" + movementSpeed +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return movementSpeed == mammals.movementSpeed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }
}

