package com.ruoyi.Stick.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Stick.mapper.MembersMapper;
import com.ruoyi.Stick.domain.Members;
import com.ruoyi.Stick.service.IMembersService;

/**
 * 成员列表Service业务层处理
 * 
 * @author 清
 * @date 2024-04-25
 */
@Service
public class MembersServiceImpl implements IMembersService 
{
    @Autowired
    private MembersMapper membersMapper;

    /**
     * 查询成员列表
     * 
     * @param uid 成员列表主键
     * @return 成员列表
     */
    @Override
    public Members selectMembersByUid(Long uid)
    {
        return membersMapper.selectMembersByUid(uid);
    }

    /**
     * 查询成员列表列表
     * 
     * @param members 成员列表
     * @return 成员列表
     */
    @Override
    public List<Members> selectMembersList(Members members)
    {
        return membersMapper.selectMembersList(members);
    }

    /**
     * 新增成员列表
     * 
     * @param members 成员列表
     * @return 结果
     */
    @Override
    public int insertMembers(Members members)
    {
        return membersMapper.insertMembers(members);
    }

    /**
     * 修改成员列表
     * 
     * @param members 成员列表
     * @return 结果
     */
    @Override
    public int updateMembers(Members members)
    {
        return membersMapper.updateMembers(members);
    }

    /**
     * 批量删除成员列表
     * 
     * @param uids 需要删除的成员列表主键
     * @return 结果
     */
    @Override
    public int deleteMembersByUids(Long[] uids)
    {
        return membersMapper.deleteMembersByUids(uids);
    }

    /**
     * 删除成员列表信息
     * 
     * @param uid 成员列表主键
     * @return 结果
     */
    @Override
    public int deleteMembersByUid(Long uid)
    {
        return membersMapper.deleteMembersByUid(uid);
    }
}
