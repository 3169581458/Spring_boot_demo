package edu.niit.yd.restfuldemo.repository;

import edu.niit.yd.restfuldemo.pojo.Message;

import java.util.List;

/**
 * @author ABC
 * @date 2020/3/24 11:12
 */
public interface MessageRepository {
    List<Message> findAll();

    Message findOne(Long id);

    Message save(Message message);

    void delete(Long id);

    Message update(Message message);

    Message updateText(Message message);
}
