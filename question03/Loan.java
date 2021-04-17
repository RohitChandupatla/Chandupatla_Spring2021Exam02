/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public class Loan {
     private long id;
    private float loanAmount;

    public Loan(long id, float loanAmount) {
        this.id = id;
        this.loanAmount = loanAmount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", loanAmount=" + loanAmount +
                '}';
    }
}

    
