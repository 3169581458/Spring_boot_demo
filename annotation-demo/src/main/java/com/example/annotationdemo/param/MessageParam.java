package com.example.annotationdemo.param;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ABC
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class MessageParam extends PageParam{
    private Integer msgId;
    private String msgText;
    private String msgSummary;
}
