package day38_Statics;

public class Circle {

    public double radius, diameter, area, perimeter;


    public String toString() {
        return
                "Radius = " + radius +
                ", Diameter = " + diameter +
                ", Area = " + area +
                ", Perimeter = " + perimeter;
    }

    public void setInfo(double radius){
       this.radius = radius;
       diameter = 2 * radius;
       area = calculateArea();
       perimeter = calculatePerimeter();

    }

    public double calculateArea(){
        return radius * radius * Math.PI;
    }

    public double calculatePerimeter(){
        return diameter * Math.PI;
    }

}
