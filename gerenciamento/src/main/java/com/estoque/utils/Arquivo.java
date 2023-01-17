package com.estoque.utils;

import java.io.*;

public class Arquivo {
    /**
     * 
     * @param conteudo
     * @param nomeArquivo
     * @throws Exception
     */
    public static void gravar(String conteudo, String nomeArquivo) throws Exception {
		FileOutputStream outFile = new FileOutputStream(new File(nomeArquivo));
		BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));

		buff.write(conteudo);
		buff.close();  
		outFile.close();
	}

    /**
     * 
     * @param obj
     * @param nomeArquivo
     * @throws Exception
     */
    public static void gravar(Object obj, String nomeArquivo) throws Exception {
        ObjectOutputStream output;
       
        output = new ObjectOutputStream(new FileOutputStream(new File(nomeArquivo)));
        output.writeObject(obj);
        output.close();
      }

      /**
       * 
       * @param nomeArquivo
       * @return
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
     * 
     * @param nomeArquivo
     * @return
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
