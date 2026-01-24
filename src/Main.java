public class Main {
    public static void main(String... args) {
        System.out.println(String.format("Hello world!" + 07.86, 'c'));
        byte b= (byte) 130;
        char ch= '\u0041';
        System.out.println(b);
        System.out.println(ch);
        String s= "Java Programming";
        char[] arr=s.toCharArray();
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
        String[] sa={"balayya","venki","nag","chiru"};
        System.out.println();
        int sum=0;
        for (String saa:sa) {
            System.out.println(saa.length());
         sum+=saa.length();
        }
        System.out.println("Total length: "+sum);

        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        System.out.println(a.length);
    }
}

class Parent
{
    public static void main(String[] args)
    {
        System.out.println("parent main");
    }
    void display()
    {
        System.out.println("parent display");
    }
}
class Child extends Parent
{
    public static void main(String[] args)
    {
        System.out.println("Child main");
        Child parent=new Child();
        parent.display();
    }

    @Override
    void display() {
        System.out.println("Child display");
    }
}