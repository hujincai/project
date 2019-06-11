package com.osyunge.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.osyunge.dataobject.EasyUIDataGridResult;
import com.osyunge.inter.ItemService;
import com.osyunge.mapper.TbItemMapper;
import com.osyunge.pojo.TbItem;
import com.osyunge.pojo.TbItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ItemServiceImpl
 * @Description TODO
 * @Author hjc
 * @Date 2019/6/9 19:36
 * @Version 1.0
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;
    @Override
    public TbItem selectItemInfoByItemId(long itemId) {
        TbItemExample example = new TbItemExample();
        example.createCriteria().andIdEqualTo(itemId);
        List<TbItem> itemList = itemMapper.selectByExample(example);
        TbItem item = null;
        if (itemList.size()>0) {
             item = itemList.get(0);
        }
        return item;
    }

    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        // 设置分页
        PageHelper.startPage(page,rows);
        // 创建查询
        TbItemExample example = new TbItemExample();
        List<TbItem> itemList = itemMapper.selectByExample(example);
        // 取分页信息创建PageInfo对象
        PageInfo<TbItem> info = new PageInfo<>(itemList);
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal(info.getTotal());
        result.setRows(itemList);
        return result;
    }
}
