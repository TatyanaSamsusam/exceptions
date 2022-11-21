import java.util.Scanner;

/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

public class homework_sem1 {
    public static int[] getDiff(int[] args1, int[]args2) throws Exception {

        int [] diff_arr = new int [args1.length];
        for (int i = 0; i < args1.length; i++) {
            diff_arr[i] = args2[i] - args1[i];     
        }     
        return diff_arr;
    }

    public static int[] fillArray(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите размер массива: "); 
        int size = input.nextInt();
        int[] newArray1 = new int[size];
        System.out.println("введите элементы массива: ");
        for (int i = 0; i < newArray1.length; i++) {
            newArray1[i] = input.nextInt();
        }
        System.out.println("вот массив: ");
        for (int i = 0; i < size; i++) {
            System.out.println(newArray1[i]);
        }
        return newArray1;
    }
    public static void main(String[] args) throws Exception{
        try {
        int[] myArray1 = fillArray(args); 
        int[] myArray2 = fillArray(args);
        if (myArray1.length-myArray2.length !=0) throw new Exception("размеры двух массивов должны быть одинаковыми!");
            int[] result = getDiff(myArray1, myArray2);
            System.out.println("вот новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке ");
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    

}
