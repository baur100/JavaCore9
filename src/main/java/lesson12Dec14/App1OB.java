package lesson12Dec14;

public class App1OB {
    public static void main(String[] args) {

        // REFERENCE VS PRIMITIVE TYPE:
// In reference type you're  not creating a new memory, you're creating a reference to the olg variable.
        int a = 5;
        int b = a;

        b = 6;
        System.out.println("a="+a+"b="+b);

        FruitOB f1 = new FruitOB("Apple");
        FruitOB f2 = f1;
         f2.setName("Pineapple");
        System.out.println("Fruit 1 "+f1.getName()+" Fruit 2 "+ f2.getName());

        int[] arr = {1,1,2};
        int[] arr2 = arr;
        arr2[0] = 5;
        System.out.println(arr[0]);


    }
}
