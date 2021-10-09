package test.java.utils.stream;

/**
 * @author daxue0929
 * @date 2021/9/25
 */


public class Apple {

    public String color;
    public int weight;

    public Apple(final String color, final int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public Apple setColor(final String color) {
        this.color = color;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Apple setWeight(final int weight) {
        this.weight = weight;
        return this;
    }

    public boolean isGreen() {
        return "green".equals(this.getColor());
    }
}
