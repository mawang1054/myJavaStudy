package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoData1 {

	public static void main(String[] args) throws ParseException {
		String birthday = "1995��12��21�� 00:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss");
		Date bir = sdf.parse(birthday);
		Date now = new Date();
		long birTime = bir.getTime();
		long nowTime = now.getTime();
		long myTime = nowTime - birTime;
		System.out.println(myTime/1000/3600/24);
	}

}
