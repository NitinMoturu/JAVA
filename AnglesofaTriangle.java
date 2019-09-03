/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nitin
 */
import java.util.Scanner;
public class AnglesofaTriangle {
    public static void  main(String[] args){
    System.out.println("Enter the vertices");
    Scanner s=new Scanner(System.in);
    int x1=s.nextInt();
     int y1=s.nextInt();
      int x2=s.nextInt();
       int y2=s.nextInt();
        int x3=s.nextInt();
         int y3=s.nextInt();
         double a=(Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2)));
    double b=(Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2)));
    double c=(Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2)));
    double A=Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
        double B=Math.toDegrees(Math.acos((b*b-c*c-a*a)/(-2*a*c)));
    double C=Math.toDegrees(Math.acos((c*c-a*a-b*b)/(-2*b*a)));
    System.out.printf("%.2f %.2f %.2f",A,B,C);

}
}
