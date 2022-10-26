package animals;

public class Flightless extends Birds {
    private String movementType;

    public Flightless(String name, int age, String livingPlace, String movementType ) {
        super(name, age, livingPlace);
        if (movementType != null && !movementType.isEmpty() && !movementType.isBlank()) {
            this.movementType = movementType;
        } else {
            this.movementType = "Не указано";
        }
    }
    public void informations() {
        System.out.println("Животное " + name + ", возраст - " + age + " лет, живет в " + livingPlace + ", передвигается  " + movementType +  " и принадлежит классу " + getClass() );
    }

    public void go() {
        System.out.println("ходит");
    }
    public void eat(){
        System.out.println("ест мясо");
    }
    public void sleep() {
        System.out.println("спит в укрытии");
    }

    public String getMovementType() {
        return movementType;
    }
}
