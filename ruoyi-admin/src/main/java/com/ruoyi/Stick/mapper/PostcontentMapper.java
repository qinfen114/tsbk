package com.ruoyi.Stick.mapper;

import java.util.List;
import com.ruoyi.Stick.domain.Postcontent;

/**
 * 帖子详情Mapper接口
 * 
 * @author 清
 * @date 2024-05-08
 */
public interface PostcontentMapper 
{
    /**
     * 查询帖子详情
     * 
     * @param pid 帖子详情主键
     * @return 帖子详情
     */
    public Postcontent selectPostcontentByPid(Long pid);

    /**
     * 查询帖子详情列表
     * 
     * @param postcontent 帖子详情
     * @return 帖子详情集合
     */
    public List<Postcontent> selectPostcontentList(Postcontent postcontent);

    /**
     * 新增帖子详情
     * 
     * @param postcontent 帖子详情
     * @return 结果
     */
    public int insertPostcontent(Postcontent postcontent);

    /**
     * 修改帖子详情
     * 
     * @param postcontent 帖子详情
     * @return 结果
     */
    public int updatePostcontent(Postcontent postcontent);

    /**
     * 删除帖子详情
     * 
     * @param pid 帖子详情主键
     * @return 结果
     */
    public int deletePostcontentByPid(Long pid);

    /**
     * 批量删除帖子详情
     * 
     * @param pids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePostcontentByPids(Long[] pids);
}
