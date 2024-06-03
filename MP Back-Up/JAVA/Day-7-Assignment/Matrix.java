public  class Matrix {
    private int[][] matrix;
    public Matrix(int rows, int columns){
        matrix=new int[rows][columns];
    }
    public void fillMatrix(int[][] values){
        if(values.length!=matrix.length || values[0].length !=matrix[0].length)
        {
            System.out.println("Error: Dimensions of provided values do not match matrix dimensions.");
            return;
        }
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length; j++){
                matrix[i][j]=values[i][j];
            }
        }
    }
    public static void main(String args[]){
        int[][] values ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        Matrix myMatrix = new Matrix(3,3);
        myMatrix.fillMatrix(values);
        for(int i=0;i<myMatrix.matrix.length;i++){
            for(int j=0;j<myMatrix.matrix[0].length;j++){
                System.out.println(myMatrix.matrix[i][j]+" ");
            }
            System.out.println();

            }
        }
        }
    
