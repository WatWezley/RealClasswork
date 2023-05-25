package Exceptions;

public class UserNotInExistence extends Throwable{
    public UserNotInExistence(String message){
        super(message);
    }
}
