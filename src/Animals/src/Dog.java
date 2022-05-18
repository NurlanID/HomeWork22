package Animals;
public class Dog {
    private String age;
    private String name;
    private String breed;
    private String color;
    int lifeExpectancy;
    public void setAgeAnimal(String inputAge) {
        age = inputAge;
    }
    public int getLifeExpectancy() {
        return lifeExpectancy;
    }
    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
    public void setNameAnimal(String inputName) {
        name = inputName;
    }
    public void setBreedAnimal(String inputBreed) {
        breed = inputBreed;
    }
    public void setColorAnimal(String inputColor) {
        color = inputColor;
    }
    public void aboutDog() {
        System.out.println("Name -> " + name + "\nBreed of dog -> " + breed + "\nAge of dog-> " +
                age + "\nColor of dog-> " + color);
        if (lifeExpectancy < 0) {
            System.out.println("Введите положителное значение возраста");
        } else if (lifeExpectancy > 0) {
            System.out.println(lifeExpectancy + " лет/год");
        }
        System.out.println("");
    }
}
