import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("Manish");
		a.add("Verma");
		a.add("Selenium");
		a.add("Tosca");
		a.remove(3);
		a.add("MLand AI");
		//System.out.println(a.get(2));
		
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
        for( String val :a)
        {
        	System.out.println(val);
        }
        System.out.println(a.contains("Verma"));
	}

}
