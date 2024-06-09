package com.ruoyi.Stick.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Stick.mapper.PostlistMapper;
import com.ruoyi.Stick.domain.Postlist;
import com.ruoyi.Stick.service.IPostlistService;

/**
 * 帖子列表Service业务层处理
 * 
 * @author 清
 * @date 2024-04-25
 */
@Service
public class PostlistServiceImpl implements IPostlistService 
{
    @Autowired
    private PostlistMapper postlistMapper;

    /**
     * 查询帖子列表
     * 
     * @param pid 帖子列表主键
     * @return 帖子列表
     */
    @Override
    public Postlist selectPostlistByPid(Long pid)
    {
        return postlistMapper.selectPostlistByPid(pid);
    }

    /**
     * 查询帖子列表列表
     * 
     * @param postlist 帖子列表
     * @return 帖子列表
     */
    @Override
    public List<Postlist> selectPostlistList(Postlist postlist)
    {
        return postlistMapper.selectPostlistList(postlist);
    }

    /**
     * 新增帖子列表
     * 
     * @param postlist 帖子列表
     * @return 结果
     */
    @Override
    public int insertPostlist(Postlist postlist)
    {
        return postlistMapper.insertPostlist(postlist);
    }

    /**
     * 修改帖子列表
     * 
     * @param postlist 帖子列表
     * @return 结果
     */
    @Override
    public int updatePostlist(Postlist postlist)
    {
        return postlistMapper.updatePostlist(postlist);
    }

    /**
     * 批量删除帖子列表
     * 
     * @param pids 需要删除的帖子列表主键
     * @return 结果
     */
    @Override
    public int deletePostlistByPids(Long[] pids)
    {
        return postlistMapper.deletePostlistByPids(pids);
    }

    /**
     * 删除帖子列表信息
     * 
     * @param pid 帖子列表主键
     * @return 结果
     */
    @Override
    public int deletePostlistByPid(Long pid)
    {
        return postlistMapper.deletePostlistByPid(pid);
    }
}
