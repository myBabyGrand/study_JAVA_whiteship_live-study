package week09_exception;

import java.io.IOException;

public class exceptionTest06 {
    public static void main(String[] args) throws ParamNullValuePosition {
        String chapion = "Ashe";
        String position = "Juggler";
        setPostion(chapion, position);
    }
    static void setPostion(String nm, String position)throws PositionException, ParamNullValuePosition{
        if(nm== null || position == null){
            throw new ParamNullValuePosition("parameter is null");
        }

        if(nm == "Ashe"  && position != "AdCarry"){
            throw new PositionException("invalid position");
        }
        System.out.println(nm +", "+position);

    }
}
//unchecked
class PositionException extends RuntimeException{
    public PositionException (String msg){
        super(msg);
    }
}

//checked
class ParamNullValuePosition extends Exception{
    public ParamNullValuePosition (String msg){
        super(msg);
    }
}