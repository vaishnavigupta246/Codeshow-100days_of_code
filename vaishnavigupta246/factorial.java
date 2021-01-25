import java.util.*;
class factorial
{
public static void main()
{
int  i,c=1,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter no.");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
c=c*i;
}
System.out.println("factorial of "+n+"=="+c);
}}
