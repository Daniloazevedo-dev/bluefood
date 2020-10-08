package br.com.softblue.bluefood.domain.pedido;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.softblue.bluefood.domain.pagamento.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
	
}
