package ExceptionMethod;

public class NaoSuportadaException extends RuntimeException{

    private String msg;

    public NaoSuportadaException(String msg){
        this.msg = msg;
    }

    @Override
    public String getMessage(){
        return this.msg;
    }

}
