package toStringequalshashCode;

import java.util.Objects;

public class Pessoa {
	private String nome;
	private Integer idade;
	
	Pessoa(){
				
	}
	
	Pessoa(String nome,Integer idade){
		this.nome = nome;
		this.idade = idade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	@Override	
	public boolean equals(Object obj) {
		Pessoa pessoa =  (Pessoa)obj;
		if(pessoa.getNome() == nome && pessoa.getIdade() == idade) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public String toString() {
		return "Nome: " + nome + " , "+ "Idade: " + idade;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome,idade);
		
		
	}
	
	

}
