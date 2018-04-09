import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.FilenameUtils;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;

public class Converter {

	public static void main(String[] args) {
		System.out.println("starting..");
		String filePathInput="docx/demo.docx";		
		String extension = FilenameUtils.getExtension(filePathInput);
		String baseName = FilenameUtils.getBaseName(filePathInput);
		File file = new File(filePathInput);
		String filePathOutput = "pdf/"+ baseName+".pdf";
		InputStream iStream;
		try {
			iStream = new FileInputStream(file);
			OutputStream outStream = new FileOutputStream(new File(filePathOutput));
			Document doc = new Document(iStream);
			doc.save(outStream, SaveFormat.PDF);
			System.out.println("successfull");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
