public class HotBeverage extends Product {
    Integer temp;

    @Override
    public String toString() {
        return "Напиток: " + nameOfProduct +
                ", объём: " + volume +
                " мл, температура: " + temp + " градусов.";

        }
    }

