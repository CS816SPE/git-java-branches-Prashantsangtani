import java.util.Scanner;
public class cal{
	public static void main(String args[]) {
	float a,b,res;
	char choice,ch;
	Scanner scan = new Scanner(System.in);
	
	do{
	System.out.print("1, Add two no.s\n");
	System.out.print("2, Sub two no.s\n");
	System.out.print("3. Exit\n\n");
	System.out.print("Enter ur choice\n");
	choice=scan.next().charAt(0);
	switch(choice){
	
		case '1' : System.out.print("Enter 2 nos.");
		a=scan.nextFloat();
		b=scan.nextFloat();
		res=a+b;
		System.out.print("Result ="+res);
		break;
		
		case '2' : System.out.print("Enter 2 nos.");
		a=scan.nextFloat();
		b=scan.nextFloat();
		res=a-b;
		System.out.print("Result ="+res);
		break;
		
		case '3' : System.exit(0);
		break;
		
		default: System.out.print("Invalid choice ");
		break;
		
		}
		System.out.print("\n----------------------");
	}while(choice!=3);
}
}
