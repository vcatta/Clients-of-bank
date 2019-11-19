package Clients;

public class NaturalPerson extends Client {

    public NaturalPerson() {

        super();
        System.out.println("Зарегистрирован новый клиент.\nТип: физическое лицо.\nРасчетный счет №: " + getNumberAccount());
    }

    }

