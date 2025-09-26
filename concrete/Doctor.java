package concrete;

import handler.SupportHandler;
import support.Request;
import support.RequestType;

public class Doctor extends SupportHandler{
    
    public Doctor() {
        super(RequestType.DOCTOR);
    }
    
    @Override
    protected void processRequest(Request request){
        System.out.println("El médico general procesó: "+ request.getDescription());
    }

    @Override
    protected String getHandlerName(){
        return "Médico general";
    }
}
