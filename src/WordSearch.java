
public class WordSearch {
	public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(exist(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }
    
    private boolean exist(char[][] board, String word, int i, int j, int start){
        if(start >= word.length()) return true;
        
        if(i<0 || i>=board.length || j<0 || j>= board[0].length) return false;
        
        if(board[i][j] == word.charAt(start) ){
            char c = board[i][j];
            board[i][j] = 'x';
            boolean result =  exist(board, word, i+1, j, start+1) || exist(board, word, i-1, j, start+1) 
                           || exist(board, word, i, j+1, start+1) || exist(board, word, i, j-1, start+1);
            board[i][j] = c; 
            return result;               
        }
        return false;
    }
}
