package com.osyunge.inter;

import com.osyunge.dataobject.EasyUIDataGridResult;
import com.osyunge.dataobject.FCResult;

/**
 * Created by 胡金才
 * 2019/6/12 10:01
 */
public interface ItemParamService {

    /** 查询规格参数列表*/
    EasyUIDataGridResult getItemParamList(int page,int rows);

    /** 通过itmecatId查询对应类目规格模板*/
    FCResult getItemCatParam(long cid);

    /** 新增规格模板*/
    FCResult createItemParam(long cid,String paramData);

    /** 查询模板*/
    String getItemParamHtml(long itemId);
}
