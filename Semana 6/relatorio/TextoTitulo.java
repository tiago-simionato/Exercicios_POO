package relatorio;

public class TextoTitulo implements PluginTexto
{
	private String titulo;

	public TextoTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	@Override
	public String aplicar(String texto)
	{
		return "(TITULO: " + titulo + ") " + texto;
	}
}