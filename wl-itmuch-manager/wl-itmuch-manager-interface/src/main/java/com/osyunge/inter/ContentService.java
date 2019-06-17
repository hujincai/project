package com.osyunge.inter;

import com.osyunge.dataobject.EasyUIDataGridResult;

/**
 * Created by 胡金才
 * 2019/6/17 10:33
 */
public interface ContentService {
    EasyUIDataGridResult getContentList(int page,int rows);
}
