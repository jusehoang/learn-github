package Exercise3;

public class Vehicle {
    private String name;
    private double width;
    private double height;
    private double length;
    private double weight;
    private int seatingCapacity;
    public Vehicle(String name, double width, double height, double length, double weight, int seatingCapacity)throws Exception{
        if (this.name.length() > 100){
            throw new Exception("Invalid name");
        }
        this.name = name;

        if (width < 0){
            throw new Exception("Invalid width");
        }
        this.width = width;

        if (height < 0){
            throw new Exception("Invalid height");
        }
        this.height = height;

        if (length < 0){
            throw new Exception("Invalid length");
        }
        this.length = length;

        if(weight < 0){
            throw new Exception("Invalid weight");
        }
        this.weight = weight;

        if(seatingCapacity < 0){
            throw new Exception("Invalid seating capacity");
        }
        this.seatingCapacity = seatingCapacity;
    }

    public String getName(String name){
        return name;
    }

    public void setName(String name) throws Exception {
        if (this.name.length() > 100){
            throw new Exception("Invalid name");
        }
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws Exception {
        if (width < 0){
            throw new Exception("Invalid width");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws Exception {
        if (height < 0){
            throw new Exception("Invalid height");
        }
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws Exception {
        if (length < 0){
            throw new Exception("Invalid length");
        }
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws Exception{
        if(weight < 0){
            throw new Exception("Invalid weight");
        }
        this.weight = weight;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) throws Exception{
        if(seatingCapacity < 0){
            throw new Exception("Invalid seating capacity");
        }
        this.seatingCapacity = seatingCapacity;
    }

}

