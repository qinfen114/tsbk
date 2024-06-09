package com.ruoyi.tta.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.tta.mapper.MatchsMapper;
import com.ruoyi.tta.domain.Matchs;
import com.ruoyi.tta.service.IMatchsService;

/**
 * 对局列表Service业务层处理
 * 
 * @author 清
 * @date 2024-04-04
 */
@Service
public class MatchsServiceImpl implements IMatchsService 
{
    @Autowired
    private MatchsMapper matchsMapper;

    /**
     * 查询对局列表
     * 
     * @param id 对局列表主键
     * @return 对局列表
     */
    @Override
    public Matchs selectMatchsById(Long id)
    {
        return matchsMapper.selectMatchsById(id);
    }

    /**
     * 查询对局列表列表
     * 
     * @param matchs 对局列表
     * @return 对局列表
     */
    @Override
    public List<Matchs> selectMatchsList(Matchs matchs)
    {
        return matchsMapper.selectMatchsList(matchs);
    }

    /**
     * 新增对局列表
     * 
     * @param matchs 对局列表
     * @return 结果
     */
    @Override
    public int insertMatchs(Matchs matchs)
    {
        matchs.setCreateTime(DateUtils.getNowDate());
        return matchsMapper.insertMatchs(matchs);
    }

    /**
     * 修改对局列表
     * 
     * @param matchs 对局列表
     * @return 结果
     */
    @Override
    public int updateMatchs(Matchs matchs)
    {
        return matchsMapper.updateMatchs(matchs);
    }

    /**
     * 批量删除对局列表
     * 
     * @param ids 需要删除的对局列表主键
     * @return 结果
     */
    @Override
    public int deleteMatchsByIds(Long[] ids)
    {
        return matchsMapper.deleteMatchsByIds(ids);
    }

    /**
     * 删除对局列表信息
     * 
     * @param id 对局列表主键
     * @return 结果
     */
    @Override
    public int deleteMatchsById(Long id)
    {
        return matchsMapper.deleteMatchsById(id);
    }
}
