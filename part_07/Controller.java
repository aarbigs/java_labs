package part_07;

/**
 * Created by aaron on 7/12/17.
 */
class Vehicles implements Controller.Series {
    private int length;
    private int width;
    private boolean hasWheels;

    public void reset(){
        System.out.println("reset");
    }
    public void start(){
        System.out.println("Start your engines");
    }
    public void end(){
        System.out.println("Shut it down");
    }

    public Vehicles() {
    }

    public Vehicles(int length, int width, boolean hasWheels) {
        this.length = length;
        this.width = width;
        this.hasWheels = hasWheels;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public int size(int width, int height) {
        return width * height;
    }

    public boolean isCar(boolean hasWheels) {
        if (hasWheels) {

        }
        return true;

    }
}

class Cars extends Vehicles {
        private int weight;
        private String color;
        private boolean roof;

        public Cars() {
        }

        public Cars(int length, int width, boolean hasWheels, int weight, String color, boolean roof) {
            super(length, width, hasWheels);
            this.weight = weight;
            this.color = color;
            this.roof = roof;
        }
        public void isCool() {
            System.out.println("This vehicle is pretty cool!");
        }
        public boolean isConvertible(boolean roof) {
            if (roof) {
            } return true;
        }
}

class SportsCars extends Cars {
        private String brand;
        private String year;

    public SportsCars(){

    }
    public SportsCars(String brand, String year) {
        this.brand = brand;
        this.year = year;
    }

    public SportsCars(int length, int width, boolean hasWheels, int weight, String color, boolean roof, String brand, String year) {
        super(length, width, hasWheels, weight, color, roof);
        this.brand = brand;
        this.year = year;
    }

    int horsepower(int cylinders, int cubicliters) {
            return cylinders * cubicliters;
        }

    int topSpeed(int weight, int size) {
            return weight * size;
        }
}

class Ferrari extends SportsCars {
        private int price;
        private int model;

        public Ferrari(String brand, String year, int price, int model) {
            super(brand, year);
            this.price = price;
            this.model = model;
        }

        public Ferrari(int length, int width, boolean hasWheels, int weight, String color, boolean roof, String brand, String year, int price, int model) {
            super(length, width, hasWheels, weight, color, roof, brand, year);
            this.price = price;
            this.model = model;
        }
}

public class Controller{
        public static void main(String[] args) {
            SportsCars sports = new SportsCars(100,50,true,2000,"black",false,"Ferrari","2018");
            Vehicles vehicle1 = new Vehicles();
            vehicle1.setLength(100);
            vehicle1.setWidth(50);
            sports.isCool();
            System.out.println(vehicle1.size(50,100));
            System.out.println(sports.topSpeed(5000, vehicle1.size(50,100)));
            System.out.println(sports.getLength());
            vehicle1.reset();
            vehicle1.start();
            vehicle1.end();

        }
        public interface Series{
            void reset();
            void start();
            void end();
        }
    }
