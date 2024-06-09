package com.ruoyi.tta.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.tta.mapper.TtaChatMapper;
import com.ruoyi.tta.domain.TtaChat;
import com.ruoyi.tta.service.ITtaChatService;

/**
 * 消息列表Service业务层处理
 * 
 * @author 清
 * @date 2024-04-04
 */
@Service
public class TtaChatServiceImpl implements ITtaChatService 
{
    @Autowired
    private TtaChatMapper ttaChatMapper;

    /**
     * 查询消息列表
     * 
     * @param id 消息列表主键
     * @return 消息列表
     */
    @Override
    public TtaChat selectTtaChatById(Long id)
    {
        return ttaChatMapper.selectTtaChatById(id);
    }

    /**
     * 查询消息列表列表
     * 
     * @param ttaChat 消息列表
     * @return 消息列表
     */
    @Override
    public List<TtaChat> selectTtaChatList(TtaChat ttaChat)
    {
        return ttaChatMapper.selectTtaChatList(ttaChat);
    }

    /**
     * 新增消息列表
     * 
     * @param ttaChat 消息列表
     * @return 结果
     */
    @Override
    public int insertTtaChat(TtaChat ttaChat)
    {
        return ttaChatMapper.insertTtaChat(ttaChat);
    }

    /**
     * 修改消息列表
     * 
     * @param ttaChat 消息列表
     * @return 结果
     */
    @Override
    public int updateTtaChat(TtaChat ttaChat)
    {
        return ttaChatMapper.updateTtaChat(ttaChat);
    }

    /**
     * 批量删除消息列表
     * 
     * @param ids 需要删除的消息列表主键
     * @return 结果
     */
    @Override
    public int deleteTtaChatByIds(Long[] ids)
    {
        return ttaChatMapper.deleteTtaChatByIds(ids);
    }

    /**
     * 删除消息列表信息
     * 
     * @param id 消息列表主键
     * @return 结果
     */
    @Override
    public int deleteTtaChatById(Long id)
    {
        return ttaChatMapper.deleteTtaChatById(id);
    }
}
