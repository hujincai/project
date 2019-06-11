package com.osyunge.service;

import com.osyunge.dataobject.PictureResult;
import com.osyunge.inter.PictureService;
import com.osyunge.utils.FastDFSClient;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName PictureServiceImpl
 * @Description TODO
 * @Author hjc
 * @Date 2019/6/11 10:2
 * @Version 1.07
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Override
    public PictureResult uploadPic(MultipartFile picFile) {
        PictureResult result = new PictureResult();
        // 判断图片是否为空
        if(picFile.isEmpty()) {
            result.setError(1);
            result.setMessage("图片为空");
            return result;
        }
        try{
            // 获取文件的名称
            String fileName = picFile.getOriginalFilename();
            // 截取后缀
            String subFileName = fileName.substring(fileName.lastIndexOf(".") + 1);
            // 读取配置文件client.conf
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:client.conf");
            // 调用上传方法
            String picUrl = fastDFSClient.uploadFile(picFile.getBytes(),subFileName);
            // 添加地址
            String prexAddress = "http://192.168.112.131/";
            String newUrl = prexAddress + picUrl;
            //把url响应给客户端
            result.setError(0);
            result.setUrl(newUrl);
        } catch (Exception e) {
            e.printStackTrace();
            result.setError(1);
            result.setMessage("上传图片失败!");
        }
        return result;
    }
}
