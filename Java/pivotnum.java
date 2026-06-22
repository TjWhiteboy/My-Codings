import java.util.*;

public class pivotnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int pivot = sc.nextInt();
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }
        for (int num : less) {
            System.out.print(num + " ");
        }
        for (int num : equal) {
            System.out.print(num + " ");
        }
        for (int num : greater) {
            System.out.print(num + " ");
        }
    }
}