import.Scanner.util*
public class odd
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    String n="";
    for(int i=0;i<s.length;i++)
    {
      if(i%2==0)
      {
        n=n+s.charAt(i+1);
      }
      else
      {
        n=n+s.charAt(i-1);
      }
    }
    System.out.print(n);
  }
  
}



