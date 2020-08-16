package com.jinshuo.mall.core.exception;

import com.jinshuo.mall.core.response.WrapperResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Date;

/**
 * @Classname JsExceptionHandler
 * @Description TODO
 * @Date 2019/6/20 15:40
 * @Created by dyh
 */
@Slf4j
public abstract class JsExceptionHandler {

    @ExceptionHandler({RuntimeException.class, Exception.class})
    @ResponseBody
    WrapperResponse unknowException(Exception e) {
        log.info(" ----->>>>>>>> Exception：" + new Date() + "：" + e.getMessage(), e);
        return WrapperResponse.fail(JsReturnCode.SYS100099.getCode(), JsReturnCode.SYS100099.getMsg());
    }

    @ExceptionHandler({NoHandlerFoundException.class})
    @ResponseBody
    WrapperResponse notFoundException(NoHandlerFoundException e) {
        log.info(" ----->>>>>>>> ExceptionHandler:" + e.getMessage(), e);
        return WrapperResponse.fail(JsReturnCode.SYS100001.getCode(), JsReturnCode.SYS100001.getMsg());
    }

    @ExceptionHandler(JsException.class)
    @ResponseBody
    WrapperResponse ymException(JsException e) {
        log.info(" ----->>>>>>>> 全局业务异常：" + new Date() + "：" + e.getErrorMsg(), e);
        return WrapperResponse.fail(e.getRetCode(), e.getRetMsg());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    WrapperResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        FieldError fieldError = e.getBindingResult().getFieldError();
        log.info(" ----->>>>>>>> 参数校验异常:{}({})" + new Date(), fieldError.getDefaultMessage(), fieldError.getField());
        return WrapperResponse.fail(JsReturnCode.SYS100008.getCode(), fieldError.getDefaultMessage());
    }

}
