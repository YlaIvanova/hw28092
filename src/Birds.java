import java.util.Objects;

public class Birds extends Animals {

    private String livingEnvironment;

    public Birds(String name, String livingEnvironment) {
        super(name);
        this.livingEnvironment = livingEnvironment;
    }

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public void eat() {
        System.out.println(" Я заглатывают пищу целиком !");
    }

    @Override
    public void sleep() {
        System.out.println(" Я сплю на дереве !");
    }

    @Override
    public void moveAround() {
        System.out.println(" Я перемещаюсь при полете !");
    }

    private void hunt() {


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

    @Override
    public String toString() {
        return "Birds{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
