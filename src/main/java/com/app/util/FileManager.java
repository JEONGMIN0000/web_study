package com.app.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.app.dto.file.FileInfo;

public class FileManager {
	
	static final String FILE_DIRECTORY_PATH = "d:/fileStorage/";
	static final String FILE_URL_PATH = "/fileStorage";
	
	public static FileInfo storeFile (MultipartFile file) throws IllegalStateException, IOException {
		
		//파일 폴더 저장 -> 파일에 대한 정보를 기반 -> DB 저장
		
		FileInfo fileInfo = new FileInfo();
		
		fileInfo.setOriginalFileName(file.getOriginalFilename());
		fileInfo.setFilePath(FILE_DIRECTORY_PATH);
		fileInfo.setUrlFilePath(FILE_URL_PATH);
		
		String extension = extractExtension(file.getOriginalFilename());
		String fileName = createFileName(extension);
		
		fileInfo.setFileName(fileName);
		
		file.transferTo( new File( fileInfo.getFilePath() + fileInfo.getFileName() ) );
	
		return fileInfo;
		
		//d:/fileStorage/dfdsafs-adsfd-dfdfa.jpg
		
		//d:/fileStorage/tree.jpg
		
		//tree.jpg
		//abc.png
		
		//myinfo.hwp
		//money.xlsx
		
		//dfdsafs-adsfd-dfdfa.jpg
	}
	
	//png sfdsdfsdfds.png
	//jpg sdjdkjfkdjk.jpg
	private static String createFileName(String extension) {
		String fileName = UUID.randomUUID().toString();
		//dfdsafs-adsfd-dfdfa
		fileName = fileName + "." + extension;
		//dfdsafs-adsfd-dfdfa.jpg
		
		return fileName; //dfdsafs-adsfd-dfdfa
	}
	
	private static String extractExtension(String fileName) {
		//tree.jpg
		return fileName.substring( fileName.lastIndexOf(".") +1 ); //jpg
	}

}
