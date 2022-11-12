class Solution {
    public char[][] rotateTheBox(char[][] box) {
          int m = box.length;
            int n = box[0].length;
            char[][] res = new char[n][m];

            for(int i=0; i<m; i++){
                    int bottom=n-1;
                    for(int j=n-1; j>=0; j--){
                            res[j][m-i-1] = '.';
                            if(box[i][j]=='#'){
                                    res[bottom--][m-i-1] = '#';
                            }
                            else if(box[i][j]=='*'){
                                    res[j][m-i-1] = '*';
                                    bottom = j-1;
                            }
                           
                            
                    }
            }

            return res;
    }
}