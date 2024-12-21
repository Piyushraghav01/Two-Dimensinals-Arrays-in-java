class JaggedArrays {
    public static void main(String[] args) {
        int Arr[][] = new int[3][];

        System.out.println(Arr);

        Arr[0] = new int[5];
        Arr[1] = new int[7];
        Arr[2] = new int[10];

        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
        //System.out.println(Arr[0][0]);

        // int Arr2[][] = { { 1, 2, 3 }, { 4, 5, 6, 5, 8, 9 },{1,2} };

        for (int i = 0; i < Arr.length; i++) {
        for (int j = 0; j < Arr[i].length; j++) {
        System.out.print(Arr[i][j]+" ");
        }
        System.out.println();
        }
    }

}
