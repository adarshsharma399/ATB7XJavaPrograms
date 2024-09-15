package ex_18082024;

public class Bank {
    private String currency;
    private Integer amount;

    //Parameterized Constructor
    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

//    public Integer add(Bank bankName){   //this will throw exception when currency is not same
//        Integer sum = this.amount + bankName.amount;
//        return sum;
//    }

    public Integer add(Bank bankName) throws Exception {
        if (!bankName.currency.equalsIgnoreCase("INR")) {
            //throw exception that is not supported - USD +INR
            try {
                throw new Exception("Currency doesn't match!"); //This is a custom exception as there is logic mismatch
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        Integer sum = this.amount + bankName.amount;
        return sum;
    }

}
//Refer Lab153