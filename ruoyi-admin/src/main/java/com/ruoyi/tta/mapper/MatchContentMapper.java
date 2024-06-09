package com.ruoyi.tta.mapper;

import java.util.List;
import com.ruoyi.tta.domain.MatchContent;

/**
 * 对局信息Mapper接口
 * 
 * @author 清
 * @date 2024-04-04
 */
public interface MatchContentMapper 
{
    /**
     * 查询对局信息
     * 
     * @param id 对局信息主键
     * @return 对局信息
     */
    public MatchContent selectMatchContentById(Long id);

    /**
     * 查询对局信息列表
     * 
     * @param matchContent 对局信息
     * @return 对局信息集合
     */
    public List<MatchContent> selectMatchContentList(MatchContent matchContent);

    /**
     * 新增对局信息
     * 
     * @param matchContent 对局信息
     * @return 结果
     */
    public int insertMatchContent(MatchContent matchContent);

    /**
     * 修改对局信息
     * 
     * @param matchContent 对局信息
     * @return 结果
     */
    public int updateMatchContent(MatchContent matchContent);

    /**
     * 删除对局信息
     * 
     * @param id 对局信息主键
     * @return 结果
     */
    public int deleteMatchContentById(Long id);

    /**
     * 批量删除对局信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMatchContentByIds(Long[] ids);
}
