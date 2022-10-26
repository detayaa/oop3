package animals;
public class Birds extends Animals{
    protected String livingPlace;

    public Birds(String name, int age, String livingPlace) {
        super(name,age);

        if (livingPlace != null && !livingPlace.isEmpty() && !livingPlace.isBlank()) {
                this.livingPlace = livingPlace;
        } else {
            this.livingPlace = "Не указано";
        }
    }

    public void hunt() {
        System.out.println("охотится");
    }

    public String getLivingPlace() {
        return livingPlace;
    }
}
