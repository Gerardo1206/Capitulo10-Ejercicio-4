package capitulo10.ejercicio4;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Year {
    private Integer numberOfDays;
    
    public Year(){
        numberOfDays=365;
    }
    public void LeapYear(){
        numberOfDays=366;
    }
    public Integer getNumberOfDays() {
        return numberOfDays;
    }
    public Integer daysElapsed(Integer month,Integer day){
        Calendar f1=GregorianCalendar.getInstance();
        f1.set(2001, month-1, day);
        return f1.get(Calendar.DAY_OF_YEAR);
    }
    
}
