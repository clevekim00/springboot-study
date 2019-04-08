package me.clevekim.study.springboot.bootstrap.exception;

/**
 * Created by younghwan.kim@linecorp.com on 2019-04-08
 */
public class BookIdMismatchException extends RuntimeException {

    public BookIdMismatchException() {
        super();
    }

    public BookIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BookIdMismatchException(final String message) {
        super(message);
    }

    public BookIdMismatchException(final Throwable cause) {
        super(cause);
    }

}
