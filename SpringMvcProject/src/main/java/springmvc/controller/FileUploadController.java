package springmvc.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/uploadfile")
	public String showUploadForm() {
		
		return "fileform";
	}
	
	@RequestMapping(path="/uploadimage",method=RequestMethod.POST)
	public String fileUploader(@RequestParam("profile") CommonsMultipartFile file, HttpSession s,Model m) {
		System.out.println("file upload handler");
		
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		
		// save this file to server
		
		byte[] data=file.getBytes();
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resource"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("file uploaded");
			
			m.addAttribute("msg","uploaded successfully");
			m.addAttribute("filename", file.getOriginalFilename());
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("uploading error");
			m.addAttribute("msg","uploaded error");
		}
		
		
		
		return "filesuccess";
	}

}
