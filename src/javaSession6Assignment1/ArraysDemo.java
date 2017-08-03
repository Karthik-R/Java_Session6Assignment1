package javaSession6Assignment1;

public class ArraysDemo {

	public static void main(String[] args) {
		// Declaring the array
		int[] a = new int[11];
		// Initializing array with for loop
		System.out.print("Elements of Array:");
		for(int i=1;i<=10;i++){
			a[i]=i;
			System.out.print(a[i]);
			if(i!=10)
			System.out.print(",");
		}
		int len = a.length;
		// Printing the even numbers present in the array
		System.out.print("\nEven Numbers in array:");
		for(int j=1;j<len;j++){
			if(a[j]%2 == 0){
				System.out.print(a[j]);
				if(j!=len-1)
				System.out.print(",");
			}
		}
	}

}
