package com.myproject.aop;

import com.myproject.aop.entity.BizException;
import com.myproject.aop.entity.CommonEnum;
import com.myproject.aop.entity.GlobalResponseBody;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    Logger logger = LogManager.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public GlobalResponseBody bizExceptionHandler(HttpServletRequest req, BizException e){
        logger.error("发生业务异常！原因是：{}",e.getErrorMsg());
        return GlobalResponseBody.error(e.getErrorCode(),e.getErrorMsg());
    }


    /**
     * 处理空指针的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public GlobalResponseBody exceptionHandler(HttpServletRequest req, NullPointerException e){
        logger.error("发生空指针异常！原因是:",e);
        return GlobalResponseBody.error(CommonEnum.BODY_NOT_MATCH);
    }

    /**
     * 处理请求方法不支持的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =HttpRequestMethodNotSupportedException.class)
    @ResponseBody
    public GlobalResponseBody exceptionHandler(HttpServletRequest req, HttpRequestMethodNotSupportedException e){
        logger.error("发生请求方法不支持异常！原因是:",e);
        return GlobalResponseBody.error(CommonEnum.REQUEST_METHOD_SUPPORT_ERROR);
    }

    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public GlobalResponseBody exceptionHandler(HttpServletRequest req, Exception e){
        logger.error("未知异常！原因是:",e);
        return GlobalResponseBody.error(CommonEnum.INTERNAL_SERVER_ERROR);
    }



}

