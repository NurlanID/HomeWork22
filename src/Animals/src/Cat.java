package Animals;
public class Cat {
    private String ageCat;
    private String nameCat;
    private String breedCat;
    private String colorCat;
    int lifeExpectancy;
    public void setAgeAnimal(String inputAge) {
        ageCat = inputAge;
    }
    public int getLifeExpectancy() {
        return lifeExpectancy;
    }
    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
    public void setNameAnimal(String inputName) {nameCat = inputName;}
    public void setBreedAnimal(String inputBreed) {
        breedCat = inputBreed;
    }
    public void setColorAnimal(String inputColor) {
        colorCat = inputColor;
    }
    public void aboutCat() {
        System.out.println("Name -> " + nameCat + "\nBreed of dog -> " + breedCat + "\nAge of dog-> " +
                ageCat + "\nColor of dog-> " + colorCat);
        if (lifeExpectancy < 0) {
            System.out.println("Введите положителное значение возраста");
        } else if (lifeExpectancy > 0) {
            System.out.println(lifeExpectancy + " лет/год");
        }
        System.out.println("");
    }
}
