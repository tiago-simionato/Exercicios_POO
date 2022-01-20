package universidade;

public class Pessoa
{
	private String nome;
	private String sobrenome;

	public Pessoa()
	{

	}

	public String getNome()
	{
		return nome;
	}

	public String getSobreNome()
	{
		return sobrenome;
	}

	public void setNomeSobrenome(String nome, String sobrenome)
	{
		this.nome = nome;
		this. sobrenome = sobrenome;
	}

	public String getEmail()
	{
		return nome + "." + sobrenome + "@dominio.generico.com.br";
	}

	public String getVinculo()
	{
		return "Sem vinculo com a UFABC";
	}
}