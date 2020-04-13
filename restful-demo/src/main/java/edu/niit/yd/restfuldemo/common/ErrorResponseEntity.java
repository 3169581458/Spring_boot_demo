package edu.niit.yd.restfuldemo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ABC
 * @date 2020/3/26 8:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponseEntity {
    private int code;
    private String message;
}
