package 第二章;

import java.util.ArrayList;
import java.util.List;

public class Demo_2_4_1 {
	static class OOMObject{
		
	}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		
		while(true) {
			list.add(new OOMObject());
		}
	}
}
