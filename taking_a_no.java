import java.util.Scanner;

/**
 * taking_a_no
 */
public class taking_a_no {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of Array = ");int n = sc.nextInt();

        int m = (n-1);

        int num[] = new int[n];

        // input array
        System.out.println("Input Array value: ");
        for (int i=0; i<=m; i++ ){ 
            System.out.print("Enter Array " + (i+1) +" value = ");num[i] = sc.nextInt();
        }

        // output array
        System.out.println("Print Array value: ");
        for (int i=0; i<=m; i++){
            System.out.print(num[i] + " ");
        }
    }
}