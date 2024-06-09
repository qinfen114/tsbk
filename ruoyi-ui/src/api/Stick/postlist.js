import request from '@/utils/request'

// 查询帖子列表列表
export function listPostlist(query) {
  return request({
    url: '/Stick/postlist/list',
    method: 'get',
    params: query
  })
}

// 查询帖子列表详细
export function getPostlist(pid) {
  return request({
    url: '/Stick/postlist/' + pid,
    method: 'get'
  })
}

// 新增帖子列表
export function addPostlist(data) {
  return request({
    url: '/Stick/postlist',
    method: 'post',
    data: data
  })
}

// 修改帖子列表
export function updatePostlist(data) {
  return request({
    url: '/Stick/postlist',
    method: 'put',
    data: data
  })
}

// 删除帖子列表
export function delPostlist(pid) {
  return request({
    url: '/Stick/postlist/' + pid,
    method: 'delete'
  })
}
