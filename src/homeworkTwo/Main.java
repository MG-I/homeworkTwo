package homeworkTwo;

import homeworkTwo.data.Car;
import homeworkTwo.util.ArrayGenerationUtil;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Car[] cars;
        cars = ArrayGenerationUtil.ArrayGenerationCar(10);

        Arrays.sort(cars, Car::compareTo);
        System.out.println(Arrays.toString(cars));

        cars[0].run();
        System.out.println(cars[0].move(10));
    }


}

