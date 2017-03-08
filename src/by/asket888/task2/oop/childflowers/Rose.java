package by.asket888.java.task2.oop.childflowers;

import by.asket888.java.task2.oop.parentflower.Flower;

// Create Class which extends parameters of Parent Class Flower
public class Rose extends Flower {

    // Create Class constructor which assign Parent Class's fields unique parameters
    public Rose() {
        setFlowerName("Rose");
        setFlowerPrice(10.0);
    }
}
