// Naufal Jundi Abyan
// Teknologi Informasi I.1
// 19537141015
// P6


public class P6 {

    // Class variables
    public static Maze maze;
    public static int mazeWidth;
    public static int mazeHeight;

    public static void main(String[] args) {

        // Create maze
        String fileName = args[0];
        System.err.println("Maze name: " + fileName);

        // Get dimensions
        maze = new Maze(fileName);
        mazeWidth = maze.getWidth();
        mazeHeight = maze.getHeight();
        System.err.println("Maze width: " + mazeWidth);
        System.err.println("Maze height: " + mazeHeight);

        // Add code to move around maze
        for (int i = 0;i >= 0;i++) {
            // Moving right when the object reach an even colom, starts from 0 (0 is an even number)
            while (maze.getRow() % 2 == 0 && maze.getColumn() < maze.getWidth() - 1) {
                // Crazy Ivan Movement
                if (maze.moveRight() == false) {
                    maze.moveDown();
                    maze.moveRight();
                    maze.moveRight();
                    maze.moveUp();
                }
            }
            // Moving Downward when the object reach the corner
            maze.moveDown();

            // Moving left when the object reach an even row
            while (maze.getRow() % 2 == 1 && maze.getColumn() > 0) {
                // Gerakan Crasy Ivan
                if (maze.moveLeft() == false) {
                    maze.moveDown();
                    maze.moveLeft();
                    maze.moveLeft();
                    maze.moveUp();
                }
            }
            // Moving Downward when the object reach the corner
            maze.moveDown();
    }
}
}


// E:\kode\Minggu ke 6\P6>java P6 Maze1.txt
// Maze name: Maze1.txt
// Maze width: 6
// Maze height: 5
// Moved to row 0, column 1
// Moved to row 0, column 2
// Moved to row 0, column 3
// Moved to row 0, column 4
// Moved to row 0, column 5
// Firefly found Mal, congratulations!

// E:\kode\Minggu ke 6\P6>java P6 Maze2.txt
// Maze name: Maze2.txt
// Maze width: 6
// Maze height: 5
// Moved to row 0, column 1
// Moved to row 0, column 2
// Moved to row 0, column 3
// Moved to row 0, column 4
// Moved to row 0, column 5
// Moved to row 1, column 5
// Firefly found Mal, congratulations!


// E:\kode\Minggu ke 6\P6>java P6 Maze3.txt
// Maze name: Maze3.txt
// Maze width: 6
// Maze height: 5
// Moved to row 0, column 1
// Moved to row 0, column 2
// Moved to row 0, column 3
// Moved to row 0, column 4
// Moved to row 0, column 5
// Moved to row 1, column 5
// Moved to row 1, column 4
// Moved to row 1, column 3
// Moved to row 1, column 2
// Moved to row 1, column 1
// Firefly found Mal, congratulations!

// E:\kode\Minggu ke 6\P6>java P6 Maze4.txt
// Maze name: Maze4.txt
// Maze width: 6
// Maze height: 5
// Moved to row 0, column 1
// Moved to row 0, column 2
// Moved to row 0, column 3
// Moved to row 0, column 4
// Moved to row 0, column 5
// Moved to row 1, column 5
// Moved to row 1, column 4
// Moved to row 1, column 3
// Moved to row 1, column 2
// Moved to row 1, column 1
// Moved to row 1, column 0
// Moved to row 2, column 0
// Moved to row 2, column 1
// Moved to row 2, column 2
// Moved to row 2, column 3
// Moved to row 2, column 4
// Moved to row 2, column 5
// Moved to row 3, column 5
// Moved to row 3, column 4
// Moved to row 3, column 3
// Moved to row 3, column 2
// Moved to row 3, column 1
// Moved to row 3, column 0
// Moved to row 4, column 0
// Moved to row 4, column 1
// Moved to row 4, column 2
// Moved to row 4, column 3
// Moved to row 4, column 4
// Moved to row 4, column 5
// Firefly found Mal, congratulations!


// E:\kode\Minggu ke 6\P6>java P6 Maze5.txt
// Maze name: Maze5.txt
// Maze width: 8
// Maze height: 5
// Moved to row 0, column 1
// Moved to row 0, column 2
// Moved to row 1, column 2
// Moved to row 1, column 3
// Moved to row 1, column 4
// Moved to row 0, column 4
// Moved to row 0, column 5
// Moved to row 0, column 6
// Moved to row 0, column 7
// Firefly found Mal, congratulations!

