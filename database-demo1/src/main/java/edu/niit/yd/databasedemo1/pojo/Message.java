package edu.niit.yd.databasedemo1.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : zhayh
 * @date : 2020-2-18 09:08
 * @description : Message的持久层对象Persisent Object
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {
    //    private Long id;
//    private String text;
//    private String summary;
    private Integer msgId;
    private String msgText;
    private String msgSummary;
}
