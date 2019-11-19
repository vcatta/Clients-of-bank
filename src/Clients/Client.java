package Clients;

import java.util.Arrays;

public abstract class Client {

    private String numberAccount;
    private double balance;

    public Client()
    {
        setNumberAccount();
        balance = 0;
    }

    private void setNumberAccount()
    {
        int[] digitsOfAccount = new int[20];
        for(int i = 0; i < digitsOfAccount.length; i++)
        {
            int randomDigit = (int)Math.round(Math.random() * 9);
            digitsOfAccount[i] = randomDigit;
        }
        numberAccount = Arrays.toString(digitsOfAccount).replaceAll("[^0-9]", "");
    }
    public String getNumberAccount()
    {
        return numberAccount;
    }

    public double getBalance()
    {
        return balance;
    }

    public void addMoney(Double sumAddition)
    {
        balance += sumAddition;
        System.out.println("На счет зачислено " + sumAddition + " руб. Баланс: " + getBalance() + " руб.");
    }


    public void takeAwayMoney(Double sumRemoval)
    {
        if(balance == 0 | sumRemoval > balance)
        {
            System.out.println("Попытка снятия. Недостаточно средств!");
        }
        else
        {
            balance -= sumRemoval;
            System.out.println("Сумма списания: " + sumRemoval + " руб. Баланс: " + getBalance() + " руб.");
        }
    }

}
