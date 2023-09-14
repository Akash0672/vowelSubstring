import java.util.*;

class ovalSub
{

    public void subString(String s1)
    {
        char[] c1=new char[s1.length()];
        c1=s1.toCharArray();
        int length=c1.length;
        for(int i=0;i<length;i++)
        {
            int j=i+1;
            if(c1[i]=='a' || c1[i]=='e' || c1[i]=='i' || c1[i]=='o'||c1[i]=='u')
            {
                String str=new String();
                String s=str.copyValueOf(c1);
                while(j<=length)
                {
                    System.out.println(s.substring(i,j));
                    j++;
                }
            }  
        }
    } 

    public static void main(String args[])
    {
        System.out.println("Enter first String: ");
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        System.out.println("Enter second string: ");
        String s2=sc.next();
        ovalSub o=new ovalSub();
        System.out.print("Substrings of "+s1+":");
        o.subString(s1);
        System.out.println("Substring of "+s2+":");
        o.subString(s2);


    }
}