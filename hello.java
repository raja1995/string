import.java.util.*
public class even
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    int count=0,max=0;
    char[] ch=s.tocharArray();
    for(int i=0;i<ch.length;i++)
    {
      for(int j=i+1;j<ch.length;j++)
      {
       if(ch[i]==ch[j])
        {
         count++;
        }
      }
      max=ch.length-count;
      System.out.print(max);
    }
  }
}



