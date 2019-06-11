package com.osyunge.controller;

import com.osyunge.dataobject.EasyUIDataGridResult;
import com.osyunge.inter.ItemService;
import com.osyunge.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @Description:    商品类
* @Author:         hjc
* @CreateDate:     2019/6/9 19:20
* @UpdateUser:     hjc
* @UpdateDate:     2019/6/9 19:20
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RequestMapping("/item")
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
    public TbItem selectItemInfoById(@PathVariable long itemId) {
        return itemService.selectItemInfoByItemId(itemId);
    }

    /**
     * 查询商品列表信息
     * @param page
     * @param rows
     * @return itemList
     */
    @GetMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(int page,int rows) {
        return itemService.getItemList(page,rows);
    }
}
