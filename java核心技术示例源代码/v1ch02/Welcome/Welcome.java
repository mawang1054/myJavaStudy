/**
 * This program displays a greeting for the reader.
 * @version 1.30 2014-02-27
 * @author Cay Horstmann
 */
public class Welcome
{
   public static void main(String[] args)
   {
      String greeting = "\u2835\uD835\uDD46阿三发射点发";
      System.out.println(greeting);
      for (int i = 0; i < greeting.length(); i++)
         System.out.print("=");
      System.out.println();
      int cpCount=greeting.codePointCount(0,greeting.length());
      System.out.println("码点数量："+cpCount);
      System.out.println("代码单元数量："+greeting.length());
      char first = greeting.charAt(0);
      System.out.println("第一个代码单元："+first);
      char last = greeting.charAt(1);
      System.out.println("第二个代码单元："+last);
      int index = greeting.offsetByCodePoints(0, 1);
      int cp = greeting.codePointAt(index);
      System.out.println(cp);
   }
}
