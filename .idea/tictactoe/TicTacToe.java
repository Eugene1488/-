package tictactoe;


import java.util.Scanner;

public class TicTacToe {


    private static char[] cells = new char[9];


    public static void main(String[] args) {
        System.out.print("Enter cells: ");
        grid();
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        if (in.length() < 9) {
            return in.substring(0, 9);
        } else {
            return in;
        }
    }

    public static char[] strToArray() {
        cells = input().toCharArray();
        return cells;
    }

    public static void grid() {
        strToArray();
        System.out.println("---------");
        System.out.println("|" + " " + cells[0] + " " + cells[1] + " " + cells[2] + " " + "|");
        System.out.println("|" + " " + cells[3] + " " + cells[4] + " " + cells[5] + " " + "|");
        System.out.println("|" + " " + cells[6] + " " + cells[7] + " " + cells[8] + " " + "|");
        System.out.println("---------");
    }

}
