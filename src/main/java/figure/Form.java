package figure;

public interface Form {
    double PI=3.14;

    default double getPerimeter() {
        return 12.5;
    }
    default double getSquare(){
      return 25.7;

    }

    default void console(){
        System.out.println(getPerimeter());
        System.out.println(getSquare());

    }

}
