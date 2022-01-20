package arquivos;

import java.util.Scanner;

public class CompactaArquivos
{
	public static void main(String[] args)
	{
		PastaCompactada<Texto> pastaTextos = new PastaCompactada<Texto>();
		PastaCompactada<Imagem> pastaImagens = new PastaCompactada<Imagem>();

		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		leitor.nextLine();

		for (int i = 0; i < n; i++)
		{
			String tipo = leitor.nextLine();

			if (tipo.compareTo("Texto") == 0)
			{
				pastaTextos.adicionar(new Texto());
			}
			else if (tipo.compareTo("TextoTXT") == 0)
			{
				pastaTextos.adicionar(new TextoTXT());
			}
			else if (tipo.compareTo("TextoDOCX") == 0)
			{
				pastaTextos.adicionar(new TextoDOCX());
			}
			else if (tipo.compareTo("Imagem") == 0)
			{
				pastaImagens.adicionar(new Imagem());
			}
			else if (tipo.compareTo("ImagemPNG") == 0)
			{
				pastaImagens.adicionar(new ImagemPNG());
			}
			else if (tipo.compareTo("ImagemJPEG") == 0)
			{
				pastaImagens.adicionar(new ImagemJPEG());
			}
		}
		pastaTextos.imprimir();
		pastaImagens.imprimir();
	}
}