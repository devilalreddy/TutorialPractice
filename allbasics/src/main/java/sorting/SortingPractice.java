package sorting;

import org.jetbrains.annotations.NotNull;

public class SortingPractice {
    public static void main(String[] args) {
        int[]a = new int[5];
        a[0] = 10; a[1] = 30; a[2]= 05; a[3]=06; a[4]= 50;
        for (int data: a
             ) {
            System.out.println(data);
        }
//findMin(a);
       // System.out.println("Minimum Value:"+ a);

        // 2 dimentional array
        int arr[][] = new int[10][10000];
        arr[0][0] = 10;
        arr[0][1] =50;
       // arr[0][2] = 30;
       // arr[1][1] =20;
        System.out.println("size:" + arr.length);
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arr[i][j] + " ");
            }
            
        }
        for (int[] data: arr
             ) {
           // System.out.println("two dimentional array: "+data);
        }
    }

    private static void findMin(@NotNull int[] a) {
        int min = a[0];
        for (int i = 1; i<a.length;i++) {

            if (min>a[i]) {
                min =a[i];
            }
        }
        System.out.println("minimum value: : "+ min);
    }
}
