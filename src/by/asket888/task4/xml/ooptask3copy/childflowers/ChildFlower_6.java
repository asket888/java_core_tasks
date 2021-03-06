package by.asket888.java.task4.xml.ooptask3copy.childflowers;

import by.asket888.java.task4.xml.ReadFlowerFromXml;
import by.asket888.java.task4.xml.ooptask3copy.parentflower.Flower;

public class ChildFlower_6 extends Flower {

    public ChildFlower_6() throws Exception {

        // Create an object of ReadFlowerFromXml class
        ReadFlowerFromXml flowerFromXml = new ReadFlowerFromXml();

        // Set flower name as a result of selectFlowerName() method with input parameter "5"
        setFlowerName(flowerFromXml.selectFlowerName(5));
        // Set flower price as a result of selectFlowerName() method with input parameter "5"
        setFlowerPrice(flowerFromXml.selectFlowerPrice(5));
    }
}
