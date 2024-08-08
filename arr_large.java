package PROGRAMS;

public class arr_large {
	public static void main(String[]args) {
			int arr[] = {378,23,24,34,9};
			int max = arr[0],min = arr[0];
			for(int i=1;i<=4;i++) {
				if(max > arr[i]){
					min = arr[i];
				}
				else {
					max = arr[i];
				}
			}
			System.out.println("The smallest element is "+min+" and the largest element is "+max);
		}
	}


