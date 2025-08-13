import java.util.Scanner;
class Student
{
int id=40004007;
String name="Sarthak";

void display()
{
System.out.println("My Sapid is"+id+"and my name is"+name);
System.out.println("I am in MCA");

}
void details()
{
Scanner sc= new Scanner(String.in);
System.out.println("Enter the 1st number");
int x =sc.nextInt();
System.out.println("Enter the 2nd number");
int y= sc.nextInt();
int z= x+y;
System.out.println("The addition of the number is \t" +z); 
}
public static void main(String[] args)
{
Student mca = new Student();
mca.display();
mca.details();
}
}