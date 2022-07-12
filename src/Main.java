import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Car[] cars;
        cars = ArrayGenerationUtil.ArrayGenerationCar(10);

        Arrays.sort(cars, Car::compareTo);
        System.out.println(Arrays.toString(cars));

        cars[0].Run();
        System.out.println(cars[0].Move(10));
    }


}

