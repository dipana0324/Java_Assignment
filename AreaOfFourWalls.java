import java.util.Scanner;

public class AreaOfFourWalls {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l: ");
        float l = sc.nextFloat();

        System.out.println("Enter b: ");
        float b = sc.nextFloat();

        double area = l * b;

        System.out.println("Area of Four walls = " + area);
    }
}
