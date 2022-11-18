import java.util.concurrent.ThreadLocalRandom;

public class Dice{

    Integer diceCount;
    Integer min = 1;
    Integer max = 6;

    public Dice(Integer diceCount){
        this.diceCount = diceCount;
    }


    public Integer rollDice(){
        Integer totalSum = 0;
        Integer diceUsed = 0;

        while( diceUsed < diceCount ){
            totalSum += ThreadLocalRandom.current().nextInt(min, max+1);
            diceUsed++;
        }

        return totalSum;
    }

}