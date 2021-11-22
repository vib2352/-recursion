package recursion;

public class Sum_array_element {
	public static void main(String[]args) {
		int[]arr= {4,5,8,3,6,6,7};
		int l = arr.length;
		int b = addingElement(arr,l);
		System.out.println(b);
		
	}
	private static int addingElement(int[]a1,int l) {
		if(l==0)return 0;
		return(addingElement(a1, l-1)+ a1[l-1]);
	}

}
