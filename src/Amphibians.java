import java.util.Objects;

public class Amphibians extends Animals {

    private String livingEnvironment;

    public Amphibians(String name, String livingEnvironment) {
        super(name);
        this.livingEnvironment = livingEnvironment;
    }

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }
    @Override
    public void eat() {
        System.out.println(" Я питаюсь насекомыми !");
    }
    @Override
    public void sleep () {
        System.out.println(" Я не шевелюсь во сне !");
    }
    @Override
    public void moveAround () {
        System.out.println(" Я перемещаюсь при помощи конечностей !");
    }
    private void hunt(){


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
        return "Amphibians{" +
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
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
