class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * 3 * 3.142 * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// question 3/4

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class cwh_43_exercise3 {
    public static void main(String[] args) {

        //Question 1

        Cylinder myCylinder = new Cylinder(9, 12);
      //  myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
      //  myCylinder.setRadius(2);
        System.out.println(myCylinder.getRadius());


        //Question 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        //Question 3
        Rectangle r = new Rectangle(12,56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());




    }

}

