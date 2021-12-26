class Solution {
    public int[][] generateMatrix(int A) {
     
    int[][] result = new int[A][A];
    int k=1; 
    int top=0;
    int bottom=A-1;
    int left=0;
    int right=A-1;
 
    while(k<=A*A){
        for(int i=left; i<=right; i++){
            result[top][i]=k;
            k++;
        }    
        top++;
 
        for(int i=top; i<=bottom; i++){
            result[i][right]=k;
            k++;
        }
        right--;
 
        for(int i=right; i>=left; i--){
            result[bottom][i]=k;
            k++;
        }
        bottom--;
 
        for(int i=bottom; i>=top; i--){
            result[i][left] = k;
            k++;
        }
        left++;
    }
 
    return result;
    
    }
}
