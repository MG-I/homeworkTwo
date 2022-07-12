import java.util.Comparator;
import java.util.Random;

public class ArrayGenerationUtil implements NameGenerationInterface {


    public static Car[] ArrayGenerationCar(int count) {

        Car[] array = new Car[count];
        String model = null;
        for (int i = 0; i < array.length; i++) {

            int random = (int) (Math.random() * namesCar.length);
            String name = namesCar[random];
            if (random <= modelCar.length - 1) {
                model = modelCar[random];
            } else {
                model = null;
            }

            Car car = new Car(model, name);

            array[i] = car;
        }
        return array;
    }


}
