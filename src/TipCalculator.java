public class TipCalculator {
    private double bill;
    private double tip;
    private int party;

    public TipCalculator(double bill,double tip,int party){
        this.bill = bill;
        this.party = party;
        this.tip = tip;
    }
    public double totalTipAmount(){
        return bill*tip;
    }

    public double totalBill(){
        return bill + (bill*tip);
    }

    public double totalTipPerPerson(){
        return (bill*tip)/party;
    }

    public double totalBillPerPerson(){
        return (bill+(bill*tip))/party;
    }

    public String toString(){
         return ("Total Bill Cost: " + totalBill() + "\n" + "Total Tip Amount: " + totalTipAmount() + "\n" + "Total Bill Per Person: " + totalBillPerPerson() + "\n" + "Total Tip per Person: " + totalTipPerPerson())  ;
    }
}
