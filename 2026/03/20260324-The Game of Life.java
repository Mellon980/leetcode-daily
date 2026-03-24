class Solution {
    public void gameOfLife(int[][] board) {
        if(board==null||board.length==0)return;
        int n=board.length;
        int m=board[0].length;
        int [][]nextBoard=new int [n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               
                int liveNeighbors=allAround(board,i,j);
                
                if (board[i][j] == 1) {
                 
                    if (liveNeighbors == 2 || liveNeighbors == 3) {
                        nextBoard[i][j] = 1;
                    } else {
                        nextBoard[i][j] = 0;
                    }
                } else {
                   
                    if (liveNeighbors == 3) {
                        nextBoard[i][j] = 1;
                    } else {
                        nextBoard[i][j] = 0;
                    }
                }
            }
        }
        
       
        for (int i = 0; i < n; i++) {
            System.arraycopy(nextBoard[i], 0, board[i], 0, m);
        }
    }
      
    
    private int allAround(int [][]board,int x,int y){
        
        int count=0;
        int n=board.length;
        int m=board[0].length;
        
        int[][] dirs = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},          {0, 1},
            {1, -1},  {1, 0}, {1, 1}
        };

        for (int[] dir : dirs) {
            int i = x + dir[0];
            int j = y + dir[1];
          
            
            if (i >= 0 && i < n && j >= 0 && j < m && board[i][j] == 1) {
                count++;
            }
        }
        return count;
    }
}