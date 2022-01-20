package multimidia;

public class ArquivoVideo extends ArquivoMultimidia
{
	public int largura;
	public int altura;

	public ArquivoVideo(String nomeArquivo, int tamanho, int largura, int altura)
	{
		super(nomeArquivo, tamanho);
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public String toString()
	{
		return "Video: " + super.getNomeArquivo() + " (" + super.getTamanhoArquivo() + ")";
	}
}