class CylinderArea {
    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        
        double area = Math.PI * radius * radius + 2 * Math.PI * radius * height;
        System.out.printf("Surface Area = %.2f", area);
    }
}