// E:\kode\Minggu ke 6\P6>java P6 Maze6.txt
// Maze name: Maze6.txt
// Maze width: 8
// Maze height: 5
// Moved to row 0, column 1
// Moved to row 0, column 2
// Moved to row 0, column 3
// Moved to row 0, column 4
// Moved to row 0, column 5
// Moved to row 0, column 6
// Moved to row 0, column 7
// Moved to row 1, column 7
// Moved to row 1, column 6
// Moved to row 1, column 5
// Moved to row 2, column 5
// Moved to row 2, column 4
// Moved to row 2, column 3
// Moved to row 1, column 3
// Moved to row 1, column 2
// Moved to row 1, column 1
// Firefly found Mal, congratulations!

// E:\kode\Minggu ke 6\P6>java P6 HardMaze.txt
// Maze name: HardMaze.txt
// Maze width: 10
// Maze height: 10
// Moved to row 0, column 1
// Moved to row 0, column 2
// Moved to row 0, column 3
// Moved to row 0, column 4
// Moved to row 1, column 4
// Moved to row 1, column 5
// Moved to row 1, column 6
// Moved to row 0, column 6
// Moved to row 0, column 7
// Moved to row 0, column 8
// Moved to row 0, column 9
// Moved to row 1, column 9
// Moved to row 1, column 8
// Moved to row 1, column 7
// Moved to row 1, column 6
// Moved to row 1, column 5
// Moved to row 1, column 4
// Moved to row 1, column 3
// Moved to row 2, column 3
// Moved to row 2, column 2
// Moved to row 2, column 1
// Moved to row 1, column 1
// Moved to row 1, column 0
// Moved to row 2, column 0
// Moved to row 2, column 1
// Moved to row 2, column 2
// Moved to row 2, column 3
// Moved to row 2, column 4
// Moved to row 2, column 5
// Moved to row 2, column 6
// Moved to row 3, column 6
// Moved to row 3, column 7
// Moved to row 3, column 8
// Moved to row 2, column 8
// Moved to row 2, column 9
// Moved to row 3, column 9
// Moved to row 3, column 8
// Moved to row 3, column 7
// Moved to row 3, column 6
// Moved to row 4, column 6
// Moved to row 4, column 5
// Moved to row 4, column 4
// Moved to row 3, column 4
// Moved to row 3, column 3
// Moved to row 4, column 3
// Moved to row 4, column 2
// Moved to row 4, column 1
// Moved to row 3, column 1
// Moved to row 3, column 0
// Moved to row 4, column 0
// Moved to row 4, column 1
// Moved to row 4, column 2
// Moved to row 4, column 3
// Moved to row 4, column 4
// Moved to row 4, column 5
// Moved to row 4, column 6
// Moved to row 5, column 6
// Moved to row 5, column 7
// Moved to row 5, column 8
// Moved to row 4, column 8
// Moved to row 4, column 9
// Moved to row 5, column 9
// Moved to row 5, column 8
// Moved to row 5, column 7
// Moved to row 5, column 6
// Moved to row 5, column 5
// Moved to row 6, column 5
// Moved to row 6, column 4
// Moved to row 6, column 3
// Moved to row 5, column 3
// Moved to row 5, column 2
// Moved to row 5, column 1
// Moved to row 5, column 0
// Moved to row 6, column 0
// Moved to row 6, column 1
// Moved to row 7, column 1
// Moved to row 7, column 2
// Moved to row 7, column 3
// Moved to row 6, column 3
// Moved to row 6, column 4
// Moved to row 6, column 5
// Moved to row 7, column 5
// Moved to row 7, column 6
// Moved to row 7, column 7
// Moved to row 6, column 7
// Moved to row 6, column 8
// Moved to row 6, column 9
// Moved to row 7, column 9
// Moved to row 7, column 8
// Moved to row 7, column 7
// Moved to row 7, column 6
// Moved to row 7, column 5
// Moved to row 8, column 5
// Moved to row 8, column 4
// Moved to row 8, column 3
// Moved to row 7, column 3
// Moved to row 7, column 2
// Moved to row 7, column 1
// Moved to row 7, column 0
// Moved to row 8, column 0
// Moved to row 8, column 1
// Moved to row 9, column 1
// Moved to row 9, column 2
// Moved to row 9, column 3
// Moved to row 8, column 3
// Moved to row 8, column 4
// Moved to row 8, column 5
// Moved to row 8, column 6
// Moved to row 9, column 6
// Moved to row 9, column 7
// Moved to row 9, column 8
// Moved to row 8, column 8
// Moved to row 8, column 9
// Moved to row 9, column 9
// Moved to row 9, column 8
// Moved to row 9, column 7
// Moved to row 9, column 6
// Moved to row 9, column 5
// Moved to row 9, column 4
// Moved to row 9, column 3
// Moved to row 9, column 2
// Moved to row 9, column 1
// Moved to row 9, column 0
// Firefly found Mal, congratulations!