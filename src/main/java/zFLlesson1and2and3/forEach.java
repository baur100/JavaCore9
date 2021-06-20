package zFLlesson1and2and3;

public class forEach {
    public static void main(String[] args) {
        int[] array = {5,4,99,87,45,66,12,32,23,26};
        int min = array[0];
        for (int v: array){
            if (min>v){
                    min=v;
            }
        }
        System.out.println(min);
    }
}
