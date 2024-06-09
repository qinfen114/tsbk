package com.ruoyi.tta.mapper;

import java.util.List;
import com.ruoyi.tta.domain.MatchUserinfo;

/**
 * 对局面板Mapper接口
 * 
 * @author 清
 * @date 2024-04-04
 */
public interface MatchUserinfoMapper 
{
    /**
     * 查询对局面板
     * 
     * @param id 对局面板主键
     * @return 对局面板
     */
    public MatchUserinfo selectMatchUserinfoById(Long id);

    /**
     * 查询对局面板列表
     * 
     * @param matchUserinfo 对局面板
     * @return 对局面板集合
     */
    public List<MatchUserinfo> selectMatchUserinfoList(MatchUserinfo matchUserinfo);

    /**
     * 新增对局面板
     * 
     * @param matchUserinfo 对局面板
     * @return 结果
     */
    public int insertMatchUserinfo(MatchUserinfo matchUserinfo);

    /**
     * 修改对局面板
     * 
     * @param matchUserinfo 对局面板
     * @return 结果
     */
    public int updateMatchUserinfo(MatchUserinfo matchUserinfo);

    /**
     * 删除对局面板
     * 
     * @param id 对局面板主键
     * @return 结果
     */
    public int deleteMatchUserinfoById(Long id);

    /**
     * 批量删除对局面板
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMatchUserinfoByIds(Long[] ids);
}
