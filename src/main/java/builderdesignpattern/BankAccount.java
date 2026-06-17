package builderdesignpattern;

public class BankAccount {
    private String bankAccount;
    private String customerName;
    private String phoneNumber;
    private String email;

    public String getBankAccount() {
        return bankAccount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankAccount='" + bankAccount + '\'' +
                ", customerName='" + customerName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    BankAccount (Builder builder){
        this.bankAccount=builder.bankAccount;
        this.customerName=builder.customerName;
        this.email=builder.email;
        this.phoneNumber=builder.phoneNumber;
    }

    public static class Builder{
        private String bankAccount;
        private String customerName;
        private String phoneNumber;
        private String email;

        //Mandatory fields in constructor
        public Builder(String bankAccount,String customerName){
            this.bankAccount=bankAccount;
            this.customerName=customerName;
        }
        //Non-Mandatory fields with method chaining
        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber=phoneNumber;
            return this;
        }

        public Builder email(String email){
            this.email=email;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(this);
        }
    }
}
