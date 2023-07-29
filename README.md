# EventManage
1.后管只允许root用户使用，没有登陆登出操作
2.可以编辑用户，添加新的用户和给用户赋权
添加用户 /login/addUser
获取密码，用于添加用户 /login/getRandomPassword
3.最左边的menu页面，提供模糊查询显示
获取menu内容 /permission/getMenuList
4.右边默认显示的是dashboard
5.右边第二个tab是first event class
下拉框中的eventType /class/getAllType
搜索first event /class/getClass
添加first event /class/addClass
编辑first event /class/updateClass
6.右边第三个tab是sub event class
通过点击第二个tab/打开第三个tab展示sub event class /subClass/getClass
通过点击第二个tab后可以添加sub event class /subClass/addClass
sub event class某条数据更新 /subClass/updateClass
7.通过点击某个sub event class进入sub event明细
获取城市信息 /subClass/getCityList
添加sub event明细 /subClassDetail/addInfo
8.右边第四个tab是用户menu权限
获取所有用户除admin用户 /permission/getUserList
给用户添加menu权限 /permission/addUserPermission
