package com.pickpack.memberservice.exception;

import com.pickpack.memberservice.api.commonApi.ErrorApi;
import com.pickpack.memberservice.exception.custom.AlreadyJoinException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomApiExcetion {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(AlreadyJoinException.class)
    public ResponseEntity<?> apiException(AlreadyJoinException e){
        log.error(e.getMessage());
        return new ResponseEntity<>(new ErrorApi("동일한 닉네임이 이미 존재합니다."), HttpStatus.BAD_REQUEST);
    }

}