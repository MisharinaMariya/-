package animals;

public class Animal {
    private String name;

    public Animal(String name){
        this.name=name;
    }


    public void run (int obstacleLength) {
        System.out.println( "Пробежал " + obstacleLength +" м.");
    }

    public void swim (int obstacleLength) {
        System.out.println( "Проплыл " + obstacleLength +" м.");
    }

    public String getName(){
        return name;

    }
}
