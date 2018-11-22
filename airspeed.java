import java.util.Scanner;

public class airspeed {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double inputF; //Input frequency (Hz)
    double inputA; //Input amplitude
    double speedReslut; //Variable stores the value of method airspeedVelocity
    
    System.out.println("Airspeed Velocity Calculatior");    
    System.out.println("African Swallow: " + airspeedVelocity(15,21) + " meters/seconds");
    System.out.println("European Swallow: " + airspeedVelocity(14,22) + " meters/seconds");
    System.out.print("Input frequency (Hz): ");
    inputF = sc.nextDouble();
    System.out.println("Input amplitude: ");
    inputA = sc.nextDouble();
    speedReslut = airspeedVelocity(inputF, inputA);
    System.out.println();
    System.out.println("CALCULATING...");
    System.out.println("ANSWER IS: " + speedReslut + " meters/seconds");
    }
    
    public static double airspeedVelocity(double frequency, double amplitude){
    final double strouhal_num = 0.33;
    double reslut;
    
    reslut = frequency * (amplitude/100) / strouhal_num;
    
    return reslut;
    }
}
