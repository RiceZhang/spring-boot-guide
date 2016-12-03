package org.github.guide.exception;

import org.github.guide.dto.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 *  使用Spring MVC的@ControllerAdvice注解做Json的异常处理
 *
 * Created by R on 2016/12/4.
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 系统异常
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }

    /**
     * 数据异常
     *
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(ErrorInfo.ERROR);
        r.setData("Some Data");
        r.setUrl(req.getRequestURL().toString());
        return r;
    }

}
