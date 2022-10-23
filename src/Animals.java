import java.time.LocalDate;
import java.util.Objects;

public abstract class Animals {

    public String name;

    public int birthYear;

    public Animals(String name) {
        this(name,0);
    }

    public Animals(String name, int age) {
        setName(name);

        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
    }
    public abstract void eat() ;

    public abstract void sleep () ;

    public abstract void moveAround () ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Animals";
        }
    }
        public int getAge () {
            return LocalDate.now().getYear() - birthYear;
        }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return birthYear == animals.birthYear && name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }
}


