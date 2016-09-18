import.java.util.*;
public class java
{
  public static void main(String[] args)
  {
    Scanner in=new scanner(System.in);
    String s=in.next();
    int vowels=0;
    for(int i=0;i<s.length();i++)
    {
    if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U');
    {
    vowels++;
    }
    }
    System.out.print(vowels);
  }
}



