package edu.niit.yd.databasedemo1.repository;

import edu.niit.yd.databasedemo1.pojo.Message;
import edu.niit.yd.databasedemo1.repository.MessageRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ABC
 * @date 2020/4/2 9:02
 */
@Slf4j
@SpringBootTest
public class MessageRepositoryTest {
    @Autowired
    MessageRepository messageRepository;

    @Test
    @Order(1)
    public void testInsert() {
        Message message = Message.builder().msgText("niit").msgSummary("学校").build();
        int num = messageRepository.insert(message);
        log.info("num---->" + num);
    }

    @Test
    public void testFindAll() {
        messageRepository.findAll().forEach(
                message -> log.info("message---->" + message.toString())
        );
    }

    @Test
    public void testFindById() {
        log.info(messageRepository.findById(1).toString());
    }

    @Test
    public void testDelete() {
        int num = messageRepository.delete(2);
        log.info("num---->" + num);
    }

    @Test
    public void testUpdate() {
        Message message = Message.builder().msgId(1).msgText("qwe").msgSummary("eqw").build();
        int num = messageRepository.update(message);
        log.info("num---->" + num);
    }

    @Test
    public void testUpdateText() {
        Message message = Message.builder().msgId(1).msgText("asd").build();
        int num = messageRepository.updateText(message);
        log.info("num---->" + num);
    }

    @Test
    public void testBatchInsert() {
        Message message = Message.builder().msgText("123").msgSummary("321").build();
        Message message2 = Message.builder().msgText("345").msgSummary("345").build();

        List<Message> list = new ArrayList<>();
        list.add(message);
        list.add(message2);
        int[] ints = messageRepository.batchInsert(list);
        log.info("num----->" + ints.length);
    }
}
