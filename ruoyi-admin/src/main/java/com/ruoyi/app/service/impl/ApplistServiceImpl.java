package com.ruoyi.app.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.app.mapper.ApplistMapper;
import com.ruoyi.app.domain.Applist;
import com.ruoyi.app.service.IApplistService;

/**
 * 软件库Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-04-05
 */
@Service
public class ApplistServiceImpl implements IApplistService 
{
    @Autowired
    private ApplistMapper applistMapper;

    /**
     * 查询软件库
     * 
     * @param id 软件库主键
     * @return 软件库
     */
    @Override
    public Applist selectApplistById(Long id)
    {
        return applistMapper.selectApplistById(id);
    }

    /**
     * 查询软件库列表
     * 
     * @param applist 软件库
     * @return 软件库
     */
    @Override
    public List<Applist> selectApplistList(Applist applist)
    {
        return applistMapper.selectApplistList(applist);
    }

    /**
     * 新增软件库
     * 
     * @param applist 软件库
     * @return 结果
     */
    @Override
    public int insertApplist(Applist applist)
    {
        return applistMapper.insertApplist(applist);
    }

    /**
     * 修改软件库
     * 
     * @param applist 软件库
     * @return 结果
     */
    @Override
    public int updateApplist(Applist applist)
    {
        return applistMapper.updateApplist(applist);
    }

    /**
     * 批量删除软件库
     * 
     * @param ids 需要删除的软件库主键
     * @return 结果
     */
    @Override
    public int deleteApplistByIds(Long[] ids)
    {
        return applistMapper.deleteApplistByIds(ids);
    }

    /**
     * 删除软件库信息
     * 
     * @param id 软件库主键
     * @return 结果
     */
    @Override
    public int deleteApplistById(Long id)
    {
        return applistMapper.deleteApplistById(id);
    }
}
