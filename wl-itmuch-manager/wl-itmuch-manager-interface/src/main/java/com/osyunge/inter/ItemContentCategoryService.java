package com.osyunge.inter;

import com.osyunge.dataobject.EasyUITreeNode;
import com.osyunge.pojo.TbContentCategory;

import java.util.List;

/**
 * Created by 胡金才
 * 2019/6/17 9:17
 */
public interface ItemContentCategoryService {
    List<EasyUITreeNode> getItemContentList(long parentId);
}
