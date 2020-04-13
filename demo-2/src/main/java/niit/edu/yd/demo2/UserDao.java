package niit.edu.yd.demo2;

import org.springframework.stereotype.Repository;

/**
 * @author ABC
 * @date 2020/3/16 10:44
 */
@Repository
public class UserDao {
    public void save() {
        System.out.println("UserDao保存用户。。。。");
    }
}
