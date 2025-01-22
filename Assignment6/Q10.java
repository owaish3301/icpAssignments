class ShapeArea {
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(int side) {
        return side * side;
    }

    public static double area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        System.out.println("Circle: " + area(5));
        System.out.println("Square: " + area(4));
        System.out.println("Rectangle: " + area(5, 10));
    }
}
