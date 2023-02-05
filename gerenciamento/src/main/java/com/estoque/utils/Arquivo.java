package com.estoque.utils;

import java.io.*;

public class Arquivo {

    /**
     * Cria (caso não exista) um arquivo para gravar o conteúdo em questão no mesmo.
     * @param conteudo
     * @param nomeArquivo
     * @throws java.lang.Exception
     */
    public static void gravar(String conteudo, String nomeArquivo) throws Exception {
		FileOutputStream outFile = new FileOutputStream(new File(nomeArquivo));
		BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));

		buff.write(conteudo);
		buff.close();  
		outFile.close();
	}

    /**
     * Grava objetos no arquivo.
     * @param obj
     * @param nomeArquivo
     * @throws java.lang.Exception
     */
    public static void gravar(Object obj, String nomeArquivo) throws Exception {
        ObjectOutputStream output;
       
        output = new ObjectOutputStream(new FileOutputStream(new File(nomeArquivo)));
        output.writeObject(obj);
        output.close();
      }

      /**
       * Lê o arquivo em questão e retorna o objeto gravado nele
       * @param nomeArquivo
       * @return obj
       * @throws Exception
       */
      public static Object ler(String nomeArquivo) throws Exception{
		Object obj;        
		ObjectInputStream input;

        input = new ObjectInputStream(new FileInputStream(new File(nomeArquivo)));
        obj = input.readObject();
        input.close();

		return obj;
	}

    /**
     * Recupera a quantidade de linhas do arquivo.
     * @param nomeArquivo
     * @return linhas
     * @throws Exception
     */
    public static String[] getLinhas(String nomeArquivo) throws Exception {       
       	String[] linhas;
		String linha;
		int nlinhas, i = 0;
        
        FileInputStream inFile = new FileInputStream(new File(nomeArquivo));
        BufferedReader buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));

		linha = buff.readLine();
		nlinhas = Integer.parseInt(linha);
		linhas = new String[nlinhas+1];
		linhas[i++] = linha;

		do {
			linha = buff.readLine();
			if(linha != null)
				linhas[i++] = linha; 
		} while(linha != null);
            
        buff.close();
        inFile.close();
		
		return linhas;
    }
}
