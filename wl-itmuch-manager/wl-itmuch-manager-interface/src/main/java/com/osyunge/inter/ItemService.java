package com.osyunge.inter;

import com.osyunge.dataobject.EasyUIDataGridResult;
import com.osyunge.dataobject.FCResult;
import com.osyunge.pojo.TbItem;

import java.util.List;

/**
 * @InterfaceName ItemService
 * @Description 商品信息接口
 * @Author hjc
 * @Date 2019/6/9 19:21
 * @Version 1.0
 */
public interface ItemService {

    TbItem selectItemInfoByItemId(long itemId);
    /*查询商品列表*/
    EasyUIDataGridResult getItemList(int page,int rows);
    /*商品新增*/
    FCResult createItem(TbItem item,String desc);
}
