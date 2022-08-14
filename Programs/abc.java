public class abc
{ int x;
    abc()
    { x=10;
    }
    abc(int y)
    { x=y;
    }
    public void main()
    { abc obj1=new abc();
        System.out.println(x);
        abc obj2 = new abc(10);
        System.out.println(x);
        
    }
}
