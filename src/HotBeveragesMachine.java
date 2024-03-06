import java.util.ArrayList;
import java.util.List;

public class HotBeveragesMachine implements VendingMachine{
    List<HotBeverage> listOfCoffee = new ArrayList<>();

    @Override
    public void InitProducts(ArrayList<HotBeverage> list) {
        listOfCoffee = list;
    }
    @Override
    public HotBeverage GetProducts(String name) {
        for (int i = 0; i < listOfCoffee.size(); i++) {
            if (listOfCoffee.get(i).nameOfProduct.equals(name)) {
                return listOfCoffee.get(i);
            }
        }
        return null;
    }
    @Override
    public HotBeverage GetProducts(String name, Integer volume, Integer temp) {
        for (int i = 0; i < listOfCoffee.size(); i++) {
            if (listOfCoffee.get(i).nameOfProduct.equals(name)) {
                if (listOfCoffee.get(i).volume.equals(volume)){
                    if (listOfCoffee.get(i).temp.equals(temp)){
                        return listOfCoffee.get(i);
                    }
                }
            }
        }
        return null;
    }
}
