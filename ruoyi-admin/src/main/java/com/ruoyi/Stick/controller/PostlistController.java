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
import com.ruoyi.Stick.domain.Postlist;
import com.ruoyi.Stick.service.IPostlistService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 帖子列表Controller
 * 
 * @author 清
 * @date 2024-04-25
 */
@RestController
@RequestMapping("/Stick/postlist")
public class PostlistController extends BaseController
{
    @Autowired
    private IPostlistService postlistService;

    /**
     * 查询帖子列表列表
     */
    @PreAuthorize("@ss.hasPermi('Stick:postlist:list')")
    @GetMapping("/list")
    public TableDataInfo list(Postlist postlist)
    {
        startPage();
        List<Postlist> list = postlistService.selectPostlistList(postlist);
        return getDataTable(list);
    }

    /**
     * 导出帖子列表列表
     */
    @PreAuthorize("@ss.hasPermi('Stick:postlist:export')")
    @Log(title = "帖子列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Postlist postlist)
    {
        List<Postlist> list = postlistService.selectPostlistList(postlist);
        ExcelUtil<Postlist> util = new ExcelUtil<Postlist>(Postlist.class);
        util.exportExcel(response, list, "帖子列表数据");
    }

    /**
     * 获取帖子列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('Stick:postlist:query')")
    @GetMapping(value = "/{pid}")
    public AjaxResult getInfo(@PathVariable("pid") Long pid)
    {
        return success(postlistService.selectPostlistByPid(pid));
    }

    /**
     * 新增帖子列表
     */
    @PreAuthorize("@ss.hasPermi('Stick:postlist:add')")
    @Log(title = "帖子列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Postlist postlist)
    {
        return toAjax(postlistService.insertPostlist(postlist));
    }

    /**
     * 修改帖子列表
     */
    @PreAuthorize("@ss.hasPermi('Stick:postlist:edit')")
    @Log(title = "帖子列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Postlist postlist)
    {
        return toAjax(postlistService.updatePostlist(postlist));
    }

    /**
     * 删除帖子列表
     */
    @PreAuthorize("@ss.hasPermi('Stick:postlist:remove')")
    @Log(title = "帖子列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pids}")
    public AjaxResult remove(@PathVariable Long[] pids)
    {
        return toAjax(postlistService.deletePostlistByPids(pids));
    }
}
