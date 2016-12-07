import footmark.springdata.jpa.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Describe :  ---------    -----------
 * Author  :       YHBK
 * Time   :  2016/12/7 0007 16:57
 * ----------------------------------------------------
 */
public class TestJpa {

    @Test
    public void tset(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-demo-cfg.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
//        userService.createNewAccount("g", "ggg", 700);
//        System.out.println(userService.findByBalanceGreaterThan(100, new PageRequest(1, 2)));

        userService.createNewAccount("KXP","Do",29);
        System.out.println(userService.findAll());
    }

}
