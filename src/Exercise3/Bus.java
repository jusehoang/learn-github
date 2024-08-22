package Exercise3;

public class Bus extends Vehicle{
    public Bus(String name, double width, double height, double length, double weight, int seatingCapacity) throws Exception {
        super(name, width, height, length, weight, seatingCapacity);
    }
    public void setWeight(double weight) throws Exception {
        if (weight < 5000.0 || weight > 20000.0) {
            throw new IllegalArgumentException("Bus weight must be in the range [5000.0, 20000.0] kgs");
        }
        super.setWeight(weight);
    }
    public void setLength(double length) throws Exception {
        if (length < 4.0 || length > 10.0) {
            throw new IllegalArgumentException("Bus length must be in the range [4.0, 10.0] meters");
        }
        super.setLength(length);
    }
}
