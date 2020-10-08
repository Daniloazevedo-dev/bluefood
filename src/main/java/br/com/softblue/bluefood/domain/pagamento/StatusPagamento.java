package br.com.softblue.bluefood.domain.pagamento;

public enum StatusPagamento {

	Aurotizado("Autorizado"),
	NaoAutorizado("Não autorizado pela instituiçãoo financeira"),
	CartaoInvalido("Cartão inválido ou bloqueado");
	
	String descricao;
	
	StatusPagamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
