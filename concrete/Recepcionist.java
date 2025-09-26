package concrete;

import handler.SupportHandler;
import support.Request;
import support.RequestType;

public class Recepcionist extends SupportHandler{
    
    public Recepcionist() {
        super(RequestType.RECEPCIONIST);
    }
    
    @Override
    protected void processRequest(Request request){
        System.out.println("El recepcionista procesó: "+ request.getDescription());
    }

    @Override
    protected String getHandlerName(){
        return "Recepcionista";
    }
}
