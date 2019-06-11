package com.osyunge.inter;

import com.osyunge.dataobject.EasyUITreeNode;

import java.util.List;

/**
 * @InterfaceName ItemCatService
 * @Description 商品类目接口
 * @Author hjc
 * @Date 2019/6/10 11:32
 * @Version 1.0
 */
public interface ItemCatService {
    List<EasyUITreeNode> getItemCatList(long parentId);
}
