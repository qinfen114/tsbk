package com.ruoyi.app.service;

import java.util.List;
import com.ruoyi.app.domain.Applist;

/**
 * 软件库Service接口
 * 
 * @author ruoyi
 * @date 2024-04-05
 */
public interface IApplistService 
{
    /**
     * 查询软件库
     * 
     * @param id 软件库主键
     * @return 软件库
     */
    public Applist selectApplistById(Long id);

    /**
     * 查询软件库列表
     * 
     * @param applist 软件库
     * @return 软件库集合
     */
    public List<Applist> selectApplistList(Applist applist);

    /**
     * 新增软件库
     * 
     * @param applist 软件库
     * @return 结果
     */
    public int insertApplist(Applist applist);

    /**
     * 修改软件库
     * 
     * @param applist 软件库
     * @return 结果
     */
    public int updateApplist(Applist applist);

    /**
     * 批量删除软件库
     * 
     * @param ids 需要删除的软件库主键集合
     * @return 结果
     */
    public int deleteApplistByIds(Long[] ids);

    /**
     * 删除软件库信息
     * 
     * @param id 软件库主键
     * @return 结果
     */
    public int deleteApplistById(Long id);
}
