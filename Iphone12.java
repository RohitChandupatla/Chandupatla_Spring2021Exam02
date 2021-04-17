
import question04.Iphone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542423
 */
public class Iphone12 extends Iphone {
      private boolean fiveG = true;

    public Iphone12(String color, long imeiNumber) {
        super(color, imeiNumber);
    }

    public boolean isFiveG() {
        return fiveG;
    }

    public void setFiveG(boolean fiveG) {
        this.fiveG = fiveG;
    }
}

    
