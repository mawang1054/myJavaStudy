package 选择题;

public class Question1 {
	public static void main(String[] args) {
		Double n = 1.5;
		Double m = 1.0;
		Double l = 0.6;
		Double temp = 201.9;
		int count = 0;
		for(int i = 0; i < 201.9/n; i++) {
			for(int j = 0; j < 201.9/m; j++) {
				for(int z = 0; z < 201.9/l; z++) {
					if(temp.equals(i*n+j*m+z*l))
						count++;
				}
			}
		}
		System.out.println(count);
	}
}
