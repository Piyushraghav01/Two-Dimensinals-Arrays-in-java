class Print2dArray {
    public static void main(String[] args) {
        //2-d Array
        int A[][] = new int[3][4];
        //int B[][] = {{1,2,3},{4,5,6},{7,8,9}};
  
        for(int i = 0; i<3;i++){//Loop over Rows
            for(int j = 0; j<4; j++){//Loop over columns
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println(A);  
        // System.out.println(A[0]);
        // System.out.println(A[1]);
        // System.out.println(A[2]);
        
    }
}
