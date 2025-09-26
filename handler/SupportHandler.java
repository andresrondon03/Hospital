package handler;

import support.Request;
import support.RequestType;

public abstract class SupportHandler implements Handler {
    protected Handler nextHandler;
    protected RequestType supportedType;
    
    protected SupportHandler(RequestType supportedType){
        this.supportedType = supportedType;
    }

    @Override
    public Handler setNext(Handler nextHandler){
        this.nextHandler = nextHandler;
        return this;
    }

    @Override 
    public Handler getNext(){
        return this.nextHandler;
    }

    @Override
    public void handleRequest(Request request){
        if(canHandle(request)){
            processRequest(request);
        } else {
            passsToNext(request);
        }
    }
    
    @Override
    public boolean canHandle(Request request){
        return request != null && request.getType() == supportedType;
    }

    protected abstract void processRequest(Request request);

    protected void passsToNext(Request request){
        if(nextHandler != null){
            System.out.println(getHandlerName() + " no maneja solicitudes " + request.getType() + ", pasa la solicitud.");
            nextHandler.handleRequest(request);
        } else {
            System.out.println("La solicitud " + request.getType() + " no pudo ser manejada por ningun manejador.");
        }
    }

    protected String getHandlerName(){
        return this.getClass().getSimpleName();
    }
}
