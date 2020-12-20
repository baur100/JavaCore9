package LeraHomework1;

public class app {
    public static void main(String[] args) {
        int age = 25;
        if (age >= 21){
            System.out.println("Here is your beer");
        }else {
            System.out.println("Here is your soda");
        }

        boolean b;
        boolean m;

        b = 6>7; //false
        m = 7>=7;//true

        boolean dd= age>21;
        boolean hey = 5!=5;
        System.out.println(hey);

        int ticketAge = 25;
      boolean adult =  ticketAge> 12 && ticketAge < 66;
        System.out.println(adult);
        //&&
        // true && true = true 1*1=1
        // true && false = false;
        // false && true = false;
        // false && false = false

//        String meet = "lamb";
//        boolean baebeque == meet=="lamb" || meat =="beef";
//        System.out.println(baebeque);
//        //or
        //true ||true = true 1+1 =1
        //true || false = true
        //false || true =true
        //false || false = false

        // NOT
        //true!= false
        //false =!true

        String fish ="Mackrel";
        boolean isVegeterian = !(fish=="Mackrel");
        System.out.println(isVegeterian);
//        a=100;
//        x=12;
//        d=12;
//        c=122;
//        Find zz
//        a. zz1 = a==d // false
//        b. zz2 = x==d
//        c. zz3 = c>=a
//        d. zz4 = x>=d
//        e. zz5 = (d==c) || (x==d)
//        f. zz6 = (c>x) && (d>=x)
//        g. zz7 = (a>x) || (a>c)
//        h. zz8 = (a==c) && (d==c)
//        i. zz9 = (c==c) && (a>=a)
//        j. zz0 = (c>c) || (a<=a)
//        k. zz10 = (x>a) && (c==d)
//        l. zz11 = (c>a) && (x>d)
//        2. in the program
//        3. 3 examples with if-else

//
        int a= 100;
        int x = 12;
        int d = 12;
        int c = 122;

        boolean zz = a==d;
        boolean zz1 = x==d;
        boolean zz2 = c>=a;
        boolean zz3 = x>=d;
        boolean zz4 = x>=d;
        boolean zz5 = (d==c) || (x==d);
        boolean zz6 = (c>x) && (d>=x);
        boolean zz7 = (a>x) || (a>c);
        boolean zz8 = (a==c) && (d==c);
        boolean zz9 = (c==c) && (a>=a);
        boolean zz0 = (c>c) || (a<=a);
        boolean zz10 = (x>a) && (c==d);
        boolean zz11 = (c>a) && (x>d);
        System.out.println(zz);
        System.out.println(zz1);
        System.out.println(zz2);




    }
}
