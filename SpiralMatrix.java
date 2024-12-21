public class SpiralMatrix {

    public static void spiralPrint(int A[][]) {
        int rows = A.length;
        int cols = A[0].length;

        int left = 0, right = cols - 1;
        int top = 0, bottom = rows - 1;

        while (left <= right && top <= bottom) {

            // left-right
            for (int i = left; i <= right; i++) {
                System.out.print(A[top][i] + " ");
            }
            top++;

            // top-bottom

            for (int i = top; i <= bottom; i++) {
                System.out.print(A[i][right] + " ");
            }
            right--;

            if (top <= bottom) {

                for (int i = right; i >= left; i--) {
                    System.out.print(A[bottom][i] + " ");
                }
            }
            bottom--;

            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    System.out.print(A[i][left] + " ");
                }
            }
            left++;
        }

    }

    public static void main(String[] args) {
        int A[][] = { { 1, 2, 3, 4, 5, 6 },
                { 18, 19, 20, 21, 22, 7 },
                { 17, 28, 29, 30, 23, 8 },
                { 16, 27, 26, 25, 24, 9 },
                { 15, 14, 13, 12, 11, 10 }
        };

        spiralPrint(A);
    }

}

// { { 1, 2, 3, 4, 5, 6 },
// { 18, 19, 20, 21, 22, 7 },
// { 17, 28, 29, 30, 23, 8 },
// { 16, 27, 26, 25, 24, 9 },
// { 15, 14, 13, 12, 11, 10 }
// }