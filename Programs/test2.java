import java.util.*;
public class test2
{
   public static void main(String s)
   { s=s.trim()+" ";
       String str="";
       for(int i=0 ; i<s.length();i++)
       { char ch =s.charAt(i);
           if(ch!=32)
           {str=str+ch;
           }
           else
           {char ch1=str.charAt(0);
            if(ch1=='A'||ch1=='B'||ch1=='C'||ch1=='D'||ch1=='E'||ch1=='F'||ch1=='G'||ch1=='H'||ch1=='I'||ch1=='J'||ch1=='K'||ch1=='L'||ch1=='M'||ch1=='N'||ch1=='O'||ch1=='P'||ch1=='Q'||ch1=='R'||ch1=='S'||ch1=='T'||ch1=='U'||ch1=='V'||ch1=='W'||ch1=='X'||ch1=='Y'||ch1=='Z')
             { System.out.println(str);
                 str="";
                 }
        }
    }
   }}
