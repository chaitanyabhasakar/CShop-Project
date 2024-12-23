package Repository;

import Model.LoginPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginPageRepository extends JpaRepository<LoginPage,String> {
}
