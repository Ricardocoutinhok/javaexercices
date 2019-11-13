public class Main {

    public static void main(String args[]) {
        Circle circulo1 = new Circle();
        circulo1.setRadius(2.0);

        Circle circulo2 = new Circle();
        circulo2.setColor("Blue");

        Circle circle3 = new Circle();
        circle3.setColor("Yellow");
        circle3.setRadius(9.0);

        System.out.println("O raio é " + circulo1.getRadius() + "a cor é " + circulo1.getColor() + "a area é " + circulo1.getArea());
        System.out.println("O raio é " + circulo2.getRadius() + "a cor é " + circulo2.getColor() + "a area é " + circulo2.getArea());
        System.out.println("O raio é " + circle3.getRadius() + "a cor é " + circle3.getColor() + "a area é " + circle3.getArea());
    }
}
