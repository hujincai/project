package com.osyunge.dataobject;

import lombok.Data;

/**
 * @ClassName EasyUITreeNode
 * @Description tree树的节点属性
 * @Author hjc
 * @Date 2019/6/10 11:29
 * @Version 1.0
 */
@Data
public class EasyUITreeNode {

    private long id; //  节点id,它是重要的来加载远程数据
    private String text; // 节点显示的文本
    private String state; // : 节点状态默认为open，如果为open表示有叶子节点，如果为cloed表示没有叶子节点
}
