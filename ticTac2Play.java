
import java.util.*;
public class ticTac2Play{
    private Scanner console;
    private String[][] board =  new String [3][3];
    //private Sorts mySorts;
    //private String listType;
    int count=0;

    public ticTac2Play(){
        console = new Scanner(System.in);
        //mySorts = new Sorts();
        //board = null;
        //listType = "Integer";
    }

    public void sortMenu(){
        
        String choice;
        String print;
        fillBoard();

        System.out.println("2 Player---> Enter 1");
        System.out.println("Computer ---> Enter 2");
        choice=console.next();
        if(choice.equals(1+"")){
            do{
                System.out.println();
                System.out.print("Choice---->");
                choice = console.next() + " ";

                if ('1' <= choice.charAt(0) && choice.charAt(0) <= '9'){
                    System.out.println();
                    switch (choice.charAt(0)){
                        case '1':
                        if(board[0][0].equals( "X") || board[0][0].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(1);
                        screenOutput();
                        stop();
                        break;
                        case '2':
                        if(board[0][1].equals( "X") || board[0][1].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(2);
                        screenOutput();
                        stop();
                        break;
                        case '3':
                        if(board[0][2].equals( "X") || board[0][2].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(3);
                        screenOutput();
                        stop();
                        break;
                        case '4':
                        if(board[1][0].equals( "X") || board[1][0].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(4);
                        screenOutput();
                        stop();
                        break;
                        case '5':
                        if(board[1][1].equals( "X") || board[1][1].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(5);
                        screenOutput();
                        stop();
                        break;         
                        case '6':
                        if(board[1][2].equals( "X") || board[1][2].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(6);
                        screenOutput();
                        stop();
                        break;      
                        case '7':
                        if(board[2][0].equals( "X") || board[2][0].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(7);
                        screenOutput();
                        stop();
                        break; 
                        case '8':
                        if(board[2][1].equals( "X") || board[2][1].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(8);
                        screenOutput();
                        stop();
                        break;
                        case '9':
                        if(board[2][2].equals( "X") || board[2][2].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(9);
                        screenOutput();
                        stop();
                        break;
                    }

                }
            } while (stop());
        }   
        if(choice.equals(2+"")){
            do{

                System.out.println();

                if ('0' <= choice.charAt(0) && choice.charAt(0) <= '9'){
                    if(count%2==0){
                        choice=console.next() + "";
                    }

                    if(count%2==1){
                        choice= (Math.random()*9)+ 1 + "";

                    }
                    System.out.println();
                    switch (choice.charAt(0)){
                        case '1':
                        if(board[0][0].equals( "X") || board[0][0].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(1);
                        screenOutput();
                        stop();
                        break;
                        case '2':
                        if(board[0][1].equals( "X") || board[0][1].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(2);
                        screenOutput();
                        stop();
                        break;
                        case '3':
                        if(board[0][2].equals( "X") || board[0][2].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(3);
                        screenOutput();
                        stop();
                        break;
                        case '4':
                        if(board[1][0].equals( "X") || board[1][0].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(4);
                        screenOutput();
                        stop();
                        break;
                        case '5':
                        if(board[1][1].equals( "X") || board[1][1].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(5);
                        screenOutput();
                        stop();
                        break;         
                        case '6':
                        if(board[1][2].equals( "X") || board[1][2].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(6);
                        screenOutput();
                        stop();
                        break;      
                        case '7':
                        if(board[2][0].equals( "X") || board[2][0].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(7);
                        screenOutput();
                        stop();
                        break; 
                        case '8':
                        if(board[2][1].equals( "X") || board[2][1].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(8);
                        screenOutput();
                        stop();
                        break;
                        case '9':
                        if(board[2][2].equals( "X") || board[2][2].equals("O")) {
                            System.out.println("Spot is taken. Retry new spot.");
                            break;
                        }
                        change(9);
                        screenOutput();
                        stop();
                        break;
                    }

                }
            } while (stop());
        }
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
    public void createArray(){
        String choice = console.next()+" ";
        int n = Integer.parseInt(choice.substring(0,choice.indexOf(" ")));
        board = new String [n][n];
    }
    private boolean checkO(){
        //row 1
        if((board[0][0].equals("O"))&& (board[0][1].equals("O")&&(board[0][1].equals("O")))){
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

            System.out.println("Game Over: Player 1 wins!");
            System.out.println("Do you want to play again? If yes, two player method, enter 1. If computer, enter 2.");
            fillBoard();
                String choice = console.next() + " ";
                if(choice.equals(1+"")){
                 count =0;
                 sortMenu();
                }
                if(choice.equals(2+"")){
                    count=0;
                    sortMenu();
                }
            return false;
        }
        if (checkO()){

            System.out.println("Game Over: Player 2 wins!");
            System.out.println("Do you want to play again?  If yes, two player method, enter 1. If computer, enter 2.");
            fillBoard();
                String choice = console.next() + " ";
                if(choice.equals(1+"")){
                 count =0;
                 sortMenu();
                }
                if(choice.equals(2+"")){
                    count=0;
                    sortMenu();
                }
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
            System.out.println("");
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