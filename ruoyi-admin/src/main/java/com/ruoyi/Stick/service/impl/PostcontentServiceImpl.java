package com.ruoyi.Stick.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Stick.mapper.PostcontentMapper;
import com.ruoyi.Stick.domain.Postcontent;
import com.ruoyi.Stick.service.IPostcontentService;

/**
 * 帖子详情Service业务层处理
 * 
 * @author 清
 * @date 2024-05-08
 */
@Service
public class PostcontentServiceImpl implements IPostcontentService 
{
    @Autowired
    private PostcontentMapper postcontentMapper;

    /**
     * 查询帖子详情
     * 
     * @param pid 帖子详情主键
     * @return 帖子详情
     */
    @Override
    public Postcontent selectPostcontentByPid(Long pid)
    {
        return postcontentMapper.selectPostcontentByPid(pid);
    }

    /**
     * 查询帖子详情列表
     * 
     * @param postcontent 帖子详情
     * @return 帖子详情
     */
    @Override
    public List<Postcontent> selectPostcontentList(Postcontent postcontent)
    {
        return postcontentMapper.selectPostcontentList(postcontent);
    }

    /**
     * 新增帖子详情
     * 
     * @param postcontent 帖子详情
     * @return 结果
     */
    @Override
    public int insertPostcontent(Postcontent postcontent)
    {
        return postcontentMapper.insertPostcontent(postcontent);
    }

    /**
     * 修改帖子详情
     * 
     * @param postcontent 帖子详情
     * @return 结果
     */
    @Override
    public int updatePostcontent(Postcontent postcontent)
    {
        return postcontentMapper.updatePostcontent(postcontent);
    }

    /**
     * 批量删除帖子详情
     * 
     * @param pids 需要删除的帖子详情主键
     * @return 结果
     */
    @Override
    public int deletePostcontentByPids(Long[] pids)
    {
        return postcontentMapper.deletePostcontentByPids(pids);
    }

    /**
     * 删除帖子详情信息
     * 
     * @param pid 帖子详情主键
     * @return 结果
     */
    @Override
    public int deletePostcontentByPid(Long pid)
    {
        return postcontentMapper.deletePostcontentByPid(pid);
    }
}
