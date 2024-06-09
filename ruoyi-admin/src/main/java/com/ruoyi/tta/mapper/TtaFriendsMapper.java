package com.ruoyi.tta.mapper;

import java.util.List;
import com.ruoyi.tta.domain.TtaFriends;

/**
 * 好友列表Mapper接口
 * 
 * @author 清
 * @date 2024-04-04
 */
public interface TtaFriendsMapper 
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
     * 删除好友列表
     * 
     * @param chatId 好友列表主键
     * @return 结果
     */
    public int deleteTtaFriendsByChatId(Long chatId);

    /**
     * 批量删除好友列表
     * 
     * @param chatIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTtaFriendsByChatIds(Long[] chatIds);
}
