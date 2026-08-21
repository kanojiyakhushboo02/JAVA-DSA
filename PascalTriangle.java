public class PascalTriangle {
    

    public static void main(String[] args) {
        // Main method implementation
        int n = 5;
        int [][] ans = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    ans[i][j] = 1;
                } else {
                    ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
                }
            }
        }
        // Print the Pascal's Triangle
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
