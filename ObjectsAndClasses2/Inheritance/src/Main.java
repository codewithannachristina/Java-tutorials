// Parent class
class Animal {
   public void eat() {
      System.out.println("Animal is eating");
   }
}

// Child class inheriting from Animal class
class Dog extends Animal {
   public void bark() {
      System.out.println("Dog is barking");
   }
}

public class Main {
   public static void main(String[] args) {
      Dog myDog = new Dog();
      myDog.eat(); // inherited from Animal class
      myDog.bark(); // unique method of Dog class
   }
}
