package figure;

public abstract class Background {

    private String colorBackground;
    private String colorBorder;

    public Background(String colorBackground,String colorBorder){
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
    }


    public String getColorBackground() {
        return colorBackground;
    }


    public String getColorBorder() {
        return colorBorder;
    }
}
