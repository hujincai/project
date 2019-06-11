package com.osyunge.dataobject;

import lombok.Data;

/**
 * @ClassName PictureResult
 * @Description 文件上传状态信息类
 * @Author hjc
 * @Date 2019/6/11 10:19
 * @Version 1.0
 */
@Data
public class PictureResult {
    private int error;
    private String url;
    private String message;
}
