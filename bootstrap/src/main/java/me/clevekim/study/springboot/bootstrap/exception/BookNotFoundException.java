package me.clevekim.study.springboot.bootstrap.exception;

import lombok.NoArgsConstructor;

/**
 * Created by younghwan.kim@linecorp.com on 2019-04-08
 */
public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException() {
        super();
    }

    public BookNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BookNotFoundException(final String message) {
        super(message);
    }

    public BookNotFoundException(final Throwable cause) {
        super(cause);
    }
}