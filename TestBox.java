import java.util.Calendar;
import java.util.Date;

public class TestBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go(){
        i=42;
        j=i;
        System.out.println(j);
        System.out.println(i);
        String s = String.format("level %,3f of %<,.2f", 456377.56565, 7658940.5658484);
        System.out.println(s);
        String d = String.format("%tr", new Date());
        System.out.println(d);
        Date today = new Date();
        String td = String.format("%tA, %<tB %<td", today);
        System.out.println(td);

        Calendar cal = Calendar.getInstance();
        cal.set(2025,0,7,15,40);
        System.out.println(cal);
        long day1 = cal.getTimeInMillis();
        day1 += 1000*60*60;
        cal.setTimeInMillis(day1);
        System.out.println("New hour " +cal.get(cal.HOUR_OF_DAY));
        cal.add(cal.DATE, 35);
        System.out.println("Add 35 days " + cal.getTime());
        cal.roll(cal.DATE, 35);
        System.out.println("Roll 35 days " + cal.getTime());
        cal.set(cal.DATE, 1);
        System.out.println("Set date in 1 " + cal.getTime());

    }
}
