class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.name="Circle";
        this.radius=radius;
    }

    double getArea(){
        return Math.PI*radius*radius;
    }
    double getPerimeter(){
        return 2*Math.PI*radius;
    }

}
