package Students;

import Animals.Cat;
import Animals.Dog;
import Animals.Fish;
import Animals.Parrot;

public class Main {
    public static void main(String[] args) {
        animals();
        student();
    }
    public static  void animals(){

        Dog sharic = new Dog();
        sharic.setNameAnimal("Sharic");
        sharic.setBreedAnimal("Pirbul");
        sharic.setAgeAnimal("3 year");
        sharic.setColorAnimal("Gray");
        sharic.aboutDog();
        System.out.println();

        System.out.println("Parrot");
        Parrot gosha = new Parrot();
        gosha.setNameAnimal("Gosha");
        gosha.setAgeAnimal("2 year");
        gosha.setBreedAnimal("jako");
        gosha.setColorAnimal("Red");
        gosha.setLifeInHomeOrWild("a pet");
        gosha.aboutParrot();
        System.out.println();

        System.out.println("Cat");
        Cat murka = new Cat();
        murka.setNameAnimal("Murka");
        murka.setAgeAnimal("5 year");
        murka.setBreedAnimal("Egipt");
        murka.setColorAnimal("bold");
        murka.aboutCat();
        System.out.println();

        System.out.println("Fish");

        Fish nemo = new Fish();
        nemo.setNameAnimal("Nemo");
        nemo.setAgeAnimal("2 month");
        nemo.setBreedAnimal("Pike");
        nemo.setLifeInOceanOrSea("Sea");
        nemo.aboutFish();
        System.out.println("--------------------------------------------");
    }
    public static void student(){
        int ID = 1;
        Course course = new Course();
        course.setData("01.02.22");
        course.setNameOfTeacher("Mederbek Abdyldaev");
        course.setID(ID);
        course.idNumStudents();

        System.out.println();
        System.out.println("Student N°" + ID++);
        Student[] students = new Student[3];
        students[0] = new Student();
        students[0].setFirstNameAndLastName("Idinkulov Nurlan");
        students[0].setAge(38);
        students[0].setGender("Man");
        students[0].setDateOfBirth("28.01.84");
        aboutStudent(students[0].getFirstNameAndLastName(),students[0].getAge(),students[0].getGender(),students[0].getDateOfBirth());
        System.out.println();
        System.out.println("Student N°" + ID++);
        students[1] = new Student();
        students[1].setFirstNameAndLastName("Nazira Suynalieva");
        students[1].setAge(25);
        students[1].setGender("Woman");
        students[1].setDateOfBirth("22.01.97");
        aboutStudent(students[1].getFirstNameAndLastName(),students[1].getAge(),students[1].getGender(),students[1].getDateOfBirth());
        System.out.println();
        System.out.println("Student N°" + ID++);
        students[2] = new Student();
        students[2].setFirstNameAndLastName("Emir Adamov");
        students[2].setAge(28);
        students[2].setGender("Man");
        students[2].setDateOfBirth("28.08.93");
        aboutStudent(students[2].getFirstNameAndLastName(),students[2].getAge(),students[2].getGender(),students[2].getDateOfBirth());
        System.out.println();
        Group group4 = new Group();
        group4.setStudent(students);
        group4.setCourse(3);
        group4.setDataOfBegin("01.02.22");
        group4.setFinish("31.12.22");
        System.out.println("Course-> " + group4.getCourse() + "\nDate of begin->" + group4.getDataOfBegin() + "\nDate of finish->" + group4.getFinish());
    }
    public static void aboutStudent(String firstNameAndLastName,int age,String gender,String dateOfBirth){
        System.out.println("Name-> " + firstNameAndLastName + "\nAge-> " + age + "\nGender-> " + gender + "\nData of birth->" + dateOfBirth);
    }
}
