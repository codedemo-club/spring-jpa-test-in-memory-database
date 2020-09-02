package club.codedemo.springjpatestinmemorydatabase;

import club.codedemo.springjpatestinmemorydatabase.respository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {
        SpringJpaTestInMemoryDatabaseApplication.class,
        StudentJpaConfig.class
})
class StudentJpaConfigTest {
    @Autowired
    StudentRepository studentRepository;

    @Test
    void dataSource() {
        this.studentRepository.findAll();
    }
}