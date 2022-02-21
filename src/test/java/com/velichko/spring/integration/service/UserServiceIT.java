package com.velichko.spring.integration.service;

import com.velichko.spring.database.pool.ConnectionPool;
import com.velichko.spring.integration.annotation.IT;
import com.velichko.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

@IT
@RequiredArgsConstructor
public class UserServiceIT {

    private final UserService userService;
    private final ConnectionPool pool1;

    @Test
    void test() {

    }
}
