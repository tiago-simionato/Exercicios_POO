package universidade;

public class Professor extends Pessoa
{
	public Professor()
	{

	}

	@Override
	public String getEmail()
	{
		return super.getNome() + "." + super.getSobreNome() + "@ufabc.edu.br";
	}

	@Override
	public String getVinculo()
	{
		return "Professor da UFABC";
	}
}