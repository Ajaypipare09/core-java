import java.util.Scanner;

public class initialvelocity {

public static void main(String[] args){

double u,a,t,v,s;

Scanner sc = new Scanner(System.in);

System.out.print("Enter velocity");
u = sc.nextDouble();
System.out.print("Enter acceleration");
a = sc.nextDouble();
System.out.print("Enter Time");
t = sc.nextDouble();

v = u + a*t;
s = u + a*t*t;

System.out.println("Velocity" + u); 
System.out.println("acceleration " + a); 
System.out.println("time " + t); 
System.out.println("final velocity " + v); 
System.out.println("distance" + s); 

}


}