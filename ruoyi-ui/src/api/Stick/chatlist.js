import request from '@/utils/request'

// 查询评论列表列表
export function listChatlist(query) {
  return request({
    url: '/Stick/chatlist/list',
    method: 'get',
    params: query
  })
}

// 查询评论列表详细
export function getChatlist(cid) {
  return request({
    url: '/Stick/chatlist/' + cid,
    method: 'get'
  })
}

// 新增评论列表
export function addChatlist(data) {
  return request({
    url: '/Stick/chatlist',
    method: 'post',
    data: data
  })
}

// 修改评论列表
export function updateChatlist(data) {
  return request({
    url: '/Stick/chatlist',
    method: 'put',
    data: data
  })
}

// 删除评论列表
export function delChatlist(cid) {
  return request({
    url: '/Stick/chatlist/' + cid,
    method: 'delete'
  })
}
