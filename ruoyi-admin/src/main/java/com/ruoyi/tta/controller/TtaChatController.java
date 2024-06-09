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
import com.ruoyi.tta.domain.TtaChat;
import com.ruoyi.tta.service.ITtaChatService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 消息列表Controller
 * 
 * @author 清
 * @date 2024-04-04
 */
@RestController
@RequestMapping("/tta/chat")
public class TtaChatController extends BaseController
{
    @Autowired
    private ITtaChatService ttaChatService;

    /**
     * 查询消息列表列表
     */
    @PreAuthorize("@ss.hasPermi('tta:chat:list')")
    @GetMapping("/list")
    public TableDataInfo list(TtaChat ttaChat)
    {
        startPage();
        List<TtaChat> list = ttaChatService.selectTtaChatList(ttaChat);
        return getDataTable(list);
    }

    /**
     * 导出消息列表列表
     */
    @PreAuthorize("@ss.hasPermi('tta:chat:export')")
    @Log(title = "消息列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TtaChat ttaChat)
    {
        List<TtaChat> list = ttaChatService.selectTtaChatList(ttaChat);
        ExcelUtil<TtaChat> util = new ExcelUtil<TtaChat>(TtaChat.class);
        util.exportExcel(response, list, "消息列表数据");
    }

    /**
     * 获取消息列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('tta:chat:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ttaChatService.selectTtaChatById(id));
    }

    /**
     * 新增消息列表
     */
    @PreAuthorize("@ss.hasPermi('tta:chat:add')")
    @Log(title = "消息列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TtaChat ttaChat)
    {
        return toAjax(ttaChatService.insertTtaChat(ttaChat));
    }

    /**
     * 修改消息列表
     */
    @PreAuthorize("@ss.hasPermi('tta:chat:edit')")
    @Log(title = "消息列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TtaChat ttaChat)
    {
        return toAjax(ttaChatService.updateTtaChat(ttaChat));
    }

    /**
     * 删除消息列表
     */
    @PreAuthorize("@ss.hasPermi('tta:chat:remove')")
    @Log(title = "消息列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ttaChatService.deleteTtaChatByIds(ids));
    }
}
