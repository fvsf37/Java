public class Sedan extends Car{
    private int length;

    public Sedan() {
    }

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public double getSalePrice (){
        if (length > 2000){
            return getRegularPrice()*0.95;
        }else {
            return getRegularPrice()*0.9;
        }
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "length=" + length +
                '}';
    }
}
