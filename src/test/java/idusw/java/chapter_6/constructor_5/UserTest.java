package idusw.java.chapter_6.constructor_5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {
    @Test
    public void userTest() {
        Long id = 1L;
        String name = "민수";
        int age = 24;

        User user = new User(id, name, age);
        System.out.println("id = " + user.getId() + ", name = " + user.getName() + ", age = " + user.getAge());

        Assertions.assertThat(user.getId()).isEqualTo(id);
        Assertions.assertThat(user.getName()).isEqualTo(name);
        Assertions.assertThat(user.getAge()).isEqualTo(age);
    }
}