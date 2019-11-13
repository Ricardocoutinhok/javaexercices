public class Main {

    public static void main(String args[]) {
        Circle circulo1 = new Circle();
        circulo1.setRadius(2.0);

        Circle circulo2 = new Circle();
        circulo2.setColor("Blue");

        Circle circle3 = new Circle();
        circle3.setColor("Yellow");
        circle3.setRadius(9.0);

        System.out.println(circulo1.toString());
        System.out.println(circulo2.toString());
        System.out.println(circle3.toString());

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLenght(5.0f);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(8.2f);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setWidth(8.6f);
        rectangle3.setLenght(9.2f);

        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle3.toString());

    }

}
