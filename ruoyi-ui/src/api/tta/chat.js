import request from '@/utils/request'

// 查询消息列表列表
export function listChat(query) {
  return request({
    url: '/tta/chat/list',
    method: 'get',
    params: query
  })
}

// 查询消息列表详细
export function getChat(id) {
  return request({
    url: '/tta/chat/' + id,
    method: 'get'
  })
}

// 新增消息列表
export function addChat(data) {
  return request({
    url: '/tta/chat',
    method: 'post',
    data: data
  })
}

// 修改消息列表
export function updateChat(data) {
  return request({
    url: '/tta/chat',
    method: 'put',
    data: data
  })
}

// 删除消息列表
export function delChat(id) {
  return request({
    url: '/tta/chat/' + id,
    method: 'delete'
  })
}
