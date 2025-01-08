package figure;

public class Background implements Form {

    private String colorBackground;
    private String colorBorder;

    public Background(String colorBackground,String colorBorder){
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
    }

    @Override
    public String getColorBackground() {
        return colorBackground;
    }

    @Override
    public String getColorBorder() {
        return colorBorder;
    }
}
