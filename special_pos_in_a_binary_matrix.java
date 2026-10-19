class Solution {
    public int numSpecial(int[][] mat) {
        int row=mat.length;
        int cols=mat[0].length;
        int count=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==1){
                    int rowCount=0;
                    int colsCount=0;

                    for(int k=0;k<cols;k++){
                        if(mat[i][k]==1){
                            rowCount++;
                        }
                    }
                    for(int k=0;k<row;k++){
                        if(mat[k][j]==1){
                            colsCount++;
                        }
                    }
                    if(rowCount == 1 && colsCount==1){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
