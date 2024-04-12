public class EqualRowColumn {
    public static boolean checkRowColumn(int[] a, int[] b){
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    public int equalPairs(int[][] grid) {
        int out = 0;
        for(int i=0; i<grid.length; i++){


            for(int j=0; j<grid.length; j++){
                int[] a = new int[grid.length];
                for(int k=0; k<grid.length; k++){
                    a[k] = grid[k][j];
                }
                if(checkRowColumn(grid[i], a)){
                    out++;
                }
            }
        }
        return out;
    }
}
