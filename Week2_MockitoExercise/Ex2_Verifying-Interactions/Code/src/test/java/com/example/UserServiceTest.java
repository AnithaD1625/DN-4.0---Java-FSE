package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    public void testFindUserById_isCalled() {
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findUserById(1)).thenReturn(new User("Anitha"));

        UserService service = new UserService(mockRepo);
        String result = service.getUserName(1);

        verify(mockRepo, times(1)).findUserById(1);
        assertEquals("Anitha", result);
        System.out.println("Test passed, user name: " + result);
    }
}
