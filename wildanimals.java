
class Animal {
    public void eat() {
        System.out.println("All animals eat");
    }

    public void sound() {
        System.out.println("All animals make some specific sound");
    }
}


class Lion extends Animal {
   
    public void eat() {
        System.out.println("Lion eats zebra");
    }

    
    public void sound() {
        System.out.println("Lion roars");
    }
}


class Tiger extends Animal {
    
    public void eat() {
        System.out.println("Tiger eats deer");
    }

   
    public void sound() {
        System.out.println("Tiger moans");
    }
}


class Panther extends Animal {
  
    public void eat() {
        System.out.println("Panther eats raccoon");
    }

   
    public void sound() {
        System.out.println("Panther growls");
    }
}


public class wildanimals {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();

       
        System.out.println("Lion:");
        lion.eat();
        lion.sound();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();

        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}

