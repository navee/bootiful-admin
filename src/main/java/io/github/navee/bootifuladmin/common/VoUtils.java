package io.github.navee.bootifuladmin.common;

import org.springframework.beans.BeanUtils;
import org.springframework.cglib.core.ReflectUtils;

import java.util.Objects;
import java.util.Optional;

/**
 * @author raozhanghui
 * @date 2021-09-28 18:21
 **/
public class VoUtils {
    public static <T> T buildVo(Object source, Class<T> targetClass) {
        if (Objects.isNull(source)) {
            return null;
        }
        final T target = (T) ReflectUtils.newInstance(targetClass);
        BeanUtils.copyProperties(source, target);
        return target;
    }

    public static <T> Optional<T> buildVoOpt(Optional<Object> sourceOpt, Class<T> targetClass) {
        if (!sourceOpt.isPresent()) {
            return Optional.ofNullable(null);
        }
        return Optional.ofNullable(buildVo(sourceOpt.get(), targetClass));
    }
}
