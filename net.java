import.java.util.*;
public class java
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    String s2="";
    String s1=new StringBuffer(s).toreverse().toString();
    System.out.println(s1);
    for(int i=0;i<s1.length();i++){
      if(s1.charAt(i)!='a'||s1.charAt(i)!='e'||s1.charAt(i)!='i'||s1.charAt(i)!='o'||s1.charAt(i)!='u'||s1.charAt(i)!='A'||s1.charAt(i)!='E'||s1.charAt(i)!='I'||s1.charAt(i)!='O'||s1.charAt(i)!='U')
      {
        s2=s2+s1.charAt(i);
      }
    }
  System.out.println(s2);
  }
}
