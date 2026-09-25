import java.util.Arrays;

public class Produkter {
    String name;
    double price;
    String[] tags;

    Produkter(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;


    }

    boolean hastag(String tag) {
        for(String x : tags){
            if (x.equals((tag))){
                return true;

            }
        }
        return false;
    }



    @Override
    public String toString() {
        return name + " - " + price + " kr - " + Arrays.toString(tags);




    }


}

