package com.ruoyi.Stick.service;

import java.util.List;
import com.ruoyi.Stick.domain.Chatlist;

/**
 * 评论列表Service接口
 * 
 * @author 清
 * @date 2024-05-15
 */
public interface IChatlistService 
{
    /**
     * 查询评论列表
     * 
     * @param cid 评论列表主键
     * @return 评论列表
     */
    public Chatlist selectChatlistByCid(Long cid);

    /**
     * 查询评论列表列表
     * 
     * @param chatlist 评论列表
     * @return 评论列表集合
     */
    public List<Chatlist> selectChatlistList(Chatlist chatlist);

    /**
     * 新增评论列表
     * 
     * @param chatlist 评论列表
     * @return 结果
     */
    public int insertChatlist(Chatlist chatlist);

    /**
     * 修改评论列表
     * 
     * @param chatlist 评论列表
     * @return 结果
     */
    public int updateChatlist(Chatlist chatlist);

    /**
     * 批量删除评论列表
     * 
     * @param cids 需要删除的评论列表主键集合
     * @return 结果
     */
    public int deleteChatlistByCids(Long[] cids);

    /**
     * 删除评论列表信息
     * 
     * @param cid 评论列表主键
     * @return 结果
     */
    public int deleteChatlistByCid(Long cid);
}
