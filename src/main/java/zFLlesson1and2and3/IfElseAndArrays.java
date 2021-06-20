package zFLlesson1and2and3;

public class IfElseAndArrays {
    public static void main(String[] args) {
        int a = 20;
        if (a>=21){
            System.out.println("Legal age");
        }else{
            System.out.println("Come back later, please");
            }

        System.out.println("--------------------------------------");

        int[] b = {2,44,56,78};
        System.out.println(b[1]);
        b[1] = 5;
        System.out.println(b[1]);

        String[] c = {"Red","Green","Blue","Gray","White","Black"};
        System.out.println("C array length="+c.length);
        System.out.println("1st element="+c[0]+", "+(c.length-1)+" element(last)="+c[c.length-1]);

        for (int i=0; i<c.length ;i++){
            System.out.print(c[i]+" ");
        }

        int[] newArray = new int[5];
        newArray[0] = 5;
        newArray[1] = 44;
        newArray[2] = 32;
        newArray[3] = 88;
        newArray[4] = -100;

        System.out.println();
        int x=0;
        while (x < newArray.length){
            System.out.print (newArray[x]+" ");
            x++;
        }
        System.out.println();
         for (int i=newArray.length-1;i>=0;i--){
             System.out.print(newArray[i]+" ");
         }
        System.out.println();

         for (String i:c){
             System.out.print(i+" ");
         }


    }
}
