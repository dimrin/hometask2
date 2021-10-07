package com.company.dymrin2;


public class Main {

    public static void main(String[] args) {

    }

    public int numJewelsInStones(String jewels, String stones) {
        int numberOfJewels = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(Character.toString(stones.charAt(i))))
                numberOfJewels++;
        }
        return numberOfJewels;
    }


    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char move : moves.toCharArray()) {
            if (move == 'U') {
                y--;
            } else if (move == 'D') {
                y++;
            } else if (move == 'L') {
                x--;
            } else if (move == 'R') {
                x++;
            }
        }
        return x == 0 && y == 0;
    }


}
