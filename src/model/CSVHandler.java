package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CSVHandler {
	public static List<UsuarioDTO> readCSVFile() throws FileNotFoundException{
		FileReader reader = new FileReader("data/datos.csv");
		CsvToBean<UsuarioDTO> csvToBean = new CsvToBeanBuilder<UsuarioDTO>(reader)
				.withType(UsuarioDTO.class).withSeparator(',').build();
		
		return csvToBean.parse();
	}
}
