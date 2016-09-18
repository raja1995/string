import java.util.*;
public class java
{
  public static int main(string[] args)
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int count=0;
    String s=String.valueOf(n);
    for(int i=1;i<s.length();i+2)
    {
      count=count+(int)(s.charAt(i));
    }
    System.out.print(count);
    if(count%2==0)
    return -1;
    else
    return 1;
  }
}
