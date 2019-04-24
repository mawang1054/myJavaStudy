package 微众银行笔试;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int T = sc.nextInt();
			int[] arr = new int[T];
			for(int i = 0; i < T; ++i) {
				arr[i] = sc.nextInt();
			}
			int[] result = new int[T];
			for(int i = 0; i < T; ++i) {
				int temp = arr[i];
				int count = 0;
				while(temp != 1) {
					count += 1;
					if(temp % 2 == 1) {
						temp = 3 * temp + 1;
					} else {
						temp = temp / 2;
						if(temp < i) {
							count += result[temp-1];
							break;
						}
					}
					
				}
				result[i] = count;
				System.out.println(result[i]);
			}
		}
		sc.close();
	}
}

//T = 3
//alist = [1,2,3]
//result = [0] * T
//for i in range(T):
//    tmp = alist[i]
//    count = 0
//    while tmp != 1:
//        if tmp % 2 == 1:
//            tmp = (3*tmp + 1) 
//        else:
//            tmp //= 2
//            if  tmp < i:
//                count += result[tmp]
//                break
//        count += 1
//    result[i] = count
//    print(result[i])

