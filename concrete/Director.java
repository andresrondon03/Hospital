package concrete;

import handler.SupportHandler;
import support.Request;
import support.RequestType;

public class Director extends SupportHandler{
    
    public Director() {
        super(RequestType.DIRECTOR);
    }
    
    @Override
    protected void processRequest(Request request){
        System.out.println("El director médico procesó: "+ request.getDescription());
    }

    @Override
    protected String getHandlerName(){
        return "Director médico";
    }
}
