package com.ruoyi.tta.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.tta.mapper.TtaFriendsMapper;
import com.ruoyi.tta.domain.TtaFriends;
import com.ruoyi.tta.service.ITtaFriendsService;

/**
 * 好友列表Service业务层处理
 * 
 * @author 清
 * @date 2024-04-04
 */
@Service
public class TtaFriendsServiceImpl implements ITtaFriendsService 
{
    @Autowired
    private TtaFriendsMapper ttaFriendsMapper;

    /**
     * 查询好友列表
     * 
     * @param chatId 好友列表主键
     * @return 好友列表
     */
    @Override
    public TtaFriends selectTtaFriendsByChatId(Long chatId)
    {
        return ttaFriendsMapper.selectTtaFriendsByChatId(chatId);
    }

    /**
     * 查询好友列表列表
     * 
     * @param ttaFriends 好友列表
     * @return 好友列表
     */
    @Override
    public List<TtaFriends> selectTtaFriendsList(TtaFriends ttaFriends)
    {
        return ttaFriendsMapper.selectTtaFriendsList(ttaFriends);
    }

    /**
     * 新增好友列表
     * 
     * @param ttaFriends 好友列表
     * @return 结果
     */
    @Override
    public int insertTtaFriends(TtaFriends ttaFriends)
    {
        return ttaFriendsMapper.insertTtaFriends(ttaFriends);
    }

    /**
     * 修改好友列表
     * 
     * @param ttaFriends 好友列表
     * @return 结果
     */
    @Override
    public int updateTtaFriends(TtaFriends ttaFriends)
    {
        return ttaFriendsMapper.updateTtaFriends(ttaFriends);
    }

    /**
     * 批量删除好友列表
     * 
     * @param chatIds 需要删除的好友列表主键
     * @return 结果
     */
    @Override
    public int deleteTtaFriendsByChatIds(Long[] chatIds)
    {
        return ttaFriendsMapper.deleteTtaFriendsByChatIds(chatIds);
    }

    /**
     * 删除好友列表信息
     * 
     * @param chatId 好友列表主键
     * @return 结果
     */
    @Override
    public int deleteTtaFriendsByChatId(Long chatId)
    {
        return ttaFriendsMapper.deleteTtaFriendsByChatId(chatId);
    }
}
