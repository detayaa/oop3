package animals;

public class Predators extends Mammals {
    private String typeFood;


   public Predators(String name, int age, String livingPlace, String typeFood, int speed) {
       super(name, age,livingPlace, speed);
       if (typeFood != null && !typeFood.isBlank() && !typeFood.isEmpty()) {
           this.typeFood = typeFood;
       } else {
           System.out.println("Не указано");
       }
   }

    public void informations() {
        System.out.println("Животное " + name + ", возраст - " + age + " лет, живет в " + livingPlace + ", скорость - " + speed +  ", питается " + typeFood +  " и принадлежит классу " + getClass() );
    }


    public void go() {
            System.out.println("охотится");
        }
    public void eat(){
        System.out.println("ест мясо");
    }
    public void sleep() {
        System.out.println("спит в укрытиях");
    }

        public String getTypeFood () {
            return typeFood;
        }
    }

