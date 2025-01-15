package animals;

public class Dog extends Animal {
    private static int count=0;

    public Dog(String name) {
        super(name);
        add();
    }

    @Override
    public void run (int obstacleLength) {

        if (obstacleLength >500) {
            System.out.println( "Собака не может пробежать больше 500 метров.");
        } else {
            System.out.println(super.getName()+ " пробежал " + obstacleLength +" м.");

        }

    }

    @Override
    public void swim (int obstacleLength) {

        if (obstacleLength >10) {
            System.out.println( "Собака не может проплыть больше 10 метров.");
        } else {
            System.out.println( super.getName()+" проплыл " + obstacleLength +" м.");

        }

    }
    @Override
    public void add (){
        super.add();
        count++;
    }
    public static int getCount(){
        return count;
    }
}
