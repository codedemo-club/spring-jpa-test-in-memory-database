package club.codedemo.springjpatestinmemorydatabase.respository;

import club.codedemo.springjpatestinmemorydatabase.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
