import request from '@/utils/request'

// 查询软件库列表
export function listApplist(query) {
  return request({
    url: '/app/applist/list',
    method: 'get',
    params: query
  })
}

// 查询软件库详细
export function getApplist(id) {
  return request({
    url: '/app/applist/' + id,
    method: 'get'
  })
}

// 新增软件库
export function addApplist(data) {
  return request({
    url: '/app/applist',
    method: 'post',
    data: data
  })
}

// 修改软件库
export function updateApplist(data) {
  return request({
    url: '/app/applist',
    method: 'put',
    data: data
  })
}

// 删除软件库
export function delApplist(id) {
  return request({
    url: '/app/applist/' + id,
    method: 'delete'
  })
}
