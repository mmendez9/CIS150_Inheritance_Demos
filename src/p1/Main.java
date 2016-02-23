package p1;

public class Main {
    public static void main(String[] args) {
        Pet dog1 = new Dog();
        dog1.name = "Rover";
        dog1.breed = "boxer";
        dog1.weight = 20;
        dog1.age = 1;


        Pet cat1 = new Cat();
        cat1.name = "Kitty";
        cat1.breed = "tuna";
        cat1.weight = 10;
        cat1.age = 1;

        Pet bird1 = new Bird();
        bird1.name = "Tweety";
        bird1.breed = "parrot";
        bird1.weight = .25;
        bird1.age = 10;

        if (bird1 instanceof Bird)
            bird1.learnToTalk(bird1);
        else
            System.out.println("Sorry, only birds can learn to talk");

        System.out.println(dog1 + "\n\n" + bird1);
    }
}

abstract class Pet {
    String name;
    String breed;
    double weight;
    int age;

    void learnToTalk(Pet arg) {
        Bird bird = (Bird) arg;
        bird.doesTalk = true;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}

class Dog extends Pet {
    String vocalize = "bark";
    int legs = 4;
    Boolean houseTrained = false;

    @Override
    public String toString() {
        String s1 = super.toString();
        String s2 = "Dog{" +
                "vocalize= '" + vocalize + '\'' +
                ", legs= " + legs +
                ", houseTrained= " + houseTrained +
                '}';
        return s1 + "\n" + s2;
    }
}

class Cat extends Pet {
    String vocalize = "meow";
    int legs;
    Boolean houseTrained = false;

    @Override
    public String toString() {
        String s1 = super.toString();
        String s2 = "Cat{" +
                "vocalize='" + vocalize + '\'' +
                ", legs=" + legs +
                ", houseTrained=" + houseTrained +
                '}';

        return s1 + "\n" + s2;
    }
}

class Bird extends Pet {
    String vocalize = "tweet";
    int legs = 2;
    Boolean doesTalk = false;

    @Override
    public String toString() {
        String s1 = super.toString();
        String s2 = "Bird{" +
                "vocalize='" + vocalize + '\'' +
                ", legs=" + legs +
                ", doesTalk=" + doesTalk +
                '}';

        return s1 + "\n" + s2;
    }
}