class RegularPolygon {
    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        System.out.println("Area of hexagon with side 5: " + area(6, 5));
    }
}
