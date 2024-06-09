import request from '@/utils/request'

// 查询帖子详情列表
export function listPostcontent(query) {
  return request({
    url: '/Stick/postcontent/list',
    method: 'get',
    params: query
  })
}

// 查询帖子详情详细
export function getPostcontent(pid) {
  return request({
    url: '/Stick/postcontent/' + pid,
    method: 'get'
  })
}

// 新增帖子详情
export function addPostcontent(data) {
  return request({
    url: '/Stick/postcontent',
    method: 'post',
    data: data
  })
}

// 修改帖子详情
export function updatePostcontent(data) {
  return request({
    url: '/Stick/postcontent',
    method: 'put',
    data: data
  })
}

// 删除帖子详情
export function delPostcontent(pid) {
  return request({
    url: '/Stick/postcontent/' + pid,
    method: 'delete'
  })
}
