package isVowel;


public class isvowel
{
   public void main()
   { boolean r = IsVowel('c');
       System.out.print(r);
   }
    public boolean IsVowel(char ch)
    {   boolean result = false;
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
         {result = true ;
         }
        return result;
        
        }
}
