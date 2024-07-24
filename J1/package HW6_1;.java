package HW6_1;

class Cylinders {
    double radius = 5;
    int height = 5;
    double pi = 3.14;

    double area() {
        return pi * radius * radius;
    }

    double volume() {
        return area() * height;
    }
}

public class App6_3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Cylinders volu;
        volu = new Cylinders();
        volu.radius = 5;
        volu.height = 5;
        System.out.println("底面积=" + volu.area() + "cm2");
        System.out.println("体积=" + volu.volume() + "cm3");
    }

}
