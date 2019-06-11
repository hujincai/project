package com.osyunge.dataobject;

import lombok.Data;

import java.util.List;

/**
 * @ClassName EasyUIDataGridResult
 * @Description 列表页属性封装类
 * @Author hjc
 * @Date 2019/6/10 10:27
 * @Version 1.0
 */
@Data
public class EasyUIDataGridResult {
    private long total; // 查询出来的总记录数
    private List<?> rows; // 所有数据的集合
}
