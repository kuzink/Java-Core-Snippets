package compare;

public class PersonComparable implements Comparable<PersonComparable> {

    private int age;
    private String name;

    public PersonComparable(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(PersonComparable o) {
        return this.age - o.age;
    }
}
