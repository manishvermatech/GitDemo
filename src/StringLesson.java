import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StringLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Strings Literal
//String s ="Manish Verma monu ";
//String s1 ="Manish Verma monu";

//New 
//String s2 =new String("Manish");
//String S3= new String("Manish");

String s5 ="Manish Verma Monu";
//Split Method

String[] splittedstring = s5.split("");
System.out.println(splittedstring[0]);
System.out.println(splittedstring[1]);
System.out.println(splittedstring[2]);
System.out.println(splittedstring[3]);
System.out.println(splittedstring[4]);
System.out.println(splittedstring[5]);
System.out.println(splittedstring[6]);
System.out.println(splittedstring[7]);
System.out.println(splittedstring[8]);
System.out.println(splittedstring[9]);
for( int i =0;i<s5.length();i++)
{
System.out.println(s5.charAt(i));
}



	}

}
