import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {

    private long code;
    private String name;
    private String type;
    private boolean isDiscount;
    private ArrayList<String> ingredients;
    private double price;

    public Product(long code, String name, String type, boolean isDiscount, ArrayList<String> ingredients, double price) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.isDiscount = isDiscount;
        this.ingredients = ingredients;
        this.price = price;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
