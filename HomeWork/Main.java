package HomeWork;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Student student = new Student("Ivan", "Ivanov", "pks121", 3.1);
        Aspirant aspirant = new Aspirant("Ivan", "Stepanovich", "pi122", 5, "toilet");
        Student[] students = {student, aspirant};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getScholarship());
        }

        // Задание 2

        Veterinar veterinar = new Veterinar();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Bob", "meat", "Vladimir");
        animals[1] = new Cat("Marley", "fish", "Moscow");
        animals[2] = new Horse("Best", "hay", "Suzdal");

        for (Animal animal : animals) {
            Veterinar.treatAnimal(animal);
        }

    }
}

