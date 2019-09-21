package exception;

/**
 * @description:自定义异常信息
 * @author: daixiongkun
 * @time: 2019-09-21 14:58
 */
public class customsException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private String errorCode;

    public customsException(String message) {
        super(message);
    }

    public customsException(String errorCode,String message){
        super(message);
        setErrorCode(errorCode);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
