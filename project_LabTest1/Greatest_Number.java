package project_LabTest1;

public class Greatest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a=1;
   int b=10;
   int c=100;
   greatest(a,b,c);
   
	}
	public static void greatest(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.print(a);
		}
		else if(b>a && b>c) {
			System.out.print(b);
		}
		else{
			System.out.print(c);
		}
}
}
