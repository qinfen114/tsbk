package com.ruoyi.tta.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.tta.domain.TtaFriends;
import com.ruoyi.tta.service.ITtaFriendsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 好友列表Controller
 * 
 * @author 清
 * @date 2024-04-04
 */
@RestController
@RequestMapping("/tta/friends")
public class TtaFriendsController extends BaseController
{
    @Autowired
    private ITtaFriendsService ttaFriendsService;

    /**
     * 查询好友列表列表
     */
    @PreAuthorize("@ss.hasPermi('tta:friends:list')")
    @GetMapping("/list")
    public TableDataInfo list(TtaFriends ttaFriends)
    {
        startPage();
        List<TtaFriends> list = ttaFriendsService.selectTtaFriendsList(ttaFriends);
        return getDataTable(list);
    }

    /**
     * 导出好友列表列表
     */
    @PreAuthorize("@ss.hasPermi('tta:friends:export')")
    @Log(title = "好友列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TtaFriends ttaFriends)
    {
        List<TtaFriends> list = ttaFriendsService.selectTtaFriendsList(ttaFriends);
        ExcelUtil<TtaFriends> util = new ExcelUtil<TtaFriends>(TtaFriends.class);
        util.exportExcel(response, list, "好友列表数据");
    }

    /**
     * 获取好友列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('tta:friends:query')")
    @GetMapping(value = "/{chatId}")
    public AjaxResult getInfo(@PathVariable("chatId") Long chatId)
    {
        return success(ttaFriendsService.selectTtaFriendsByChatId(chatId));
    }

    /**
     * 新增好友列表
     */
    @PreAuthorize("@ss.hasPermi('tta:friends:add')")
    @Log(title = "好友列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TtaFriends ttaFriends)
    {
        return toAjax(ttaFriendsService.insertTtaFriends(ttaFriends));
    }

    /**
     * 修改好友列表
     */
    @PreAuthorize("@ss.hasPermi('tta:friends:edit')")
    @Log(title = "好友列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TtaFriends ttaFriends)
    {
        return toAjax(ttaFriendsService.updateTtaFriends(ttaFriends));
    }

    /**
     * 删除好友列表
     */
    @PreAuthorize("@ss.hasPermi('tta:friends:remove')")
    @Log(title = "好友列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{chatIds}")
    public AjaxResult remove(@PathVariable Long[] chatIds)
    {
        return toAjax(ttaFriendsService.deleteTtaFriendsByChatIds(chatIds));
    }
}
