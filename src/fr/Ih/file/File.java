package fr.Ih.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File {

	
public static List<String> getFileLines(String path) {

		BufferedReader br = null;
		List<String> lines = new ArrayList<String>();
		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(path));
			while ((sCurrentLine = br.readLine()) != null) {
				// on ajoute les lignes dans notre liste
				lines.add(sCurrentLine);
			}
			// on retourne
			return lines;
		} catch (IOException e) {
			// si une exception est leve on retourne une stacktrace
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}
