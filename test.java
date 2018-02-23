
import java.util.*;
public class test{
    // instance variables - replace the example below with your own
    private String[][] board;
    private Scanner console;
    private int count;
    private int n;
    private int choiceNum;
    private String choice;
    private String print;

    public test() {
        console = new Scanner(System.in);
        count = 0;
    }

    public void sortMenu(){
        createArray();
        resetArray();
        System.out.println("Choice 1 = Computer v. Player");
        System.out.println("Choice 2 = Player v. Player");
        choice = console.next() + " ";
        if (choice.charAt(0) == '1') {
            screenOutput();
            computer();
        }
        if (choice.charAt(0) == '2') {
            screenOutput();
            player();
        }
    }

    private void player(){
        do{
            System.out.println();
            System.out.print("Choice ---> ");
            choice = console.next() + " ";
            choiceNum = Integer.parseInt(choice.substring(0, choice.indexOf(" ")));
            System.out.println(" ");
            if (empty(choiceNum))
                change(choiceNum);
            else
                System.out.println("Retry a Different Spot");
        } while (stop());

        boolean k = checkO();
        boolean j = checkX();
        if (k == true) 
            System.out.println("Player 2 Wins");
        else if (j == true)
            System.out.println("Player 1 Wins");
        else 
            System.out.println("Tie");

        System.out.println("Choice 1 --> Play Again");
        System.out.println("Choice 2 --> Stop Playing");
        choice = console.next() + " ";
        switch (choice.charAt(0)) {
            case '1':
            count = 0;
            sortMenu();
            break;
            case '2':
            break;
        }
    }
    private void computer(){
        do{
            System.out.println();
            System.out.print("Choice ---> ");
            
           
            System.out.println(" ");
            if (count % 2 == 1) {
                compMove();
                 choiceNum = Integer.parseInt(choice.substring(0, choice.indexOf(" ")));
        }
        if (count % 2 == 0) {
            choice = console.next() + " ";
            System.out.print("Choice ---> ");
             choiceNum = Integer.parseInt(choice.substring(0, choice.indexOf(" ")));
        }  
        if (empty(choiceNum))
                change(choiceNum);
            else
                System.out.println("Retry a Different Spot");
        } while (stop());

        boolean k = checkO();
        boolean j = checkX();
        if (k == true) 
            System.out.println("Player 2 Wins");
        else if (j == true)
            System.out.println("Player 1 Wins");
        else 
            System.out.println("Tie");

        System.out.println("Choice 1 --> Play Again");
        System.out.println("Choice 2 --> Stop Playing");
        choice = console.next() + " ";
        switch (choice.charAt(0)) {
            case '1':
            count = 0;
            sortMenu();
            break;
            case '2':
            break;
        }
    }
    private void createArray() {
        System.out.println("How big will your nxn board be?");
        String choice = console.next() + " ";
        n = Integer.parseInt(choice.substring(0, choice.indexOf(" ")));
        System.out.println(n);
        board= new String [n][n];
    }

    private boolean stop() {
        boolean k = checkO();
        if (k == true) 
            return false;
        k = checkX();
        if (k == true)
            return false;

        int cat = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i].equals(" O ") || board[j][i].equals(" X "))
                    cat++;
            }
        }
        if (cat == board.length*board.length)
            return false;

        return true;
    }

    private void change(int c) {
        if (count % 2 == 1) {
            board[(c-1)/n][(c-1)%n] = " O ";
        }
        if (count % 2 == 0) {
            board[(c-1)/n][(c-1)%n] = " X ";
        }
        count++;
        screenOutput();
    }

    private void resetArray(){
        int counts = 0;
        for (int loop = 0; loop < board.length; loop++){
            for (int loops = 0; loops < board[0].length; loops++) {
                counts++;
                board[loop][loops] = " " + counts + " ";
            }
        }
        System.out.println();
    }
    
    private void revert(int c){
        
                
                board[(c-1)/n][(c-1)%n] = c + "";
            
    }
    private int checkX(int n){
        int count = 0;
        return count;
    }

    private int checkO(int n){
        int count = 0;
        return count;
    }

    private boolean empty(int c) {
        if (board[(c-1)/n][(c-1)%n].equals(" X ") || board[(c-1)/n][(c-1)%n].equals(" O ")){
            return false;
        }else{
            return true;
        }
    }

    private boolean checkX() {
        int checkHor = 0;
        int checkVer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j].equals(" X ")){
                    checkHor++;
                }
                if (board[j][i].equals(" X ")){
                    checkVer++;
                }
                if (checkHor == n)
                    return true;
                if (checkVer == n)
                    return true;
            }
            checkHor = 0;
            checkVer = 0;
        }
        return false;
    }

    private boolean checkO() {
        int checkHor = 0;
        int checkVer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j].equals(" O ")){
                    checkHor++;
                }
                if (board[j][i].equals(" O ")){
                    checkVer++;
                }
                if (checkHor == n)
                    return true;
                if (checkVer == n)
                    return true;
            }
            checkHor = 0;
            checkVer = 0;
        }
        return false;
    }
    private void compMove(){
        int move =0 ;
        for(int i=0; i<n*n; i++){
           
                if(empty(i)){
                    change(i);
                }
                if(checkX()){
                    revert(i);
                }
        }
        
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

}