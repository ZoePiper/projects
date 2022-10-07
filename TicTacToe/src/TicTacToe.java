import java.util.*;

//bron: https://www.youtube.com/watch?v=gQb3dE-y1S4
public class TicTacToe {
    //global all the methods know it,
    static ArrayList<Integer> playerpostions = new ArrayList<Integer>();
    static ArrayList<Integer> cpupostions = new ArrayList<Integer>();


    public static void main(String[] args) {

        // gameboard 2d array [][]
        // 3 rows and 3 columns
        // characters will be filled in
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        // loops forever, repeat action
        while (true) {
            // Get input from user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter you placement (1-9): ");
            int playerPos = scanner.nextInt();
            //Check if position is taken,repeat action
            while (playerpostions.contains(playerPos)|| cpupostions.contains(playerPos)){
                System.out.println("Postion taken. Try again");
                playerPos= scanner.nextInt();
            }

            // Test to print what the input is
           // System.out.println(playerPos);
            placePiece(gameBoard, playerPos, "player");

            String result = checkWinner();
            if (result.length()>0){
                System.out.println(result);
                break;
            }

            // Computer may place random an element)
            Random rand = new Random();
            // position between 1 and 9
            int cpuPos = rand.nextInt(9) + 1;
            //Check if position is taken, repeat action
            while (playerpostions.contains(cpuPos) || cpupostions.contains(cpuPos)) {
                 cpuPos = rand.nextInt(9) + 1;
            }

            placePiece(gameBoard, cpuPos, "cpu");

            printGameBoard(gameBoard);

             result = checkWinner();
            if (result.length()>0){
                System.out.println(result);
                break;
            }
        }


    }//End Main

    // location of gameboard, position and who is playing
    public static void placePiece(char[][] gameBoard, int pos, String user) {
        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
            playerpostions.add(pos);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpupostions.add(pos);
        }


        switch (pos) {
            case 1:
                //start with row and then column
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        // shorthand loop
        // for each row inside the gameboard
        // for each char inside the row
        // print out
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    // When do you win? On these positions
    public static String checkWinner() {
        // win condition
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(3, 5, 7);

        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

// if player contains all the postions of the toprow you win.
        for (List l : winning) {
            if (playerpostions.containsAll(l)) {
                return " Congrates you won!!! :)";
            } else if (cpupostions.containsAll(l)) {
                return " Computer wins!!! Sorry";
            } else if (playerpostions.size() + cpupostions.size() == 9) {
                return "CAT!";
            }
        }
        return "";
    }
}



