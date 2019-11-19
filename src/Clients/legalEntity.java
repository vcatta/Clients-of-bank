package Clients;

public class legalEntity extends Client {

    public legalEntity() {

        super();
        System.out.println("Зарегистрирован новый клиент.\nТип: юридическое лицо.\nРасчетный счет №: " + getNumberAccount());
    }

    @Override
    public void takeAwayMoney(Double sumRemoval) {
        double commission = 0.01;
        super.takeAwayMoney(sumRemoval * (1 + commission));
        if (sumRemoval > getBalance()) {
            System.out.println("Комиссия за снятие составила: " + sumRemoval * commission + " руб.");
        }
    }
}
