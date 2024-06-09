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
import com.ruoyi.tta.domain.MatchUserinfo;
import com.ruoyi.tta.service.IMatchUserinfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 对局面板Controller
 * 
 * @author 清
 * @date 2024-04-04
 */
@RestController
@RequestMapping("/tta/userinfo")
public class MatchUserinfoController extends BaseController
{
    @Autowired
    private IMatchUserinfoService matchUserinfoService;

    /**
     * 查询对局面板列表
     */
    @PreAuthorize("@ss.hasPermi('tta:userinfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(MatchUserinfo matchUserinfo)
    {
        startPage();
        List<MatchUserinfo> list = matchUserinfoService.selectMatchUserinfoList(matchUserinfo);
        return getDataTable(list);
    }

    /**
     * 导出对局面板列表
     */
    @PreAuthorize("@ss.hasPermi('tta:userinfo:export')")
    @Log(title = "对局面板", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MatchUserinfo matchUserinfo)
    {
        List<MatchUserinfo> list = matchUserinfoService.selectMatchUserinfoList(matchUserinfo);
        ExcelUtil<MatchUserinfo> util = new ExcelUtil<MatchUserinfo>(MatchUserinfo.class);
        util.exportExcel(response, list, "对局面板数据");
    }

    /**
     * 获取对局面板详细信息
     */
    @PreAuthorize("@ss.hasPermi('tta:userinfo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(matchUserinfoService.selectMatchUserinfoById(id));
    }

    /**
     * 新增对局面板
     */
    @PreAuthorize("@ss.hasPermi('tta:userinfo:add')")
    @Log(title = "对局面板", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MatchUserinfo matchUserinfo)
    {
        return toAjax(matchUserinfoService.insertMatchUserinfo(matchUserinfo));
    }

    /**
     * 修改对局面板
     */
    @PreAuthorize("@ss.hasPermi('tta:userinfo:edit')")
    @Log(title = "对局面板", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MatchUserinfo matchUserinfo)
    {
        return toAjax(matchUserinfoService.updateMatchUserinfo(matchUserinfo));
    }

    /**
     * 删除对局面板
     */
    @PreAuthorize("@ss.hasPermi('tta:userinfo:remove')")
    @Log(title = "对局面板", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(matchUserinfoService.deleteMatchUserinfoByIds(ids));
    }
}
