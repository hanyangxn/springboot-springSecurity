package com.hanyang.demo.springbootsecurity.exception;

import com.hanyang.demo.springbootsecurity.bean.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fanyuli on 2018/5/14.
 */
@ControllerAdvice
public class AuthAdvice {
    @ExceptionHandler(AuthException.class)
    @ResponseBody
    public R handleAuthException(final AuthException ex) {
        R rt = new R();
        rt.setRetCode("-1");
        rt.setRetMsg(ex.getMessage());
        return rt;
    }
}
