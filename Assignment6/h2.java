class Volume {
    public static double volume(double side) {
        return side * side * side;
    }

    public static double volume(double radius, boolean isSphere) {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public static double volume(double l, double b, double h) {
        return l * b * h;
    }

    public static void main(String[] args) {
        System.out.println("Cube: " + volume(3));
        System.out.println("Sphere: " + volume(3, true));
        System.out.println("Cuboid: " + volume(3, 4, 5));
    }
}
