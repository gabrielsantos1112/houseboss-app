package br.com.houseboss.houseboss_app.database.repository;

import br.com.houseboss.houseboss_app.database.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
