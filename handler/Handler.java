package handler;

import support.Request;

public interface Handler {
    Handler setNext(Handler nextHandler);
    void handleRequest(Request request);
    default boolean canHandle(Request request){
        return false;
    }
    Handler getNext();
}