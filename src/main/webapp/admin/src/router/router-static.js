import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/shijuanliebiao/exam'
    import luxiantuijian from '@/views/modules/luxiantuijian/list'
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import jiudianyuyue from '@/views/modules/jiudianyuyue/list'
    import kefuguanli from '@/views/modules/kefuguanli/list'
    import yonghu from '@/views/modules/yonghu/list'
    import tesechanpin from '@/views/modules/tesechanpin/list'
    import orders from '@/views/modules/orders/list'
    import jingdianjieshao from '@/views/modules/jingdianjieshao/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/luxiantuijian',
        name: '路线推荐',
        component: luxiantuijian
      }
          ,{
	path: '/forum',
        name: '论坛管理',
        component: forum
      }
          ,{
	path: '/news',
        name: '景点资讯',
        component: news
      }
          ,{
	path: '/jiudianyuyue',
        name: '酒店预约',
        component: jiudianyuyue
      }
          ,{
	path: '/kefuguanli',
        name: '客服管理',
        component: kefuguanli
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/tesechanpin',
        name: '特色产品',
        component: tesechanpin
      }
          ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
          ,{
	path: '/jingdianjieshao',
        name: '景点介绍',
        component: jingdianjieshao
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
