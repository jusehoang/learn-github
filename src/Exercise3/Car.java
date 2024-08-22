package Exercise3;

public class Car extends Vehicle{
    public Car(String name, double width, double height, double length, double weight, int seatingCapacity) throws Exception {
        super(name, width, height, length, weight, seatingCapacity);
    }
    public void setWeight(double weight) throws Exception {
        if (weight < 1000.0 || weight > 2000.0) {
            throw new IllegalArgumentException("Car weight must be in the range [1000.0, 2000.0] kgs");
        }
        super.setWeight(weight);
    }
    public void setLength(double length) throws Exception {
        if (length < 1.5 || length > 3.5) {
            throw new IllegalArgumentException("Car length must be in the range [1.5, 3.5] meters");
        }
        super.setLength(length);
    }
}


