import java.util.*;
class otpGenerator{
public static void otpGenerator(){
int otp = (int)(Math.random()*900000+100000);
System.out.println("otp generated" +otp);
}
public static void main(String args[]){
otpGenerator.otpGenerator();
}
}