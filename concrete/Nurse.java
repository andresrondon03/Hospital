package concrete;

import handler.SupportHandler;
import support.Request;
import support.RequestType;

public class Nurse extends SupportHandler{
    
    public Nurse() {
        super(RequestType.NURSE);
    }
    
    @Override
    protected void processRequest(Request request){
        System.out.println("La enfermera procesó: "+ request.getDescription());
    }

    @Override
    protected String getHandlerName(){
        return "Enfermera";
    }
}
