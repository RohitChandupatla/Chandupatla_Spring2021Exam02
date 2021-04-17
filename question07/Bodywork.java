/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

/**
 *
 * @author S542423
 */
public enum Bodywork {
   

    PEN("pink", 2),
    PENCIL("blue", 19),
    PAPER("white", 5);
    private String color;
    private final int cost;

    private BookShop(String color, int cost) {
        this.color = color;
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

}
}

