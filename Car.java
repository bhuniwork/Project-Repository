public class Car
{
    private static final int MAX_SPEED = 180;
    private int MIN_SPEED = 0;
    private int yearModel;
    private String make; 
    private int speed;

    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    //getters/accessors
    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    //setters/mutators
    public int accelerate() {
        if (speed < MAX_SPEED) {
            return speed += 5;
        } else {
            return speed;
        }
    }   

    public int brake() {
        if (speed > MIN_SPEED) {
            return speed -= 5;
        } else {
            return speed;
        }
    }   

    @Override
    public String toString() {
        return String.format("%-4d, %20s, %3d" + yearModel + "   " + make + "    " + speed);
    }
}