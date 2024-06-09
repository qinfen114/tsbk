package com.ruoyi.tta.mapper;

import java.util.List;
import com.ruoyi.tta.domain.Matchs;

/**
 * 对局列表Mapper接口
 * 
 * @author 清
 * @date 2024-04-04
 */
public interface MatchsMapper 
{
    /**
     * 查询对局列表
     * 
     * @param id 对局列表主键
     * @return 对局列表
     */
    public Matchs selectMatchsById(Long id);

    /**
     * 查询对局列表列表
     * 
     * @param matchs 对局列表
     * @return 对局列表集合
     */
    public List<Matchs> selectMatchsList(Matchs matchs);

    /**
     * 新增对局列表
     * 
     * @param matchs 对局列表
     * @return 结果
     */
    public int insertMatchs(Matchs matchs);

    /**
     * 修改对局列表
     * 
     * @param matchs 对局列表
     * @return 结果
     */
    public int updateMatchs(Matchs matchs);

    /**
     * 删除对局列表
     * 
     * @param id 对局列表主键
     * @return 结果
     */
    public int deleteMatchsById(Long id);

    /**
     * 批量删除对局列表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMatchsByIds(Long[] ids);
}
