package animals;

public class Herbal extends Mammals{
    private String typeFood;

    public Herbal(String name, int age, String livingPlace, String typeFood, int speed) {
        super(name, age, livingPlace,speed);
        if (typeFood != null && !typeFood.isEmpty() && !typeFood.isBlank()) {
            this.typeFood = typeFood;
        } else {
            this.typeFood = "Не указано";
        }

    }
    public void informations() {
        System.out.println("Животное " + name + ", возраст - " + age + " лет, живет в " + livingPlace + ", скорость - " + speed +  ", питается " + typeFood +  " и принадлежит классу " + getClass() );    }


    public void go() {
        System.out.println("пасётся");
    }
    public void eat(){
        System.out.println("ест траву");
    }
    public void sleep() {
        System.out.println("спит в укрытиях");
    }

    public String getTypeFood() {
        return typeFood;
    }





}
