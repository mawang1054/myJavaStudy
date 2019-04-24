package 华为笔试2016笔试;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Error> list = new ArrayList<Error>();
		for(int j = 0; j < 8; ++j) {
			if(sc.hasNext()) {
				String str = sc.next();
				String[] strArr = str.split("\\\\");
				int row = sc.nextInt();
				Error error = new Error(strArr[strArr.length - 1], row, 1);
				if(list.contains(error)) {
					for(int i = 0; i < list.size(); ++i) {
						if(list.get(i).equals(error)) {
							list.get(i).countIncrement();
							break;
						}
					}
				} else {
					list.add(error);
				}
			} else
				break;
			
		}
		
		insertSort(list);
		
		for(int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i));
		}
		
		sc.close();
	}
	
	public static void insertSort(List<Error> list) {
		for(int i = 1; i < list.size(); ++i) {
			int j = i;
			Error temp = list.get(i);
			for(; j >= 0 && list.get(j - 1).bigTo(temp); --j) {
				Collections.swap(list, j, j - 1);
			}
			list.set(j, temp);
		}
	}
}

class Error implements Comparable<Error>{
	private String fileName;
	private int row;
	private int count;
	
	public Error(String fileName, int row, int count) {
		super();
		this.fileName = fileName;
		this.row = row;
		this.count = count;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void countIncrement() {
		this.count++;
	}
	
	@Override
	public String toString() {
		if(fileName.length() <= 16)
			return fileName + " " + row + " " + count;
		else
			return fileName.substring(fileName.length() - 16) + " " + row + " " + count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + row;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Error other = (Error) obj;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	
	public boolean bigTo(Error o) {
		if(this.count > o.count)
			return true;
		else 
			return false;
	}
	
	@Override
	public int compareTo(Error o) {
		if(this.count > o.count)
			return 1;
		else if(this.count == o.count)
			return 0;
		else
			return -1;
	}
}
