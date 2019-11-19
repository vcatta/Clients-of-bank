package Clients;

public class IndividualEntrepreneur extends Client {

    public IndividualEntrepreneur() {

        super();
        System.out.println("Зарегистрирован новый клиент.\nТип: индивидуальный предприниматель.\nРасчетный счет №: " + getNumberAccount());
    }

    @Override
    public void addMoney(Double sumAddition) {

        if(sumAddition < 1000)
        {
            double commission = sumAddition * 0.01;
            super.addMoney(sumAddition - commission);
            System.out.println("Комиссия за пополнение счета составила: " + commission + " руб.");
        }

        if(sumAddition >= 1000)
        {
            double commission = sumAddition * 0.005;
            super.addMoney(sumAddition - commission);
            System.out.println("Комиссия за пополнение счета составила: " + commission + " руб.");
        }

    }


}
