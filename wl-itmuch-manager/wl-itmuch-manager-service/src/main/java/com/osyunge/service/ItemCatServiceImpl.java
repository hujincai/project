package com.osyunge.service;

import com.osyunge.dataobject.EasyUIDataGridResult;
import com.osyunge.dataobject.EasyUITreeNode;
import com.osyunge.inter.ItemCatService;
import com.osyunge.mapper.TbItemCatMapper;
import com.osyunge.pojo.TbItemCat;
import com.osyunge.pojo.TbItemCatExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ItemCatServiceImpl
 * @Description 商品类目实现类
 * @Author hjc
 * @Date 2019/6/10 11:33
 * @Version 1.0
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<EasyUITreeNode> getItemCatList(long parentId) {
        // 创建条件对象
        TbItemCatExample ex = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = ex.createCriteria();
        // 设置条件
        criteria.andParentIdEqualTo(parentId);
        List<TbItemCat> itemCatList = itemCatMapper.selectByExample(ex);
        // 创建EasyUITreeNode对象集合
        List<EasyUITreeNode> resultList = new ArrayList<EasyUITreeNode>();
        // 遍历itemCatLis集合
        for (TbItemCat itemcat:itemCatList) {
            // 创建一个EasyUITreeNode对象
            EasyUITreeNode treeNode = new EasyUITreeNode();
            treeNode.setId(itemcat.getId());
            treeNode.setText(itemcat.getName());
            treeNode.setState(itemcat.getIsParent()?"closed":"open");// 判断是否是叶子节点
            // 添加到resultList集合中
            resultList.add(treeNode);
        }
        return resultList;
    }
}
