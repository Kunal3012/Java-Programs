class Box {
    double height;
    double length;
    double weight;

    public double area() {
        return 2 * (length * height + height * weight + length * weight);
    }

    public double volume() {
        return length * height * weight;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.length = 20;
        box1.weight = 30;

        double area = box1.area();
        double volume = box1.volume();
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }
}
