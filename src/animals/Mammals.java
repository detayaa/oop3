package animals;

public class Mammals extends Animals{
    protected String livingPlace;
    protected int speed;

    public Mammals(String name, int age, String livingPlace, int speed) {
        super(name, age);
        if (livingPlace != null && !livingPlace.isEmpty() && !livingPlace.isBlank()) {
            this.livingPlace = livingPlace;
        } else {
            this.livingPlace = "Не указано";
        }
        if (speed != 0) {
            this.speed = speed;
        } else {
            this.speed = 50;
        }


    }









    public String getLivingPlace() {
        return livingPlace;
    }

    public int getSpeed() {
        return speed;
    }
}
