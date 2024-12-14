import java.util.Scanner;
public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element to be found");
        int n = sc.nextInt();
        System.out.println("enter the size of array");
        int x = sc.nextInt();
        int[] arr = new int[x];
        int t = arr.length;
        System.out.println("Enter the elements of the array");
        boolean flag = false;
        for (int i = 0; i< arr.length; i++) {
            
            arr[i] = sc.nextInt();

        }
        
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == n)
            {
                flag = true;
                break;
            }
        }
            if (flag == true)
            
                System.out.println("The element is present at index " + i );
            else
            
                System.out.println("Element not found in the array");

    

        }
    
}

    

