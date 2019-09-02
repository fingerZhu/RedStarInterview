import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Point p0 = new Point(4, 4);
        Point p1 = new Point(2, 2);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(3, 3);
        Point[] arr = new Point[]{p0, p1, p2, p3};
        Main.sortLinearPoints(arr);
    }

    private static void sortLinearPoints(Point[] points) throws Exception {
        if (points.length < 2) {
            throw new Exception();
        }
        Point direction1 = points[0].sub(points[1]).normal();
        Point direction2 = points[1].sub(points[0]).normal();
        Arrays.sort(points, (o1, o2) -> o1.sub(o2).normal().nearlEqual(direction1) ? 1 : -1);
        Arrays.stream(points).forEach(o -> System.out.println(o));
        Arrays.sort(points, (o1, o2) -> o1.sub(o2).normal().nearlEqual(direction2) ? 1 : -1);
        Arrays.stream(points).forEach(o -> System.out.println(o));
    }
}
