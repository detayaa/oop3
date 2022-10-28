package animals;

public class Amphibians extends Animals {
    private String livingPlace;

    public Amphibians(String name, int age, String livingPlace) {
        super(name, age);
        if (livingPlace != null && !livingPlace.isEmpty() && !livingPlace.isBlank()) {
            this.livingPlace = livingPlace;
        } else {
            this.livingPlace = "Указано неккоректно";
        }
    }




    public void informations() {
        System.out.println("Животное " + name + ", возраст - " + age + " лет, живет в " + livingPlace + " и принадлежит классу " + getClass());
    }

    public void go() {
        System.out.println("охотится");
    }

    public void eat() {
        System.out.println("ест мясо");
    }

    public void sleep() {
        System.out.println("спит в норах");
    }

    public String getLivingPlace() {
        return livingPlace;
    }
}
