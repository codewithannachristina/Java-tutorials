// Parent class
class Animal {
   public void makeSound() {
      System.out.println("Animal is making a sound");
   }
}

// Child class 1 inheriting from Animal class
class Dog extends Animal {
   public void makeSound() {
      System.out.println("Dog is barking");
   }
}

// Child class 2 inheriting from Animal class
class Cat extends Animal {
   public void makeSound() {
      System.out.println("Cat is meowing");
   }
}

public class Main {
   public static void main(String[] args) {
      Animal myAnimal1 = new Dog();
      Animal myAnimal2 = new Cat();
      myAnimal1.makeSound(); // calls Dog's makeSound() method
      myAnimal2.makeSound(); // calls Cat's makeSound() method
   }
}
