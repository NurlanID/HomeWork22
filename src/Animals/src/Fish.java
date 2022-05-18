package Animals;
public class Fish {
    private String ageFish;
    private String nameFish;
    private String breedFish;
    private String colorFish;
    private String lifeInOceanOrSea;
    int lifeExpectancy;
    public void setAgeAnimal(String inputAge) {
        ageFish = inputAge;
    }
    public int getLifeExpectancy() {
        return lifeExpectancy;
    }
    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
    public void setNameAnimal(String inputName) {
        nameFish = inputName;
    }
    public void setBreedAnimal(String inputBreed) {
        breedFish = inputBreed;
    }
    public void setColorAnimal(String inputColor) {
        colorFish = inputColor;
    }
    public void setLifeInOceanOrSea(String inputLifeInOceanOrSea) {
        lifeInOceanOrSea = inputLifeInOceanOrSea;
    }
    public void aboutFish() {
        System.out.println("Name -> " + nameFish + "\nBreed of dog -> " + breedFish + "\nAge of dog-> " +
                ageFish + "\nColor of dog-> " + colorFish + "\nLife in ocean or sea-> " + lifeInOceanOrSea);
        if (lifeExpectancy < 0) {
            System.out.println("Введите положителное значение возраста");
        } else if (lifeExpectancy > 0) {
            System.out.println(lifeExpectancy + " лет/год");
        }
        System.out.println("");
    }
}