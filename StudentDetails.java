import java.util.Scanner;
class StudentDetails
{
    public static void main(String args[]) {
    int rollno,n,i;
    String name,bran;
    System.out.println("Enter no of students");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        System.out.println(i+"st student");
	
	System.out.print("Enter rollno :");
	rollno=sc.nextInt();
	System.out.print("Enter name :");
        name=sc.next();
	System.out.print("Enter branch :");
         bran=sc.next();

    }
}  
    
}