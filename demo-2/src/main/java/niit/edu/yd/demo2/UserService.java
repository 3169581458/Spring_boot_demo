package niit.edu.yd.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author ABC
 * @date 2020/3/16 10:44
 */
@Service
public class UserService {
    @Value("米饭")
    private String sth;

    @Autowired(required = true)
    private UserDao userDao;

    public String sayHello(String name) {
        return "Hello" + name;
    }

    public void eat() {
        System.out.println("eat:" + sth);
    }

    public void save() {
        System.out.println("UserService保存用户。。。。");
        userDao.save();
    }

}
