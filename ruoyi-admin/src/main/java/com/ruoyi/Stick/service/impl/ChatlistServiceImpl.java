package com.ruoyi.Stick.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Stick.mapper.ChatlistMapper;
import com.ruoyi.Stick.domain.Chatlist;
import com.ruoyi.Stick.service.IChatlistService;

/**
 * 评论列表Service业务层处理
 * 
 * @author 清
 * @date 2024-05-15
 */
@Service
public class ChatlistServiceImpl implements IChatlistService 
{
    @Autowired
    private ChatlistMapper chatlistMapper;

    /**
     * 查询评论列表
     * 
     * @param cid 评论列表主键
     * @return 评论列表
     */
    @Override
    public Chatlist selectChatlistByCid(Long cid)
    {
        return chatlistMapper.selectChatlistByCid(cid);
    }

    /**
     * 查询评论列表列表
     * 
     * @param chatlist 评论列表
     * @return 评论列表
     */
    @Override
    public List<Chatlist> selectChatlistList(Chatlist chatlist)
    {
        return chatlistMapper.selectChatlistList(chatlist);
    }

    /**
     * 新增评论列表
     * 
     * @param chatlist 评论列表
     * @return 结果
     */
    @Override
    public int insertChatlist(Chatlist chatlist)
    {
        return chatlistMapper.insertChatlist(chatlist);
    }

    /**
     * 修改评论列表
     * 
     * @param chatlist 评论列表
     * @return 结果
     */
    @Override
    public int updateChatlist(Chatlist chatlist)
    {
        return chatlistMapper.updateChatlist(chatlist);
    }

    /**
     * 批量删除评论列表
     * 
     * @param cids 需要删除的评论列表主键
     * @return 结果
     */
    @Override
    public int deleteChatlistByCids(Long[] cids)
    {
        return chatlistMapper.deleteChatlistByCids(cids);
    }

    /**
     * 删除评论列表信息
     * 
     * @param cid 评论列表主键
     * @return 结果
     */
    @Override
    public int deleteChatlistByCid(Long cid)
    {
        return chatlistMapper.deleteChatlistByCid(cid);
    }
}
