package com.ruoyi.tta.mapper;

import java.util.List;
import com.ruoyi.tta.domain.TtaChat;

/**
 * 消息列表Mapper接口
 * 
 * @author 清
 * @date 2024-04-04
 */
public interface TtaChatMapper 
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
     * 删除消息列表
     * 
     * @param id 消息列表主键
     * @return 结果
     */
    public int deleteTtaChatById(Long id);

    /**
     * 批量删除消息列表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTtaChatByIds(Long[] ids);
}
