class Triangle extends Shape{
    double side1, side2, side3;

    public Triangle(double side1,double side2,double side3){
        this.name="Triangle";
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    double getArea(){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    double getPerimeter(){
        return side1+side2+side3;
    }
}
