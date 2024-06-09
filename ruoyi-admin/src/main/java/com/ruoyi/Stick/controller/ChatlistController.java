package com.ruoyi.Stick.controller;

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
import com.ruoyi.Stick.domain.Chatlist;
import com.ruoyi.Stick.service.IChatlistService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 评论列表Controller
 * 
 * @author 清
 * @date 2024-05-15
 */
@RestController
@RequestMapping("/Stick/chatlist")
public class ChatlistController extends BaseController
{
    @Autowired
    private IChatlistService chatlistService;

    /**
     * 查询评论列表列表
     */
    @PreAuthorize("@ss.hasPermi('Stick:chatlist:list')")
    @GetMapping("/list")
    public TableDataInfo list(Chatlist chatlist)
    {
        startPage();
        List<Chatlist> list = chatlistService.selectChatlistList(chatlist);
        return getDataTable(list);
    }

    /**
     * 导出评论列表列表
     */
    @PreAuthorize("@ss.hasPermi('Stick:chatlist:export')")
    @Log(title = "评论列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Chatlist chatlist)
    {
        List<Chatlist> list = chatlistService.selectChatlistList(chatlist);
        ExcelUtil<Chatlist> util = new ExcelUtil<Chatlist>(Chatlist.class);
        util.exportExcel(response, list, "评论列表数据");
    }

    /**
     * 获取评论列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('Stick:chatlist:query')")
    @GetMapping(value = "/{cid}")
    public AjaxResult getInfo(@PathVariable("cid") Long cid)
    {
        return success(chatlistService.selectChatlistByCid(cid));
    }

    /**
     * 新增评论列表
     */
    @PreAuthorize("@ss.hasPermi('Stick:chatlist:add')")
    @Log(title = "评论列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Chatlist chatlist)
    {
        return toAjax(chatlistService.insertChatlist(chatlist));
    }

    /**
     * 修改评论列表
     */
    @PreAuthorize("@ss.hasPermi('Stick:chatlist:edit')")
    @Log(title = "评论列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Chatlist chatlist)
    {
        return toAjax(chatlistService.updateChatlist(chatlist));
    }

    /**
     * 删除评论列表
     */
    @PreAuthorize("@ss.hasPermi('Stick:chatlist:remove')")
    @Log(title = "评论列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cids}")
    public AjaxResult remove(@PathVariable Long[] cids)
    {
        return toAjax(chatlistService.deleteChatlistByCids(cids));
    }
}
