package project_LabTest1;

public class Odd_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int number=20;
  System.out.print("List of odd numbers from 1 to "+number+":");
  for(int i=1; i<=number; i++)
  {
	if (i%2!=0)
	{
		System.out.print(i+" ");		
	}
  }
}
}

