package com.ruoyi.tta.service;

import java.util.List;
import com.ruoyi.tta.domain.TtaFriends;

/**
 * 好友列表Service接口
 * 
 * @author 清
 * @date 2024-04-04
 */
public interface ITtaFriendsService 
{
    /**
     * 查询好友列表
     * 
     * @param chatId 好友列表主键
     * @return 好友列表
     */
    public TtaFriends selectTtaFriendsByChatId(Long chatId);

    /**
     * 查询好友列表列表
     * 
     * @param ttaFriends 好友列表
     * @return 好友列表集合
     */
    public List<TtaFriends> selectTtaFriendsList(TtaFriends ttaFriends);

    /**
     * 新增好友列表
     * 
     * @param ttaFriends 好友列表
     * @return 结果
     */
    public int insertTtaFriends(TtaFriends ttaFriends);

    /**
     * 修改好友列表
     * 
     * @param ttaFriends 好友列表
     * @return 结果
     */
    public int updateTtaFriends(TtaFriends ttaFriends);

    /**
     * 批量删除好友列表
     * 
     * @param chatIds 需要删除的好友列表主键集合
     * @return 结果
     */
    public int deleteTtaFriendsByChatIds(Long[] chatIds);

    /**
     * 删除好友列表信息
     * 
     * @param chatId 好友列表主键
     * @return 结果
     */
    public int deleteTtaFriendsByChatId(Long chatId);
}
