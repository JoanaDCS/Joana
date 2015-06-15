package beans;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@ManagedBean(name="arquivo")
public class Arquivo implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -1413172214736138798L;
	//	private static final int MAX_SIZE = 2 * 1024 * 1024;
	private int num_linhas;
	private int num_colunas;
	
	public Arquivo(){
		this.num_linhas = 0;
	}
	
	public void retornarLinhas(){
		try{
			if(!new File("planilha.xls").exists()){
				System.out.println("AQUI");
				Workbook workbook;
				try {
					workbook = Workbook.getWorkbook(new File("planilha.xls"));
					Sheet sheet = workbook.getSheet(0);
					System.out.println("Iniciando leitura Excel");
					this.num_linhas = sheet.getRows();
				} catch (BiffException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}finally{
			System.out.println("Erro");
		}
		
	}
	
	public int getNum_linhas() {
		return this.num_linhas;
	}

	public void setNum_linhas(int num_linhas) {
		this.num_linhas = num_linhas;
	}
	public int getNum_colunas() {
		return num_colunas;
	}
	public void setNum_colunas(int num_colunas) {
		this.num_colunas = num_colunas;
	}
	
}
