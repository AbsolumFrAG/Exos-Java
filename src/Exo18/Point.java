package Exo18;

public class Point {
    private double x;
    private double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void afficher() {
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point point1 = new Point(4, 5);
        point1.afficher();

        Point point2 = new Point(4.0, 5.0);
        point2.afficher();
    }
}