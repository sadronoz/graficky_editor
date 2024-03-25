package src.component;

public class Circle extends BaseComponent{
    int x, y, width, height;

    public Circle(int x, int y, int size){
        setX(x);
        setY(y);
        setWidth(size);
    }
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
