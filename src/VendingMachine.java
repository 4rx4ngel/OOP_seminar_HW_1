import java.util.ArrayList;

public interface VendingMachine {
    public void InitProducts(ArrayList<HotBeverage> list);

    public HotBeverage GetProducts(String name);

    public HotBeverage GetProducts(String name, Integer volume, Integer temp);
}
