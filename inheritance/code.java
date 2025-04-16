interface Printable {
    void sound();
}

interface Movable {
    void move();
}

interface Eating {
    void eat();
}


abstract class Animal implements Printable, Movable, Eating {

    abstract void displayInfo();
    
    // Common method for all animals
    public void breathe() {
        System.out.println("Breathing...");
    }
}

// Cat extends the abstract class and implements all required methods
class Cat extends Animal {
    public void sound() {
        System.out.println("Meow Meow");
    }

    public void move() {
        System.out.println("The cat jumps gracefully.");
    }

    public void eat() {
        System.out.println("Uwi Uwi Umw Uwa Uwa");
    }
    
    public void displayInfo() {
        System.out.println("This is a Cat.");
    }
}


class Bike implements Printable, Movable {
    public void sound() {
        System.out.println("Vroom Vrooom");
    }

    public void move() {
        System.out.println("The bike speeds on the road.");
    }
}

class code {
    public static void main(String[] args) {
        Printable p1 = new Cat();
        Printable p2 = new Bike();
        
        p1.sound();
        p2.sound();

        Movable m1 = new Cat();
        Movable m2 = new Bike();
        
        m1.move();
        m2.move();

        Eating e1 = new Cat();
        e1.eat();

        // Using Animal reference for abstraction
        Animal cat = new Cat();
        cat.displayInfo();
        cat.breathe(); 
    }
}

