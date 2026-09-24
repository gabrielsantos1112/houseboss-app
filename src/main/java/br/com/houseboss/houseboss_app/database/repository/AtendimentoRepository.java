package br.com.houseboss.houseboss_app.database.repository;

import br.com.houseboss.houseboss_app.database.model.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {
}
