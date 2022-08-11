package p1;

public class ValidateData extends DataStd
{
	public void stdDetails(int id, int rol, String name, int score, String college, String city )
	{
		if(score>=60 && score<70)
			System.out.println("VIT");
		
		else if(score>=70 && score<80) 
			System.out.println("BITS");
		
		else if(score>=80 && score<90) {
			System.out.println("ID: "+id);
			System.out.println("Roll: "+rol);
			System.out.println("Name: "+name);
			System.out.println("Score: "+score);
			System.out.println("College: "+college);
			System.out.println("City: "+city);
			
		}
		
		else if(score>=90)
			System.out.println("IIT");
		
	}
}
