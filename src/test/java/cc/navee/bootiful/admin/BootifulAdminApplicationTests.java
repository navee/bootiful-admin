package cc.navee.bootiful.admin;

import cc.navee.bootiful.admin.dao.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootifulAdminApplicationTests {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
		System.out.println(userRepository.findAll());
	}

}
