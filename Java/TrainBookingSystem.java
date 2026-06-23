import java.util.*;

public class TrainBookingSystem {

    public static void AvailableChecking(int[] arr) {
        int availableSeats = available(arr);
        System.out.println("No. of available seats: " + availableSeats);

        if (availableSeats == 0) {
            System.out.println("No seats available.");
        } else if (availableSeats == arr.length) {
            System.out.println("Train compartment is empty.");
        }

        int[] seat = availseat(arr, availableSeats);
        System.out.println("Available seat numbers: " + Arrays.toString(seat));
    }

    public static void Booking(int[] arr, int num) {
        if (num < 1 || num > arr.length) {
            System.out.println("Invalid seat number. Please choose between 1 and " + arr.length + ".");
            return;
        }
        if (arr[num - 1] == 0) {
            arr[num - 1] = 1;
            System.out.println("Your seat " + num + " has been booked successfully!");
        } else {
            System.out.println(" Seat " + num + " is already booked.");
        }
    }

    public static int[] availseat(int[] arr, int n) {
        int[] n_arr = new int[n];
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                n_arr[ind] = i + 1;
                ind++;
            }
        }
        return n_arr;
    }

    public static int available(int[] arr) {
        int count = 0;
        for (int var : arr) {
            if (var == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 0, 0, 1, 0, 1, 0, 0, 1, 0}; // 10 seats
        boolean bo = true;

        while (bo) {
            System.out.println("\n=== Train Booking Menu ===");
            System.out.println("1. Check Available Seats");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    AvailableChecking(arr);
                    break;
                case 2:
                    System.out.print("Enter the seat number to book: ");
                    int a = sc.nextInt();
                    Booking(arr, a);
                    System.out.println("Seats available after booking:");
                    AvailableChecking(arr);
                    break;
                case 3:
                    bo = false;
                    break;
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }

        System.out.println("🙏 Thank you for using our Train Booking System.");
        sc.close();
    }
}
