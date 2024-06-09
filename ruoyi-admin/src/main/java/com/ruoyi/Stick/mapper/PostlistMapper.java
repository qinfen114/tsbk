package com.ruoyi.Stick.mapper;

import java.util.List;
import com.ruoyi.Stick.domain.Postlist;

/**
 * 帖子列表Mapper接口
 * 
 * @author 清
 * @date 2024-04-25
 */
public interface PostlistMapper 
{
    /**
     * 查询帖子列表
     * 
     * @param pid 帖子列表主键
     * @return 帖子列表
     */
    public Postlist selectPostlistByPid(Long pid);

    /**
     * 查询帖子列表列表
     * 
     * @param postlist 帖子列表
     * @return 帖子列表集合
     */
    public List<Postlist> selectPostlistList(Postlist postlist);

    /**
     * 新增帖子列表
     * 
     * @param postlist 帖子列表
     * @return 结果
     */
    public int insertPostlist(Postlist postlist);

    /**
     * 修改帖子列表
     * 
     * @param postlist 帖子列表
     * @return 结果
     */
    public int updatePostlist(Postlist postlist);

    /**
     * 删除帖子列表
     * 
     * @param pid 帖子列表主键
     * @return 结果
     */
    public int deletePostlistByPid(Long pid);

    /**
     * 批量删除帖子列表
     * 
     * @param pids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePostlistByPids(Long[] pids);
}
