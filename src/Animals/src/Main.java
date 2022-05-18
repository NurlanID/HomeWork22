package Animals;

import Animals.Cat;
import Animals.Dog;
import Animals.Fish;
import Animals.Parrot;

public class Main {
    public static void main(String[] args) {
        animals();
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
}
