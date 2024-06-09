package com.ruoyi.tta.service;

import java.util.List;
import com.ruoyi.tta.domain.TtaChat;

/**
 * 消息列表Service接口
 * 
 * @author 清
 * @date 2024-04-04
 */
public interface ITtaChatService 
{
    /**
     * 查询消息列表
     * 
     * @param id 消息列表主键
     * @return 消息列表
     */
    public TtaChat selectTtaChatById(Long id);

    /**
     * 查询消息列表列表
     * 
     * @param ttaChat 消息列表
     * @return 消息列表集合
     */
    public List<TtaChat> selectTtaChatList(TtaChat ttaChat);

    /**
     * 新增消息列表
     * 
     * @param ttaChat 消息列表
     * @return 结果
     */
    public int insertTtaChat(TtaChat ttaChat);

    /**
     * 修改消息列表
     * 
     * @param ttaChat 消息列表
     * @return 结果
     */
    public int updateTtaChat(TtaChat ttaChat);

    /**
     * 批量删除消息列表
     * 
     * @param ids 需要删除的消息列表主键集合
     * @return 结果
     */
    public int deleteTtaChatByIds(Long[] ids);

    /**
     * 删除消息列表信息
     * 
     * @param id 消息列表主键
     * @return 结果
     */
    public int deleteTtaChatById(Long id);
}
