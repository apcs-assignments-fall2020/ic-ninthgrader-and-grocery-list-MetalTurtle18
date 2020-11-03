import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> list;

    public GroceryList() {
        this.list = new ArrayList<>();
    }

    public void add(String item) {
        this.list.add(item);
    }

    public void remove(String item) {
        this.list.remove(item);
    }

    @Override
    public String toString() {
        return "Grocery List: " + this.list.toString().substring(1, this.list.toString().length()-1);
    }
}