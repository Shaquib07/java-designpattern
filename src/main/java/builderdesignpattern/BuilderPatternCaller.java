package builderdesignpattern;

public class BuilderPatternCaller {

    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount.Builder("678786868","Shaquib")
                .email("contact@gmail.com")
                .phoneNumber("0987655678")
                .build();

        System.out.println("account created :: "+ bankAccount.toString());
    }
}
