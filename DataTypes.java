package Basics;

public class DataTypes {
    public static void main(String[] args) {
        int x = 39;
        int y = 10;
        int z = x / y; // Ineffective data type and lossy result
        System.out.println(z);

        double x2 = 39;
        double y2 = 10;
        double z2 = x2 / y2; // Data type makes result accurate
        System.out.println(z2);

        int x3 = 10;
        System.out.println(x3); // op: 10

        double y3 = 10;
        System.out.println(y3); // op: 10.0
    }
}
