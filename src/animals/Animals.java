package animals;

public class Animals {
    protected String name;
    protected int age;


    public Animals(String name, int age) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Не указано";
        }
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 1;
        }
    }

    public void animals() {
        System.out.println("Животное - " + name + ", возраст - " + age);

    }



    public void eat() {
        System.out.println("Кушает");
    }

    public void sleep() {
        System.out.println("Спит");
    }

    public void go() {
        System.out.println("Передвигается");
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
