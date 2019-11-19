import Clients.IndividualEntrepreneur;
import Clients.NaturalPerson;
import Clients.legalEntity;

public class Main {
    public static void main(String[] args) {

        NaturalPerson myClient = new NaturalPerson();
        myClient.addMoney(10000.0);
        myClient.takeAwayMoney(2000.0);
        myClient.addMoney(20000.00);
        System.out.println();

        legalEntity newLegal = new legalEntity();
        newLegal.addMoney(250000.00);
        newLegal.takeAwayMoney(250000.00);
        newLegal.takeAwayMoney(50000.00);
        newLegal.addMoney(350000.00);
        newLegal.takeAwayMoney(500000.00);
        System.out.println();


        IndividualEntrepreneur newIpClient = new IndividualEntrepreneur();
        newIpClient.addMoney(50000.00);
        newIpClient.takeAwayMoney(10000.00);
        newIpClient.addMoney(25000.00);
        newIpClient.addMoney(500.00);




    }
}
