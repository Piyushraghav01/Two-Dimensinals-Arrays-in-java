import java.util.Scanner;

class takeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the no. of columns: ");
        int cols = sc.nextInt();

        int A[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element at A["+i+"]["+j+"]");
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
