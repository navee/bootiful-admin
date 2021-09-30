package io.github.navee.bootifuladmin.common;

import io.github.navee.bootifuladmin.user.domain.UserVO;
import io.github.navee.bootifuladmin.user.entity.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author raozhanghui
 * @date 2021-09-28 18:24
 **/
class VoUtilsTest {
    @Test
    public void test() {
        final User source = new User();
        source.setId(1L);
        final UserVO userVO = VoUtils.buildVo(source, UserVO.class);
        assertNotNull(userVO);
        assertEquals(source.getId(), userVO.getId());
    }
}
