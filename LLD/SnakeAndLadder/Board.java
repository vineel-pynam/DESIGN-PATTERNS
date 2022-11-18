import java.util.concurrent.ThreadLocalRandom;

public class Board{

    
    private Cell[][] cells;

    public Board( Integer boardSize, Integer noOfSnakes, Integer noOfLadders ){
        initialize(boardSize);
        addSnakesLadders(noOfSnakes, noOfLadders);
    }


    private void initialize(Integer boardSize){
        cells = new Cell[boardSize][boardSize];

        for( int i=0; i<boardSize; i++ ){
            for( int j=0; j<boardSize; j++ ){
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }


    private void addSnakesLadders(Integer noOfSnakes, Integer noOfLadders){
        int totalCells = (cells.length)*(cells.length) - 1;
        while( noOfSnakes > 0 ){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, totalCells);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, totalCells);

            if( snakeTail >= snakeHead ) continue;

            Jump jump = new Jump(snakeHead, snakeTail);
            Cell cell = getCell(snakeHead);
            cell.jump = jump;
            noOfSnakes--;
        }


        while( noOfLadders > 0 ){
            int ladderStart = ThreadLocalRandom.current().nextInt(1, totalCells);
            int LadderEnd = ThreadLocalRandom.current().nextInt(1, totalCells);

            if( ladderStart >= LadderEnd ) continue;

            Jump jump = new Jump(ladderStart, LadderEnd);
            Cell cell = getCell(ladderStart);
            cell.jump = jump;
            noOfLadders--;
        }
    }

    public Cell getCell(Integer playerPosition){
        int row = playerPosition / cells.length;
        int col = playerPosition % cells.length;
        return cells[row][col];
    }



}