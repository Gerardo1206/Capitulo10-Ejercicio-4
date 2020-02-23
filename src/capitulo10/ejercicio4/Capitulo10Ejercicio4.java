package capitulo10.ejercicio4;

public class Capitulo10Ejercicio4 {

    public static void main(String[] args) {
        Year y1=new Year();
        LeapYear y2=new LeapYear();
        System.out.println(y2.getNumberOfDays());
        System.out.println(y1.daysElapsed(03, 15));
        System.out.println(y1.getNumberOfDays());
        System.out.println(y2.daysElapsed(03, 15));
    }
    
}
