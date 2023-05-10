package homeworksJavaPro.homework05_05_2023;


public class Homework1 {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Parkhomchyk", "Yauheni",Position.HEAD_OF_DEPARTMENT, "netynikov@gmail.com", "375292057763", 1500, 35);
        persArray[1] = new Person("Krachko", "Natallia", Position.ENGINEER, "natali@gmail.com", "48295284656", 5100, 45);
        persArray[2] = new Person("Ivanov", "Ivan", Position.TRAINEE, "ivanov@mail.com", "79235640646", 3500, 52);
        persArray[3] = new Person("Caruk", "Ilya", Position.ASSISTENT, "carukilya@gmail.com", "375336718490", 700, 33);
        persArray[4] = new Person("Volodina", "Olga", Position.ENGINEER, "volodinaolga@gmail.com", "375332536691", 100, 27);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i]);
            }
        }

    }

}
