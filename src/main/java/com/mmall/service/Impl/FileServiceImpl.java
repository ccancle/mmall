package com.mmall.service.Impl;

import com.google.common.collect.Lists;
import com.mmall.service.IFileService;
import com.mmall.util.FTPUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @program: mmall
 * @description: 文件上传的接口实现
 * @author: Macchac
 * @create: 2020-03-09 17:52
 **/
@Service("iFileService")
public class FileServiceImpl implements IFileService {

    private Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

    public String upload(MultipartFile file,String path){
        String fileName = file.getOriginalFilename();
        //拓展名 文件名从后往前 取第一个.之后的字符 即为文件拓展名
        String fileExtensionName = fileName.substring(fileName.lastIndexOf(".")+1);

        //同名文件处理？ 上传文件名
        String uploadFileName = UUID.randomUUID().toString()+"."+fileExtensionName;

        logger.info("开始上传文件,上传文件的文件名:{},上传的路径:{},新文件名:{}",fileName,path,uploadFileName);
        //目录文件夹
        File fileDir = new File(path);
        if (!fileDir.exists()){
            fileDir.setWritable(true);//设置可写权限
            fileDir.mkdirs();
        }
        File targetFile = new File(path,uploadFileName);
        try {
            file.transferTo(targetFile);
            //文件已经上传成功

            FTPUtil.uploadFile(Lists.newArrayList(targetFile));
            //已经上传到ftp服务器上

            targetFile.delete();
            //上传完之后 删除upload下面的文件
        } catch (IOException e) {
            logger.error("上传文件异常",e);
            return null;
        }

        return targetFile.getName();
    }
}
