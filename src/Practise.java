import java.util.ArrayList;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {1,2,3,4,5,6};
		for  (int i=0;i<arr1.length;i++)
			if (arr1[i]%2==0)
		{
		System.out.println(arr1[i]+"is a Multiple of 2");
		}
		
		else
		{
			System.out.println(arr1[i]+ "not a multiple of 2");
		}
		String arr[]  = {"Monu","Sonu","Rashi","Trisha"};
		for(int m=0;m<arr.length;m++)
		{
			System.out.println(arr[m]);
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Manish");
		a.add("Verma");
		a.add("TRisha");
		a.add("Rashi");
		a.remove(1);
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
	
	
	
	

}
