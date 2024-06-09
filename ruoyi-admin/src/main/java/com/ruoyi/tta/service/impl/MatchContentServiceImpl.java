package com.ruoyi.tta.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.tta.mapper.MatchContentMapper;
import com.ruoyi.tta.domain.MatchContent;
import com.ruoyi.tta.service.IMatchContentService;

/**
 * 对局信息Service业务层处理
 * 
 * @author 清
 * @date 2024-04-04
 */
@Service
public class MatchContentServiceImpl implements IMatchContentService 
{
    @Autowired
    private MatchContentMapper matchContentMapper;

    /**
     * 查询对局信息
     * 
     * @param id 对局信息主键
     * @return 对局信息
     */
    @Override
    public MatchContent selectMatchContentById(Long id)
    {
        return matchContentMapper.selectMatchContentById(id);
    }

    /**
     * 查询对局信息列表
     * 
     * @param matchContent 对局信息
     * @return 对局信息
     */
    @Override
    public List<MatchContent> selectMatchContentList(MatchContent matchContent)
    {
        return matchContentMapper.selectMatchContentList(matchContent);
    }

    /**
     * 新增对局信息
     * 
     * @param matchContent 对局信息
     * @return 结果
     */
    @Override
    public int insertMatchContent(MatchContent matchContent)
    {
        return matchContentMapper.insertMatchContent(matchContent);
    }

    /**
     * 修改对局信息
     * 
     * @param matchContent 对局信息
     * @return 结果
     */
    @Override
    public int updateMatchContent(MatchContent matchContent)
    {
        return matchContentMapper.updateMatchContent(matchContent);
    }

    /**
     * 批量删除对局信息
     * 
     * @param ids 需要删除的对局信息主键
     * @return 结果
     */
    @Override
    public int deleteMatchContentByIds(Long[] ids)
    {
        return matchContentMapper.deleteMatchContentByIds(ids);
    }

    /**
     * 删除对局信息信息
     * 
     * @param id 对局信息主键
     * @return 结果
     */
    @Override
    public int deleteMatchContentById(Long id)
    {
        return matchContentMapper.deleteMatchContentById(id);
    }
}
