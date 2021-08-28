package com.company;

    public class Main {

        public static void main(String[] args) {
            /*boolean gameOver = true;
            int score = 800; PODE-SE USAR TANTO O NOME DA VARIAVEL QUANTO
            int levelCompleted = 5; USAR O UM NUMERO LITERAL
            int bonus;*/

            int highScore = calculateScore(true, 1000, 5, 100);
            int positionHS = calculateHighScore(highScore);
            displayHighScorePosition("Enrico", positionHS, highScore);

            int highScore2 = calculateScore(true, 900, 5, 100);
            int positionHS2 = calculateHighScore(highScore2);
            displayHighScorePosition("Gabi", positionHS2, highScore2);

            int highScore3 = calculateScore(true, 400, 5, 100);
            int positionHS3 = calculateHighScore(highScore3);
            displayHighScorePosition("Lua", positionHS3, highScore3);

            int highScore4 = calculateScore(true, 50, 5, 100);
            int positionHS4 = calculateHighScore(highScore4);
            displayHighScorePosition("Igor", positionHS4, highScore4);

        }

        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


            if (gameOver == true) {
                int finalScore = score;
                return finalScore;
                } else {
                return -1;
            }
        }


        public static void displayHighScorePosition (String pName,int positionHS, int score) {
            if (pName != null && positionHS != -1) {
                System.out.println("Player " + pName + " chegou em " + positionHS + " lugar, com " + score + " pontos!");
            }
        }

        public static int calculateHighScore (int playerScore) {
            int posicao = 0;
            if (playerScore >= 1000) {
                posicao++;
                return posicao;
            } else if (playerScore >= 500) {
                posicao = 2;
                return posicao;
            } else if (playerScore >= 100 ) {
                posicao = 3;
                return posicao;
            } else {
                posicao = 4;
                return posicao;
            }
        }
    }

