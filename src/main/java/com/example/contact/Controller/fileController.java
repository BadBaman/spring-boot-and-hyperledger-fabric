package com.example.contact.Controller;

import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.logging.Logger;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class fileController {
    //private static final Logger logger= (Logger) LoggerFactory.getLogger(fileController.class);
    @RequestMapping(value="/upload",method=POST)
    public String upload(@RequestParam("file")MultipartFile file) throws Exception
    {//上传文件
        //未规定路径，默认保存在项目根路径下
        String filepath="D:/MyProjects/repository/"+file.getOriginalFilename();
        if(file.isEmpty()) return"上传失败";
        //String filepath=file.getOriginalFilename();
        BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream(filepath));
        outputStream.write(file.getBytes());
        outputStream.flush();
        outputStream.close();
        return "file";
    }
    @RequestMapping("/download")
    public ResponseEntity download() throws Exception
    {//下载文件
        FileSystemResource file=new FileSystemResource("12.jpg");
        HttpHeaders headers=new HttpHeaders();
        //在响应头中添加值，设置下载文件默认名称
        headers.add("Content-Disposition","attachment;filename=123.jpg");
        return ResponseEntity.ok().headers(headers).contentLength(file.contentLength()).contentType
                (MediaType.parseMediaType("application/octet-stream")).body(new InputStreamResource(file.getInputStream()));
    }
}
