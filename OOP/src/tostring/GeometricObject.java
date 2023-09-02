package tostring;

/**
 * ClassName: GeometricObject
 * Package: tostring
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/5/26 17:13
 * @Version 1.0
 */
public class GeometricObject {

    protected String color;
    protected double weigh;
    protected GeometricObject(){
        color = "white";
        weigh = 1.0;
    }

    public GeometricObject(String color, double weigh) {
        this.color = color;
        this.weigh = weigh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }
}
