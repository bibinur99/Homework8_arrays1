import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Task One:");
        int [] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = i+1;
        }
        double [] arr2 = {1.57, 7.654, 9.986};
        String [] arr3 = {"A", "B", "C", "D"};
    }

    public static void task2() {
        System.out.println("Task Two:");
        int [] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = i+1;
        }
        double [] arr2 = {1.57, 7.654, 9.986};
        char [] arr3 = {'A', 'B', 'C', 'D'};
        // print out all the elements
        for (int i = 0; i < 3; i++) {
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
        for (int j=0; j<arr2.length; j++){
            System.out.print(arr2[j]+ " ");
        }
        System.out.println();
        for (char c:arr3) {
            System.out.print(c+ " ");
        }
        System.out.println();
        }

    public static void task3() {
        System.out.println("Task Three: reverse");
        int [] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = i+1;
        }
        double [] arr2 = {1.57, 7.654, 9.986};
        char [] arr3 = {'A', 'B', 'C', 'D'};
        for (int i = 2; i>=0; i--) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int j= arr2.length -1; j>=0; j--){
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
        for (int k = arr3.length -1; k>=0; k--){
            System.out.print(arr3[k]+" ");
        }
        System.out.println();
        }

        public static void task4() {
        System.out.println("Task Four:");
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = i + 1;
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }



}