package com.ruoyi.Stick.service;

import java.util.List;
import com.ruoyi.Stick.domain.Members;

/**
 * 成员列表Service接口
 * 
 * @author 清
 * @date 2024-04-25
 */
public interface IMembersService 
{
    /**
     * 查询成员列表
     * 
     * @param uid 成员列表主键
     * @return 成员列表
     */
    public Members selectMembersByUid(Long uid);

    /**
     * 查询成员列表列表
     * 
     * @param members 成员列表
     * @return 成员列表集合
     */
    public List<Members> selectMembersList(Members members);

    /**
     * 新增成员列表
     * 
     * @param members 成员列表
     * @return 结果
     */
    public int insertMembers(Members members);

    /**
     * 修改成员列表
     * 
     * @param members 成员列表
     * @return 结果
     */
    public int updateMembers(Members members);

    /**
     * 批量删除成员列表
     * 
     * @param uids 需要删除的成员列表主键集合
     * @return 结果
     */
    public int deleteMembersByUids(Long[] uids);

    /**
     * 删除成员列表信息
     * 
     * @param uid 成员列表主键
     * @return 结果
     */
    public int deleteMembersByUid(Long uid);
}
