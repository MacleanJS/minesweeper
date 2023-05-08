package mineSweeper;

import java.util.Random;

public class Game {
	
	private int[][] grid;
	private int[][] visGrid;
	private int sizeOfGrid;
	private int frequency;

	public Game() {
	        this.sizeOfGrid = 10;
	        this.frequency = 1;
	        this.grid = new int[sizeOfGrid][sizeOfGrid];
	        this.visGrid = new int[sizeOfGrid][sizeOfGrid];
	    }

	public void setSizeOfGrid(int sizeOfGrid) {
	        this.sizeOfGrid = sizeOfGrid;
	    }

	public void setFrequency(int frequency) {
	        this.frequency = frequency;
	    }

    public void setGrid() {
        Random rand = new Random();
        for (int i = 0; i <this.sizeOfGrid; i++) {
            for (int j = 0; j <this.sizeOfGrid; j++) {
                 grid[i][j] = rand.nextInt(10) < frequency ? 1 : 0;
                }
        }
    }
    
	public void setVisGrid() {
        for (int i = 0; i <this.sizeOfGrid; i++) {
            for (int j = 0; j <this.sizeOfGrid; j++) {
                 visGrid[i][j] = 0;
                }
        }
    }



    public void printVisGrid() {
        for (int i = 0; i <this.sizeOfGrid; i++) {
        	System.out.printf("%d ", i+1);
        }
        System.out.println("");
        for (int i = 0; i <this.sizeOfGrid; i++) {
        	System.out.print("__");
        }
        System.out.println("");
        
        
        for (int i = 0; i <this.sizeOfGrid; i++) {
            for (int j = 0; j <this.sizeOfGrid; j++) {
                System.out.print(this.visGrid[i][j] + " ");
            }
            System.out.print("|");
            System.out.println(i+1);

        }
    }
    
    public void printGrid() {
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        System.out.println("__");
        for (int i = 0; i <this.sizeOfGrid; i++) {
            for (int j = 0; j <this.sizeOfGrid; j++) {
                System.out.print(this.grid[i][j] + " ");
            }
            System.out.print("|");
            System.out.println(i+1);

        }
    }
    
	public int checkBomb(int x, int y) {
	        if (grid[y][x] == 1) {
	            System.out.println("Bomb - Game over!"); 
	            return 100; 
	        }
	        System.out.println("Clear");
	
	        return 0;
	    }

	public void checkAround(int x, int y) {
		int count = 0;
			for (int i = -1; i <= 1; i++) {
				for (int j = -1; j <= 1; j++) {
					if (i == 0 && j == 0) {
    	                continue; // Skip the current cell
    	            }
    	            int row = y + i;
    	            int col = x + j;
    	            if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == 1) {
    	                count++;
    	            }
    	        }
    	    }
    	    visGrid[y][x] = count;
    }

}