package com.hs.examportal.utility;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserUtils {

    /**
     * Creates random id with given size
     * @author shubham.katre
     * @since 07.08.24
     * @param size
     */
    public String createRandomId(int size) {
        String uuid = UUID.randomUUID().toString();
        return uuid.substring(0, size);
    }
}
