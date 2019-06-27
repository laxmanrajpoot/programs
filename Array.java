import java.util.Scanner;
class array
{
public static void main(String[] args)
{
int a[]=new int[100];
Scanner array=new Scanner();
int n=array.nextInt();
for(int i=0;i<n;i++)
{
a[i]=array.nextInt(a[i]);
}
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
