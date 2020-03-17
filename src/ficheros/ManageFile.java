package ficheros;

import java.io.File;

public class ManageFile {
	
	public void exploreFile(File file){
		if (file.isDirectory()){
			File[] listFiles = file.listFiles();
			for (int i = 0; i < listFiles.length; i++) {
				if(listFiles[i].isDirectory()){
					exploreFile(listFiles[i]);
				}
				//caso base
				else
					System.out.println(listFiles[i]);
			}
		}
	}
	public static void main(String[] args) {
		// File
		// puede representar elementos de un sistema de archivos:
		// archivo, directorio, enlace (que es en realidad otro archivo)
//		File elemento = new File("C:\\proyectos2018\\katas\\FizzBuZZ\\src\\Fizzbuzz.java");
		File elemento = new File("C:\\proyectos2018\\katas");
//		File elemento = new File("C:\\windows");
		new ManageFile().exploreFile(elemento);
	}
		
}
