abstract class Animal {
}

interface Run {
    void run();
}

interface Speak {
    void speak();
}

class Dog extends Animal implements Run, Speak {
    public void run() {
        System.out.println("Dog run");
    }

    public void speak() {
        System.out.println("Woof");
    }
}

class Cat extends Animal implements Run, Speak {
    public void run() {
        System.out.println("Cat run");
    }

    public void speak() {
        System.out.println("Meow");
    }
}

class Shark extends Animal {
}

class HomeAnimal<T extends Animal & Run & Speak> {
    private T animal;

    public HomeAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void returnTypeReferences() {
        System.out.println(animal.getClass().getName());
    }
}

