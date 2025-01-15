import animals.Animal;
import animals.Cat;
import animals.Dish;
import animals.Dog;
import figure.Circle;
import figure.Form;
import figure.Rectangle;
import figure.Triangle;

public class Start {

    public static void main(String[] args) {

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


        System.out.println("Коты: " + Cat.getCount());
        System.out.println("Собаки: " + Dog.getCount());
        System.out.println("Животные: " + Animal.getCount());


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

        Form[] forms=new Form[3];
        forms[0]=new Circle("красный", "синий", 7);
        forms[1]=new Rectangle("красный", "синий", 7, 7);
        forms[2]=new Triangle("красный", "синий", 7,7,7);

        for (int i=0; i<forms.length; i++){
            Form f=forms[i];
            f.console();
        }

    }


}
