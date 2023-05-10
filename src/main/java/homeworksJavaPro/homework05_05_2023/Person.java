package homeworksJavaPro.homework05_05_2023;

public class Person {

    private String lastName;
    private String name;
    private Position post;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Person(String lastName, String name, Position post, String email, String phone, int salary, int age) {
        this.lastName = lastName;
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
