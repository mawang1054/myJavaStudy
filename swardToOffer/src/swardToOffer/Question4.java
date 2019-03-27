package swardToOffer;

public class Question4 {
	public static void main(String[] args) {
		int[][] array = {{1,2,8,9},{4,7,10,13}};
		System.out.println(Question4.Find(7,array));
	}
	
    public static boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0 || array[0].length == 0)
            return false;
        int row = 0;
        int column = array[0].length - 1;
        while (row < array.length && column >= 0) {
            if (array[row][column] == target) {
                return true;
            } 
            else if (array[row][column] < target){
                row++;
            }
            else {
                column--;
            }
        }
        return false;
    }
}
