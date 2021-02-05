package ksk.graphs;

import java.io.File;
import java.util.Scanner;

public class MazeFileReader {

    private int[][] map;
    private String fileName;
    private int numOfRows;
    private int numOfColumns;
    private int startPositionCol; // the start index of the 2 "start point"  colIndex
    private int startPositionRow; // start index of the 2 "start point" rowIndex

    public MazeFileReader(String fileName, int numOfRows, int numOfColumns) {
        this.fileName = fileName;
        this.numOfColumns = numOfColumns;
        this.numOfRows = numOfRows;
        this.map = new int[numOfRows][numOfColumns];
    }

    public void parseFile() {

        map = new int[][]{
                {
                        1, 1, 1, 1, 1
                },
                {
                        1, 2, 0, 1, 1
                },
                {
                        1, 0, 0, 1, 1
                },
                {
                        1, 0, 0, 3, 1
                },
                {
                        1, 1, 1, 1, 1
                }
        };
        startPositionRow =1;
        startPositionCol =1;


//        try {
//            Scanner scanner = new Scanner(new File(this.fileName));
//            for (int i = 0; i < this.numOfRows; i++) {
//                for (int j = 0; j < this.numOfColumns; j++) {
//                    map[i][j] = scanner.nextInt();     // read the integers from the file
//                    if (map[i][j] == 2) {   // we have found the 2 so save the col and row indexes !!!
//                        startPositionCol = j;
//                        startPositionRow = i;
//                    }
//                }
//            }
//            scanner.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public int getStartPositionCol() {
        return startPositionCol;
    }

    public int getStartPositionRow() {
        return startPositionRow;
    }

    public int[][] getMap() {
        return this.map;
    }


}
