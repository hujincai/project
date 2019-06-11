package com.osyunge.inter;

import com.osyunge.dataobject.PictureResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @InterfaceName PictureService
 * @Description 图片上传Service
 * @Author hjc
 * @Date 2019/6/11 10:24
 * @Version 1.0
 */
public interface PictureService {
    PictureResult uploadPic(MultipartFile uploadFile);
}
