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



    }

}
