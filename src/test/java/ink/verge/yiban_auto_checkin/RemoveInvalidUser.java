package ink.verge.yiban_auto_checkin;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author Verge
 * @Date 2020/12/6 12:57
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class RemoveInvalidUser {
    /*@Autowired
    private YibanUtils yibanUtils;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SymmetricCrypto aes;
    @Test
    public void remove(){
        List<User> userList = userMapper.selectByExample(new UserExample());
        for (User user : userList) {
            String password = aes.decryptStr(user.getPassword());
            if (!yibanUtils.verifyAccount(user.getAccount(),password)){
                userMapper.deleteByPrimaryKey(user.getUid());
                log.info("已删除: "+user.getAccount());
            }
        }
    }*/

}
