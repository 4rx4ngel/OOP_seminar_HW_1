import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotBeverage coffee1 = new HotBeverage();
        coffee1.nameOfProduct = "Cappuccino";
        coffee1.volume = 200;
        coffee1.temp = 60;
        HotBeverage coffee2 = new HotBeverage();
        coffee2.nameOfProduct = "Espresso";
        coffee2.volume = 60;
        coffee2.temp = 65;
        HotBeverage coffee3 = new HotBeverage();
        coffee3.nameOfProduct = "Latte";
        coffee3.volume = 250;
        coffee3.temp = 58;
        HotBeveragesMachine hotBeveragesMachine = new HotBeveragesMachine();
        ArrayList<HotBeverage> coffees = new ArrayList<>(List.of(coffee1, coffee2, coffee3));
        hotBeveragesMachine.InitProducts(coffees);
        System.out.println(hotBeveragesMachine.GetProducts("Espresso"));
        System.out.println(hotBeveragesMachine.GetProducts("Latte"));
        System.out.println(hotBeveragesMachine.GetProducts("Cappuccino", 200, 60));
    }
}