/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

public class homework_sem1 {
    public static int[] getDiff(int[] args1, int[]args2) throws Exception {

        int [] diff_arr = new int [args1.length];
        for (int i = 0; i < args1.length; i++) {
            diff_arr[i] = args2[i] - args1[i];     
        }
        if (diff_arr.length > args1.length) throw new Exception("-2");       
        return diff_arr;
    }
    public static void main(String[] args) {
        int[] newArray1 = new int [] {1,2,3,4,5}; 
        int[] newArray2 = new int [] {5,6,7,8,9};
        try {
            int[] result = getDiff(newArray2, newArray1);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
