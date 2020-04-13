package edu.niit.yd.restfuldemo.service.impl;

import edu.niit.yd.restfuldemo.pojo.Message;
import edu.niit.yd.restfuldemo.repository.MessageRepository;
import edu.niit.yd.restfuldemo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ABC
 * @date 2020/3/24 11:12
 */
@Service
public class MessageServiceImpl implements MessageService {
    private final MessageRepository repository;

    public MessageServiceImpl(MessageRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Message> findAll() {
        return repository.findAll();
    }

    @Override
    public Message findOne(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Message save(Message message) {
        return repository.save(message);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);

    }

    @Override
    public Message update(Message message) {
        return repository.update(message);
    }

    @Override
    public Message updateText(Message message) {
        return repository.updateText(message);
    }
}
