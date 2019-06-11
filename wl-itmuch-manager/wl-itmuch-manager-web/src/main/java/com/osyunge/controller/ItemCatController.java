package com.osyunge.controller;

import com.osyunge.dataobject.EasyUITreeNode;
import com.osyunge.inter.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName ItemCatController
 * @Description 商品类目Controller
 * @Author hjc
 * @Date 2019/6/10 11:42
 * @Version 1.0
 */
@RequestMapping("/item/cat")
@Controller
public class ItemCatController {


    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUITreeNode> getItemCatList(@RequestParam(value="id",defaultValue = "0")
                                                           Long parentId){
        return itemCatService.getItemCatList(parentId);
    }
}
