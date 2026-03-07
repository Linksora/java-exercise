import java.util.Arrays;

public class mylist {
    public static void main(String[] args) {
        // 1.数组声明方法
        int[] a = new int[10];

        // 2.数组基本处理：基本循环+for-each循环
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3.数组作为函数的参数
        System.out.println(sumArray(a));

        // 4.数组作为函数的返回值
        int[] b = createArray(5);

        // 5.多维数组
        // 类似cpp，略

        // 6.数组的静态方法
        boolean flag = Arrays.equals(a, b);
        System.out.println(flag);

        Arrays.fill(a, 0);

        int index = Arrays.binarySearch(a, 0);
        System.out.println(index);

        Arrays.sort(b);
    }

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}