package br.com.houseboss.houseboss_app.database.repository;

import br.com.houseboss.houseboss_app.database.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
