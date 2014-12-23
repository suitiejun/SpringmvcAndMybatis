import com.shinowit.dao.mapper.UserinfoMapper;
import com.shinowit.entity.Userinfo;
import com.shinowit.entity.UserinfoCriteria;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class UserinfoTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private UserinfoMapper userinfoMapper;

    @Test
    public void test(){
            List<Userinfo> list=userinfoMapper.selectPage(2,5);
            for (Userinfo user:list){
                System.out.println(user.getUsername());
            }

//        UserinfoCriteria criteria=new UserinfoCriteria();//查询
//        UserinfoCriteria.Criteria tiaojian=criteria.createCriteria();
//            tiaojian.andIdBetween(4,10);
//        List<Userinfo> list=userinfoMapper.selectByExample(criteria);
//        for(Userinfo user:list){
//            System.out.println(user.getUsername()+"--"+user.getUserpass());
//        }

//            int i=userinfoMapper.deleteByPrimaryKey(1);//删除
//            System.out.println(i);
//            Assert.assertTrue(i>0);

//        Userinfo user=userinfoMapper.selectByPrimaryKey(1); //修改
//        user.setUsername("111111111");
//        int i=userinfoMapper.updateByPrimaryKey(user);
//        System.out.println(i);
//        Assert.assertTrue(i>0);



//        Userinfo userinfo=new Userinfo();//插入
//        userinfo.setUsername("11");
//        userinfo.setUserpass("454");
//
//      int i=  userinfoMapper.insert(userinfo);
//        System.out.println(i);
//        Assert.assertTrue(i>0);
    }
}
