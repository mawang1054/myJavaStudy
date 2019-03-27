package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoData1 {

	public static void main(String[] args) throws ParseException {
		String birthday = "1995年12月21日 00:00:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		Date bir = sdf.parse(birthday);
		Date now = new Date();
		long birTime = bir.getTime();
		long nowTime = now.getTime();
		long myTime = nowTime - birTime;
		System.out.println(myTime/1000/3600/24);
	}

}
