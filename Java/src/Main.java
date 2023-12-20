class Main {
    public static void main(String[] args) {
        HomeAnimal<Dog> myDog = new HomeAnimal<>(new Dog());
        myDog.getAnimal().run();
        myDog.getAnimal().speak();
        myDog.returnTypeReferences();

        HomeAnimal<Cat> myCat = new HomeAnimal<>(new Cat());
        myCat.getAnimal().run();
        myCat.getAnimal().speak();
        myCat.returnTypeReferences();
    }
}
