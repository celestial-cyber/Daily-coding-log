import java.util.*;
class empid{
    public static void otpGenerator(){
int otp = (int)(Math.random()*9000+1000);
System.out.println("EmpId " +otp);
}
public static void main(String args[]){
empid.otpGenerator();
}
}