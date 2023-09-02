package tostring;

/**
 * ClassName: Circle
 * Package: tostring
 * Description:
 *
 * tostring的练习题
 * @Author: Hjr
 * @Create 2023/5/26 17:19
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        color = "white";
        weigh = 1.0;
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "white";
        weigh = 1.0;
    }

    public Circle(String color, double weigh, double radius) {
        super(color, weigh);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //求面积
    public double findArea(){
        double area = radius*3.14*radius;
        return area;
    }
    //重写equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }
    public String toString(){
        return "Circle = " + radius;
    }
}
