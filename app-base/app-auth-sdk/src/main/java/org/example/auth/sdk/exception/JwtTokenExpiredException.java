package org.example.auth.sdk.exception;

/**
 * Created by ace on 2017/9/15.
 */
public class JwtTokenExpiredException extends Exception {
    public JwtTokenExpiredException(String s) {
        super(s);
    }
}
