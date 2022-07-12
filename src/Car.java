import java.util.Comparator;
import java.util.Objects;

public class Car implements NameGenerationInterface, RunCarInterface, Comparable<Car> {
    private long yearOfCreation;
    private String model;
    private String ownerFullName;
    private float engineVolume;
    private String typeEngine;
    private String typeFuel;
    private String color;


    public Car(long yearOfCreation, String model, String ownerFullName, float engineVolume, String typeFuel, String typeEngine, String color) {
        this.yearOfCreation = yearOfCreation;
        this.model = model;
        this.ownerFullName = ownerFullName;
        this.engineVolume = engineVolume;
        this.typeEngine = typeEngine;
        this.typeFuel = typeFuel;
        this.color = color;

    }

    public Car(String model, String ownerFullName) {
        this.model = model;
        this.ownerFullName = ownerFullName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfCreation == car.yearOfCreation && Float.compare(car.engineVolume, engineVolume) == 0 && model.equals(car.model) && ownerFullName.equals(car.ownerFullName) && typeEngine.equals(car.typeEngine) && typeFuel.equals(car.typeFuel) && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfCreation, model, ownerFullName, engineVolume, typeEngine, typeFuel, color);
    }


    @Override
    public String toString() {
        return "Car{" +
                "yearOfCreation=" + yearOfCreation +
                ", model='" + model + '\'' +
                ", ownerFullName='" + ownerFullName + '\'' +
                ", engineVolume=" + engineVolume +
                ", typeEngine='" + typeEngine + '\'' +
                ", typeFuel='" + typeFuel + '\'' +
                ", color='" + color + '\'' +
                '}' + "\n";
    }

    public long getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(long yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void Run() {
        System.out.println("Car run!");
    }

    @Override
    public int Move(int speed) {
        return speed;
    }


    @Override
    public int compareTo(Car o) {
        return getOwnerFullName().compareTo(o.getOwnerFullName());
    }
}
