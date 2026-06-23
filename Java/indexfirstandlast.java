//Print the index of first and first and last occrence of given target value
public class indexfirstandlast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6, 3};
        int target = 3;
        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i; 
            }
        }

        System.out.println("First occurrence of " + target + " is at index: " + first);
        System.out.println("Last occurrence of " + target + " is at index: " + last);
    }
    
}

