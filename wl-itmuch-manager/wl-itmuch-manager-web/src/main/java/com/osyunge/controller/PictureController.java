package com.osyunge.controller;

import com.osyunge.dataobject.PictureResult;
import com.osyunge.inter.PictureService;
import com.osyunge.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName PictureController
 * @Description 图片上传Controller
 * @Author hjc
 * @Date 2019/6/11 10:33
 * @Version 1.0
 */
@Controller
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public PictureResult uploadFile(MultipartFile uploadFile) {
        PictureResult pictureResult = pictureService.uploadPic(uploadFile);
        return pictureResult;
    }
}
