package io.github.navee.bootifuladmin.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @author raozhanghui
 * @date 2020-12-14 15:07
 **/
@SpringBootTest
@AutoConfigureMockMvc
class UserApiTest {
    @Resource
    private MockMvc mockMvc;

    @Test
    void get() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/user/1"))
                .andDo(print());
    }
}
