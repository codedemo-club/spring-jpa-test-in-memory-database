package club.codedemo.springjpatestinmemorydatabase.respository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    StudentRepository studentRepository;

    /**
     * 由于本机并没有安装mysql（即使安装了，也没有exampleDb数据库）
     * 所以如果本方法被成功执行，则说明当前单元测试连接的为H2数据库
     */
    @Test
    void findAll() {
        this.studentRepository.findAll();
    }
}