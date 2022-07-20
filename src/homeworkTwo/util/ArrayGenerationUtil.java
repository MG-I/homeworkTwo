package homeworkTwo.util;

import homeworkTwo.data.Car;
import homeworkTwo.interfaces.NameGenerationInterface;

public class ArrayGenerationUtil implements NameGenerationInterface {


    public static Car[] ArrayGenerationCar(int count) {

        Car[] array = new Car[count];
        String model;
        for (int i = 0; i < array.length; i++) {

            int random = (int) (Math.random() * namesCar.length);
            String name = namesCar[random];
            if (random <= modelCar.length - 1) {
                model = modelCar[random];
            } else {
                model = "not value";
            }

            Car car = new Car(model, name);

            array[i] = car;
        }
        return array;
    }


}
