package concrete;

import handler.SupportHandler;
import support.Request;
import support.RequestType;

public class Specialist extends SupportHandler{
    
    public Specialist() {
        super(RequestType.SPECIALIST);
    }
    
    @Override
    protected void processRequest(Request request){
        System.out.println("El especialista procesó: "+ request.getDescription());
    }

    @Override
    protected String getHandlerName(){
        return "Especialista";
    }
}
