package Collection;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
	private String nome;
	private Integer preco;
	
	List<Produtos> produtos = new ArrayList<>();
	
	public Produtos() {
		
	}
	
	public Produtos(String nome, Integer preco) {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}
	
	
	}
	


