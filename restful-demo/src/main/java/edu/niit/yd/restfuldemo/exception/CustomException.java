package edu.niit.yd.restfuldemo.exception;

import edu.niit.yd.restfuldemo.common.ExceptionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author ABC
 * @date 2020/3/26 8:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CustomException extends RuntimeException {
    protected Integer code;
    protected String message;

    public CustomException(ExceptionType type) {
        this.code = type.getCode();
        this.message = type.getMsg();
    }
}
