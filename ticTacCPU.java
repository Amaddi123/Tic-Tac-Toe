
import java.util.*;
public class ticTacCPU{
    private Scanner console;
    private String[][] board =  new String [3][3];
    //private Sorts mySorts;
    //private String listType;
    int count=0;

    public ticTacCPU(){
        console = new Scanner(System.in);
        //mySorts = new Sorts();
        //board = null;
        //listType = "Integer";
    }
    

    private boolean checkX(){

        //row 1
        if((board[0][0].equals("X"))&& (board[0][1].equals("X")&&(board[0][2].equals("X")))){
            return true;
        }
        //row 2
        if((board[1][0].equals("X"))&& (board[1][1].equals("X")&&(board[1][2].equals("X")))){
            return true;
        }
        //row 3
        if((board[2][0].equals("X"))&& (board[2][1].equals("X")&&(board[2][2].equals("X")))){
            return true;
        }   
        // col 1
        if((board[0][0].equals("X"))&& (board[1][0].equals("X")&&(board[2][0].equals("X")))){
            return true;
        }
        //col 2
        if((board[0][1].equals("X"))&& (board[1][1].equals("X")&&(board[2][1].equals("X")))){
            return true;
        }
        //col 3
        if((board[0][2].equals("X"))&& (board[1][2].equals("X")&&(board[2][2].equals("X")))){
            return true;
        }
        //diag 1
        if((board[0][0].equals("X"))&& (board[1][1].equals("X")&&(board[2][2].equals("X")))){
            return true;
        }
        //diag 2
        if((board[0][2].equals("X"))&& (board[1][1].equals("X")&&(board[2][0].equals("X")))){
            return true;
        }
        return false;
    }

    private boolean checkO(){
        //row 1
        if((board[0][0].equals("O"))&& (board[0][1].equals("O")&&(board[0][2].equals("O")))){
            return true;
        }
        //row 2
        if((board[1][0].equals("O"))&& (board[1][1].equals("O")&&(board[1][2].equals("O")))){
            return true;
        }
        //row 3
        if((board[2][0].equals("O"))&& (board[2][1].equals("O")&&(board[2][2].equals("O")))){
            return true;
        }   
        // col 1
        if((board[0][0].equals("O"))&& (board[1][0].equals("O")&&(board[2][0].equals("O")))){
            return true;
        }
        //col 2
        if((board[0][1].equals("O"))&& (board[1][1].equals("O")&&(board[2][1].equals("O")))){
            return true;
        }
        //col 3
        if((board[0][2].equals("O"))&& (board[1][2].equals("O")&&(board[2][2].equals("O")))){
            return true;
        }
        //diag 1
        if((board[0][0].equals("O"))&& (board[1][1].equals("O")&&(board[2][2].equals("O")))){
            return true;
        }
        //diag 2
        if((board[0][2].equals("O"))&& (board[1][1].equals("O")&&(board[2][0].equals("O")))){
            return true;
        }
        return false;
    }

    public boolean stop() {
        if (checkX()) {

            System.out.println("Game Over: You win!");
            System.out.println("Do you want to play again? If yes, enter 1. If not enter 2.");
            //if(console.next().equals(1)){
            //fillBoard();
            //screenOutput();

            //}
            return false;
        }
        if (checkO()){

            System.out.println("Game Over: Computer wins :( ");
            System.out.println("Do you want to play again? If yes, enter 1. If not enter 2.");
            //if(console.next().equals(1)){
            //fillBoard();
            //screenOutput();
            //}
            return false;     
        }
        int catsGame =0;
        for(int i=0;i< board.length; i++){
            for(int j =0; j<board[0].length;j++){
                if( board[i][j].equals("X") || board[i][j].equals("O")){
                    catsGame++; 
                }
            }
        }
        if(catsGame== 9){
            return false;
        }
        return true;
    }

    private void fillBoard(){
        int space=1;
        for (int i = 0; i < board.length; i++){
            for(int j=0; j<board[0].length;j++){
                board[i][j]= space + "";
                space++;
            }
        }
        screenOutput();
    }

    private void screenOutput(){
        for (int i = 0; i < board.length; i++){
            for(int j =0; j<board[0].length; j++){
                System.out.print("|   " + board[i][j]+"   |");
                //System.out.print(myArray.get(loop) + "  ");
            }
            System.out.println("---------------");
        }
        if(count==0){
                   System.out.println("Welcome to the terrific game of tic tac toe!");
                   System.out.println("You are X. CPU is O. Please make a choice."); 
                   
                }
        if(count%2 == 1){
                    System.out.print("It's the CPU's turn now.");
                    System.out.println("Please make a random choice which has not been taken yet.");
                    System.out.print("(Your choice will not affect the computer's move...");
                }
        if((count%2==0)&&(count>1)){
                   
                    System.out.print("Choice---->");
                    
                 }
    }

    private void change(int c){
        int rows = 0; 
        if(count%2 == 0){
            board[(c-1)/3][(c-1)%3]= "X";
        }
        if(count%2 ==1 ){
            board[(c-1)/3][(c-1)%3]= "O";
        }
        count++;        
    }

} 