package khalid.echcherqaoui;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {

    @WebMethod
    public double conversion(@WebParam double mt){
        return mt * 10.85;
    }

    @WebMethod
    public Compte getCompte(int code){
        return new Compte(code, Math.random() * 5000, new Date());
    }

    @WebMethod
    public List<Compte> getComptes(){
        return List.of(
              new Compte(1, Math.random() * 5000,  new Date()),
              new Compte(2, Math.random() * 5000,  new Date()),
              new Compte(3, Math.random() * 5000,  new Date())
        );
    }


}
