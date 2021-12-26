class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     ArrayList<Integer> arr = new ArrayList<Integer>();   
    int top=0;
    int bottom=matrix.length-1;
    int left=0;
    int right=matrix[0].length-1;
    int k=0;
    int max = matrix[0].length*matrix.length;
    while(k<max){
        for(int i=left; i<=right; i++){
            if(k<max){
              arr.add(matrix[top][i]);
              k++;   
            }
        }    
        top++;
 
        for(int i=top; i<=bottom; i++){
            if(k<max){
                arr.add(matrix[i][right]);
                k++;
            }
        }
        right--;
 
        for(int i=right; i>=left; i--){
            if(k<max){
                arr.add(matrix[bottom][i]);
                k++;
            }
        }
        bottom--;
 
        for(int i=bottom; i>=top; i--){
            if(k<max){
                arr.add(matrix[i][left]);
                k++;
            }
        }
        left++;
    }
 
    return arr;
    }
}
