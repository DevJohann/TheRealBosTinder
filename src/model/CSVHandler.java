package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

/**
 * <h1>CSVHandler</h1>
 * <p>Esta clase sirve como CRUD, donde se lee el archivo csv</p>
 * <p>Cuenta con los metodos: readCSVFile(), </p> 
 * @author Johann
 *
 */
public class CSVHandler {
	/**
	 * <h2>readCSVFile</h2>
	 * <p>
	 * Este metodo lee el archivo CSV mediante la libreria opencsv, de la cual usamos la clase CsvToBean
	 * y un FileReader para leer el archivo. Maneja FileNotFoundException debido a que puede que no encuentre la ruta
	 * especificada.
	 * </p>
	 * <p>
	 * Al leer el archivo, se usa un regex de ";" que es lo que separa cada celda en el csv. Se salta la primera linea del
	 * archivo debido a que esta contiene informacion de las columnas y no nos interesa obtenerla. Cada fila que lea
	 * lo va a convertir en un objeto de tipo UsuarioDTO, y le asignara sus valores en base a lo especificado en la clase
	 * UsuarioDTO
	 * </p>
	 * <p>
	 * El metodo retorna una lista que contiene todos los objetos tipo UsuarioDTO, con sus valores ya asignados.
	 * </p>
	 * 
	 * @see UsuarioDTO
	 * @return List<UsuarioDTO>
	 * @throws FileNotFoundException
	 */
	public static List<UsuarioDTO> readCSVFile() throws FileNotFoundException{
		FileReader reader = new FileReader("data/datos.csv");
		CsvToBean<UsuarioDTO> csvToBean = new CsvToBeanBuilder<UsuarioDTO>(reader).withSkipLines(1)
				.withType(UsuarioDTO.class).withSeparator(';').build();
		
		return csvToBean.parse();
	}
	
	//Probando
	public static void writeIntoCSVFile(List<UsuarioDTO> userList) {
		CSVWriter csvWriter = null;
		CustomMappingStrategy<UsuarioDTO> mappingStrategy = new CustomMappingStrategy<>();
		mappingStrategy.setType(UsuarioDTO.class);
		try {
			csvWriter = new CSVWriter(new FileWriter("data/datos.csv"));
			StatefulBeanToCsv<UsuarioDTO> beanToCSV = new StatefulBeanToCsvBuilder<UsuarioDTO>(csvWriter)
					.withMappingStrategy(mappingStrategy).build();
			beanToCSV.write(userList);
			
		}catch(CsvDataTypeMismatchException | CsvRequiredFieldEmptyException | IOException e) {
			e.printStackTrace();
		}finally {
			try {
				csvWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
