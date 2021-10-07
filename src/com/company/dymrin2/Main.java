package com.company.dymrin2;


public class Main {

    /*
    Jewels and Stones
    jewels: символы уникальны, каждый символ символизирут тип драгоценного камня.
Регистр имеет значение.
stones: камни, среди которых могут встречаться драгоценные.
Метод должне вернуть количество драгоценых камней в строке stones.
    */
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

    /*
    Robot Return to Origin
Есть робот на плоскости. Он может двигаться на 1 шаг в стороны:
R (right), L (left), U (up), and D (down)
Задана последовательность движений, вернуть true если оне вернется в исходную точку.
    */

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
