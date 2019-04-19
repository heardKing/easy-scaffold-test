package com.cuixx.es.sys.user.exception;

import com.cuixx.es.common.exception.BaseException;

public class UserException extends BaseException {

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }

}
