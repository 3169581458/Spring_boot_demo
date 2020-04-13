package edu.niit.yd.databasedemo1.repository.impl;

import edu.niit.yd.databasedemo1.pojo.Message;
import edu.niit.yd.databasedemo1.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author : zhayh
 * @date : 2020-2-18 09:13
 * @description : Message的数据接口实现类
 */


public class MessageRepositoryImpl implements MessageRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Message> findAll() {
        String querySql = "select * from message";
        return jdbcTemplate.query(querySql, (rs, rowNum) ->
                Message.builder()
                        .msgId(rs.getInt("msg_id"))
                        .msgText(rs.getString("msg_text"))
                        .msgSummary(rs.getString("msg_summary"))
                        .build());
    }

    @Override
    public Message findById(Integer id) {
        String querySql = "select * from message where msg_id=?";
        return jdbcTemplate.queryForObject(querySql, new Object[]{id}, new BeanPropertyRowMapper<>(Message.class));
    }

    @Override
    public int insert(Message message) {
        String sql = "insert into message(msg_text,msg_summary) values(?,?)";
        return jdbcTemplate.update(sql, message.getMsgText(), message.getMsgSummary());
    }

    @Override
    public int delete(Integer id) {
        String sql = "delete from message where msg_id=?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int update(Message message) {
        String sql = "update message set msg_text=?,msg_summary=? where msg_id=?";
        return jdbcTemplate.update(sql, message.getMsgText(), message.getMsgSummary(), message.getMsgId());
    }

    @Override
    public int updateText(Message message) {
        String sql = "update message set msg_text=? where msg_id=?";
        return jdbcTemplate.update(sql, message.getMsgText(), message.getMsgId());
    }

    @Override
    public int[] batchInsert(List<Message> messages) {
        String sql = "insert into message(msg_text,msg_summary) values(?,?)";
        return jdbcTemplate.batchUpdate(sql,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                        preparedStatement.setString(1, messages.get(i).getMsgText());
                        preparedStatement.setString(2, messages.get(i).getMsgSummary());
                    }

                    @Override
                    public int getBatchSize() {
                        return messages.size();
                    }
                });
    }
}