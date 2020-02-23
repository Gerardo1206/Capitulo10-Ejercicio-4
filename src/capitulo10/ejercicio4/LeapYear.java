package capitulo10.ejercicio4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapYear extends Year {
    
    public LeapYear(){
        super.LeapYear();
    }
    @Override
    public Integer daysElapsed(Integer month,Integer day){
        Calendar f1=GregorianCalendar.getInstance();
        f1.set(2000, month-1, day);
        return f1.get(Calendar.DAY_OF_YEAR);
    }
}
