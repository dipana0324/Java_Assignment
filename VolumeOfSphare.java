import java.util.Scanner;

public class VolumeOfSphare{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius of sphare: ");
        int radius = sc.nextInt();
        double pie=3.14285714286;  
        double volume=(4.0/3.0)*pie*(radius*radius*radius);  
          
       System.out.println("Volume of sphere="+volume);  
    }
}