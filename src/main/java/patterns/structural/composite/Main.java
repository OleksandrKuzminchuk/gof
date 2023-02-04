package patterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        Good good = new Cucumber();
        Good good1 = new Orange();
        Good good2 = new Cucumber();

        Good good3 = new Cucumber();
        Good good4 = new Orange();

        Bin bin1 = new Bin();
        bin1.addGood(good);
        bin1.addGood(good1);
        bin1.addGood(good2);
        Bin bin2 = new Bin();
        bin2.addGood(good3);
        bin2.addGood(good4);

        Bin bin3 = new Bin();
        bin3.addGood(bin1);
        bin3.addGood(bin2);

        bin3.show();
    }
}
