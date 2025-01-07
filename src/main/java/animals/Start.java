package animals;

public class Start {

    public static void main(String[] args) {
        int countCat = 0;
        int countDog = 0;
        int countAnimal = 0;
        Animal[] animals = new Animal[11];
        animals[0] = new Cat("Мурзик", 4,false);
        animals[1] = new Cat("Мурзик", 4,false);
        animals[2] = new Cat("Мурзик", 4,false);
        animals[3] = new Cat("Мурзик", 4,false);
        animals[4] = new Cat("Мурзик", 4,false);

        animals[5] = new Dog("");
        animals[6] = new Dog("");
        animals[7] = new Dog("");
        animals[8] = new Dog("");

        animals[9] = new Animal("");
        animals[10] = new Animal("");
        for (int i=0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                countCat++;
            } else if(animals[i] instanceof Dog) {
                countDog++;
            } else if(animals[i] instanceof Animal) {
                countAnimal++;
            }
        }
        System.out.println("Коты: " + countCat);
        System.out.println("Собаки: " + countDog);
        System.out.println("Животные: " + countAnimal);


        Cat[] array=new Cat[3];
        Cat cat1=new Cat("Мурзик", 4,false);
        Cat cat2=new Cat("Барсик", 2,false);
        Cat cat3=new Cat("Васька", 3,false);

        array[0]=cat1;
        array[1]=cat2;
        array[2]=cat3;

        Dish dish=new Dish(8);

        for (int i=0; i< array.length; i++){
            Cat c=array[i];
            c.eat(dish);
            c.isSatietyCat();
        }
    }


}
