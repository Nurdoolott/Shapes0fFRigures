class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width,double height){
        this.name="Rectangle";
        this.width=width;
        this.height=height;
    }
    double getArea(){
        return width*height;
    }

    double getPerimeter(){
        return 2*(width+height);
    }
}
