package animals;

public class Cat extends Animal {

    private boolean satiety;
    private int countEat;

    public Cat(String name, int countEat, boolean satiety) {
        super(name);
        this.countEat=countEat;
        this.satiety=satiety;
    }

    @Override
    public void run (int obstacleLength) {

        if (obstacleLength >200) {
            System.out.println( "Кот не может пробежать больше 200 метров.");
        } else {
            System.out.println(  super.getName()+" пробежал " + obstacleLength +" м.");

        }

    }
    @Override
    public void swim (int obstacleLength) {

            System.out.println( "Кот не умеет плавать.");


    }

    public void eat(Dish dish) {

        satiety= dish.eatFromDish(countEat);

    }
    public void isSatietyCat(){

        if( satiety) {
            System.out.println( super.getName()+" сытый" );
        }else {
            System.out.println( super.getName()+" хочу еще кушоц" );
        }
    }
}
