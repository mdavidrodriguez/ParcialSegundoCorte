
package Test;
import Motor.*;
import datos.*;
public class Test {

public class RegistroP {
    public static void main(String[] args) {
        Motor catalogo = new Motor();
            
            Motor motorD=new MotorElectrico(127544, "Mateo", 26);
            catalogo.alquilarMotor(motorD);
            
            Motor motorE = mew MotorMecanico(156548, "Juan", 48, "Gasolina");
            catalogo.alquilar(motorE);
            
            Motor motorF = new MotorHibrido(5488476, "Carmen", 8, 2.5, "Gas");
            catalogo.aqluilarMotor(motorF);
            
            System.out.println("* CATALOGO DE MOTORES *");
            for(Motor m : catalogo.getmotor()){
                System.out.println(m.getinfoMotor());
            }
           
        }
    }
}
    

