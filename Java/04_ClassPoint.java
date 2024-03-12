import java.lang.Math;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Rectangle {
    private Point leftTop;
    private Point rightTop;
    private Point leftBot;
    private Point rightBot;

    public Rectangle(Point leftTop, Point rightTop, Point leftBot, Point rightBot) {
        this.leftTop = leftTop;
        this.rightTop = rightTop;
        this.leftBot = leftBot;
        this.rightBot = rightBot;
    }

    public double getArea() {
        double width = getWidth();
        double height = getHeight();
        return width * height;
    }

    public double getPerimeter() {
        double width = getWidth();
        double height = getHeight();
        return 2 * (width + height);
    }

    public double getWidth() {
        return calcDistance(leftTop, rightTop);
    }

    public double getHeight() {
        return calcDistance(leftTop, leftBot);
    }

    private double calcDistance(Point a, Point b) {
        int x1 = a.getX();
        int y1 = a.getY();
        int x2 = b.getX();
        int y2 = b.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

public class Main {
    public static void main(String[] args) {
        Point leftTop = new Point(200, 100);
        Point rightTop = new Point(500, 100);
        Point leftBot = new Point(200, 300);
        Point rightBot = new Point(500, 300);

        Rectangle rectangle = new Rectangle(leftTop, rightTop, leftBot, rightBot);

        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();
        double distance = rectangle.getWidth();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Distance: " + distance);
    }
}
