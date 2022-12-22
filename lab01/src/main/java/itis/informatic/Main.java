package itis.informatic;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите координаты первой точки: ");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Введите координаты второй точки: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Введите параметры переноса: ");
        double z1 = sc.nextDouble();
        double z2 = sc.nextDouble();
        Segment segment = new Segment( new Point(x1, y1), new Point(x2,y2),new Distance(z1, z2), new Distance(z1, z2));
        System.out.println("Координаты серединной точки: ");
        System.out.println(segment.Average());
        System.out.println("Перенос отрезка: ");
        System.out.println(segment.TransferFP());
        System.out.println(segment.TransferSP());

    }
}