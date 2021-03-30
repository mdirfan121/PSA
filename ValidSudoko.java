public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isValidSudoku(final String[] A) {
        Set<Character> overall=new HashSet<Character>();
        Set<Character> row=new HashSet<Character>();
        Set<Character> col=new HashSet<Character>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(A[i].charAt(j)!='.'){
                   if(row.contains(A[i].charAt(j))){
                       return 0;
                    }
                    row.add(A[i].charAt(j));
                }
            }
            row.clear();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(A[j].charAt(i)!='.'){
                   if(col.contains(A[j].charAt(i))){
                       return 0;
                    }
                    col.add(A[j].charAt(i));
                }
            }
            col.clear();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        if(A[i*3+k].charAt(j*3+l)!='.'){
                            if(overall.contains(A[i*3+k].charAt(j*3+l))){
                                return 0;
                            }
                            else overall.add(A[i*3+k].charAt(j*3+l));
                        }
                    }
                }
                overall.clear();
            }
        }
        return 1;
    }
}
