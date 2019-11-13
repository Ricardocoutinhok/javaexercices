public class Circle {

    //VARIAVEIS
    private double radius = 1.0;
    private String color = "red";

    //CONSTRURORES Funções não returnão nada e tem o nome da propria class
    public Circle(){

    }

    public Circle(double radius){
        this.radius= radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //FUNCOES
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        double area = radius*radius*Math.PI;
        return area;
    }
    public String toString(){
        return "Circle[radius=" + radius + "color=" + color + "Area=" + getArea()+ "]";
    }
    /*
    public String toString(){
        return String.format("Circle: raio: %.2f , cor:%s ,area: %.2f",
        radius, color, getArea());
    }
     */
}
