package br.com.houseboss.houseboss_app.database.repository;

import br.com.houseboss.houseboss_app.database.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
