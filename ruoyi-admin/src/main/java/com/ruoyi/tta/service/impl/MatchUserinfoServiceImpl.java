package com.ruoyi.tta.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.tta.mapper.MatchUserinfoMapper;
import com.ruoyi.tta.domain.MatchUserinfo;
import com.ruoyi.tta.service.IMatchUserinfoService;

/**
 * 对局面板Service业务层处理
 * 
 * @author 清
 * @date 2024-04-04
 */
@Service
public class MatchUserinfoServiceImpl implements IMatchUserinfoService 
{
    @Autowired
    private MatchUserinfoMapper matchUserinfoMapper;

    /**
     * 查询对局面板
     * 
     * @param id 对局面板主键
     * @return 对局面板
     */
    @Override
    public MatchUserinfo selectMatchUserinfoById(Long id)
    {
        return matchUserinfoMapper.selectMatchUserinfoById(id);
    }

    /**
     * 查询对局面板列表
     * 
     * @param matchUserinfo 对局面板
     * @return 对局面板
     */
    @Override
    public List<MatchUserinfo> selectMatchUserinfoList(MatchUserinfo matchUserinfo)
    {
        return matchUserinfoMapper.selectMatchUserinfoList(matchUserinfo);
    }

    /**
     * 新增对局面板
     * 
     * @param matchUserinfo 对局面板
     * @return 结果
     */
    @Override
    public int insertMatchUserinfo(MatchUserinfo matchUserinfo)
    {
        return matchUserinfoMapper.insertMatchUserinfo(matchUserinfo);
    }

    /**
     * 修改对局面板
     * 
     * @param matchUserinfo 对局面板
     * @return 结果
     */
    @Override
    public int updateMatchUserinfo(MatchUserinfo matchUserinfo)
    {
        return matchUserinfoMapper.updateMatchUserinfo(matchUserinfo);
    }

    /**
     * 批量删除对局面板
     * 
     * @param ids 需要删除的对局面板主键
     * @return 结果
     */
    @Override
    public int deleteMatchUserinfoByIds(Long[] ids)
    {
        return matchUserinfoMapper.deleteMatchUserinfoByIds(ids);
    }

    /**
     * 删除对局面板信息
     * 
     * @param id 对局面板主键
     * @return 结果
     */
    @Override
    public int deleteMatchUserinfoById(Long id)
    {
        return matchUserinfoMapper.deleteMatchUserinfoById(id);
    }
}
