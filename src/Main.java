import animals.*;


public class Main {
    public static void main(String[] args) {
        Herbal gazelle = new Herbal("Gazelle",5,"Stepi", "grass",60);
        gazelle.informations();
        gazelle.go();
        gazelle.eat();
        gazelle.sleep();
        Herbal giraffe = new Herbal("Giraffe",11,"Stepi", "leaves",20);
        giraffe.informations();
        giraffe.go();
        giraffe.eat();
        giraffe.sleep();
        Herbal horse = new Herbal("Horse",11,"field", "seno",100);
        horse.informations();
        horse.go();
        horse.eat();
        horse.sleep();
        Predators hyena = new Predators("hyena", 14, "Stepi", "meat",40);
        hyena.informations();
        giraffe.go();
        hyena.eat();
        hyena.sleep();
        Predators tiger = new Predators("Tiger", 19, "Stepi", "meat",60);
        tiger.informations();
        tiger.go();
        tiger.eat();
        tiger.sleep();
        Predators bear = new Predators("Bear", 19, "Stepi", "fish",50);
        bear.informations();
        bear.go();
        bear.eat();
        bear.sleep();
        Flying lastochka = new Flying("Lastochka", 1, "forest", "flying");
        lastochka.informations();
        lastochka.go();
        lastochka.eat();
        lastochka.sleep();
        Flying albatross = new Flying("albatross", 1, "forest", "flying");
        albatross.informations();
        albatross.go();
        albatross.eat();
        albatross.sleep();
        Flying sokol = new Flying("sokol", 1, "forest", "flying");
        sokol.informations();
        sokol.go();
        sokol.eat();
        sokol.sleep();
        Flightless penguin = new Flightless("Penguin", 2, "Antarctica", "walk");
        penguin.informations();
        penguin.go();
        penguin.eat();
        penguin.sleep();
        Flightless peacock = new Flightless("peacock", 4, "Stepi", "walk");
        peacock.informations();
        peacock.go();
        peacock.eat();
        peacock.sleep();
        Flightless dodo = new Flightless("Do-do", 4, "Stepi", "walk");
        dodo.informations();
        dodo.go();
        dodo.eat();
        dodo.sleep();
        Amphibians frog = new Amphibians("Frog", 12, "swamp");
        frog.informations();
        frog.go();
        frog.eat();
        frog.sleep();
        Amphibians natrix = new Amphibians("natrix", 21, "ocean");
        natrix.informations();
        natrix.go();
        natrix.eat();
        natrix.sleep();

        if (gazelle.equals(giraffe) && gazelle.equals(horse) && horse.equals(giraffe)) {
            System.out.println("Два одинаковых животных");
        }
        if (hyena.equals(tiger) && hyena.equals(bear) && tiger.equals(bear)) {
            System.out.println("Два одинаковых животных");
        }
        if (lastochka.equals(sokol) && sokol.equals(albatross) && lastochka.equals(albatross)) {
            System.out.println("Два одинаковых животных");
        }
        if (peacock.equals(penguin) && peacock.equals(dodo) && penguin.equals(dodo)) {
            System.out.println("Два одинаковых животных");
        }
        if (frog.equals(natrix)) {
            System.out.println("Два одинаковых животных");
        }







    }
}
