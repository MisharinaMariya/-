package animals;

public class Dish {
    private int countEat;

    public Dish(int countEat){
        this.countEat=countEat;

    }


    public boolean eatFromDish(int countEating){
        if (countEating <= countEat) {
            countEat= countEat-countEating;
            return true;
        } else {
            return false;
        }

    }
    public void addEat( int count){
        countEat=count+countEat;

    }
}
