package github.adeniltonarcanjo.gameawards.service.exception;

public class BusinessException extends RuntimeException{
    private static final long sarialVersion=1L;

    public BusinessException(String message) {
        super(message);
    }
}
