package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Bin implements Good {
    List<Good> goods = new ArrayList<>();
    public void addGood(Good good){
        goods.add(good);
    }
    public void removeGood(Good good){
        goods.remove(good);
    }
    @Override
    public void show() {
        goods.forEach(Good::show);
    }
}
