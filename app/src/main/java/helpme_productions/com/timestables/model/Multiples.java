package helpme_productions.com.timestables.model;



public class Multiples {
    private int first;
    private int second;
    private int product;

    public Multiples(int first, int second, int product) {
        this.first = first;
        this.second = second;
        this.product = product;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getProduct() {
        return product;
    }
}
