package tads.java8.lambda.exercicio;

public class CondicaoCidadeNatalParanavai implements CondicaoPessoa {

	@Override
	public boolean teste(Pessoa p) {
		return p.getCidadeNatal().equalsIgnoreCase("paranavai");
	}
}
