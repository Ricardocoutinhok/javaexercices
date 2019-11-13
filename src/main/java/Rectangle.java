public class Rectangle {

    private float lenght = 1.0f;
    private float width = 1.0f;

    //construtores
    public Rectangle(){

    }

    public Rectangle(float lenght, float width){
        this.lenght= lenght;
        this.width= width;
    }



    //funções

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        double area = lenght*width;
        return area;
    }
    public double getPerimeter(){
        double perimeter = lenght+lenght+width+width;
        return perimeter;
    }
    public String toString(){
        return "Rectangle[lenght="+lenght+ "width="+width+ "area="+ getArea()+"perimeter"+getPerimeter()+"]";
    }

}

