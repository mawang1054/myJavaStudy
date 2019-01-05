import java.time.*;

/**
 * @version 1.5 2015-05-08
 * @author Cay Horstmann
 */

public class CalendarTest
{
   public static void main(String[] args)
   {
      LocalDate date = LocalDate.now();
      System.out.println(date);
      int month = date.getMonthValue();
      System.out.println(month);
      int today = date.getDayOfMonth();
      System.out.println(today);

      date = date.minusDays(today - 1); // Set to start of month minuDay在当前天数上减去参数天数，并保持有效
      DayOfWeek weekday = date.getDayOfWeek();//获得星期几的枚举值
      int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday

      System.out.println("Mon Tue Wed Thu Fri Sat Sun");
      for (int i = 1; i < value; i++)
         System.out.print("    ");
      while (date.getMonthValue() == month)
      {
         System.out.printf("%3d", date.getDayOfMonth());
         if (date.getDayOfMonth() == today)
            System.out.print("*");
         else
            System.out.print(" ");
         date = date.plusDays(1);
         if (date.getDayOfWeek().getValue() == 1) System.out.println();//下一个日期为星期一则换行
      }
      //if (date.getDayOfWeek().getValue() != 1) System.out.println();
   }
}