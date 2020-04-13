package com.example.jpademo.service;

import com.example.jpademo.model.Message;

import java.util.List;

/**
 * @author ABC
 */
public interface MessageService {
    void save(Message message);
    void batchSave(List<Message> messages);

    void delete(Integer id);
    void batchDelete(List<Message> messages);
    void deleteAll();

    void update(Message message);
    void batchUpdate(List<Message> messages);

    long count();

    Message getMessage(Integer id);
    List<Message> getAll();
}
