package beans;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Principal {
	public static void main(String[] args) throws BiffException, IOException {
		Workbook workbook = Workbook.getWorkbook(new File("planilha2.xls"));
		Sheet sheet = workbook.getSheet(0);
		int linhas = sheet.getRows();
		int colunas = sheet.getColumns();
		Cell[][] matriz = new Cell[linhas][colunas];
		for(int i = 0; i < linhas; i++){
			for(int j = 0; j < colunas; j++){
				matriz[i][j] = (Cell) sheet.getCell(j, i);
				System.out.println("Result : " + matriz[i][j].getContents());
				
			}
		}
		System.out.println("Num Linhas : "+linhas);
		
	}
}
