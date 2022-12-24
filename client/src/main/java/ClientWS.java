import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        int amount = 10;
        BanqueService stub = new BanqueServiceService().getBanqueServicePort();
        System.out.println(amount + " Euro to MAD");
        System.out.println(stub.conversion(amount));
        System.out.println("-----------------------------------------------------------");
        List<Compte> accountList = stub.getComptes();
        System.out.println("All accounts");
        for (Compte account : accountList)
            System.out.println("Compte{code = " + account.getCode() + ", solde = " + String.format("%.2f" ,account.getSolde()) + "}");

    }
}
