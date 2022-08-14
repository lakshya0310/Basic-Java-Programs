public class ARMSTRONG
{
    public static void main(int n)
    { for(int x=1;x<=n;x++)
        { int s=0 ; int t=x;
            for(int r = 1;x!=0;x/=10)
            { r=x%10;
               s= s + r*r*r;}
               if(t==s)
               { System.out.println(t);
                }
                
           x=t;
            }
    }
}
