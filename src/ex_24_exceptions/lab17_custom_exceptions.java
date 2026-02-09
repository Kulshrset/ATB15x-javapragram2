package ex_24_exceptions;

public class lab17_custom_exceptions {
    private String currency;
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer add(Bank bankname){
        return bankname.amount+this.amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }




}
