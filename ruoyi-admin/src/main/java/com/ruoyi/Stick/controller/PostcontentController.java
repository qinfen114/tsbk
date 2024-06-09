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
import com.ruoyi.Stick.domain.Postcontent;
import com.ruoyi.Stick.service.IPostcontentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 帖子详情Controller
 * 
 * @author 清
 * @date 2024-05-08
 */
@RestController
@RequestMapping("/Stick/postcontent")
public class PostcontentController extends BaseController
{
    @Autowired
    private IPostcontentService postcontentService;

    /**
     * 查询帖子详情列表
     */
    @PreAuthorize("@ss.hasPermi('Stick:postcontent:list')")
    @GetMapping("/list")
    public TableDataInfo list(Postcontent postcontent)
    {
        startPage();
        List<Postcontent> list = postcontentService.selectPostcontentList(postcontent);
        return getDataTable(list);
    }

    /**
     * 导出帖子详情列表
     */
    @PreAuthorize("@ss.hasPermi('Stick:postcontent:export')")
    @Log(title = "帖子详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Postcontent postcontent)
    {
        List<Postcontent> list = postcontentService.selectPostcontentList(postcontent);
        ExcelUtil<Postcontent> util = new ExcelUtil<Postcontent>(Postcontent.class);
        util.exportExcel(response, list, "帖子详情数据");
    }

    /**
     * 获取帖子详情详细信息
     */
    @PreAuthorize("@ss.hasPermi('Stick:postcontent:query')")
    @GetMapping(value = "/{pid}")
    public AjaxResult getInfo(@PathVariable("pid") Long pid)
    {
        return success(postcontentService.selectPostcontentByPid(pid));
    }

    /**
     * 新增帖子详情
     */
    @PreAuthorize("@ss.hasPermi('Stick:postcontent:add')")
    @Log(title = "帖子详情", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Postcontent postcontent)
    {
        return toAjax(postcontentService.insertPostcontent(postcontent));
    }

    /**
     * 修改帖子详情
     */
    @PreAuthorize("@ss.hasPermi('Stick:postcontent:edit')")
    @Log(title = "帖子详情", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Postcontent postcontent)
    {
        return toAjax(postcontentService.updatePostcontent(postcontent));
    }

    /**
     * 删除帖子详情
     */
    @PreAuthorize("@ss.hasPermi('Stick:postcontent:remove')")
    @Log(title = "帖子详情", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pids}")
    public AjaxResult remove(@PathVariable Long[] pids)
    {
        return toAjax(postcontentService.deletePostcontentByPids(pids));
    }
}
