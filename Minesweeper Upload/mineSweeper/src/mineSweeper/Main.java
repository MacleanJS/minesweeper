package mineSweeper;
import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
    	
        Game myGame = new Game();
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter grid size");
        int sizeOfGrid = s.nextInt(); 
        System.out.println("Please enter difficulty between 1-10");
        int difficulty = s.nextInt(); 

        myGame.setSizeOfGrid(sizeOfGrid);
        myGame.setFrequency(difficulty);
        myGame.setGrid();
        myGame.setVisGrid();

        int z = 0; 
        while (z<99) {
            myGame.printVisGrid();
//            myGame.printGrid();
            System.out.println("Please enter a new Y coordinate");
            int y = s.nextInt()-1; 
            System.out.println("Please enter a new X coordinate");
            int x = s.nextInt()-1; 
            z = myGame.checkBomb(x, y);
            myGame.checkAround(x, y); 
            }
        }
    }
